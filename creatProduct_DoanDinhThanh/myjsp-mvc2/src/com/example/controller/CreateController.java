package com.example.controller;

import com.example.entity.Product;
import com.example.model.CreateBean;
import com.example.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "CreateController")
public class CreateController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String pro_desc = request.getParameter("pro_desc");

        Product product = new Product();

        product.setName(name);
        product.setPro_desc(pro_desc);
        if (CreateBean.insertProduct(id,name,pro_desc)){
            HttpSession httpSession = request.getSession(false);
            httpSession.setAttribute("product",product);
            response.sendRedirect("success.jsp");
        }else {
            response.sendRedirect("fail.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
