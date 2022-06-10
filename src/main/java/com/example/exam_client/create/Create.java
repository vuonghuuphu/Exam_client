package com.example.exam_client.create;

import com.example.exam_client.Employee;
import com.example.exam_client.EmployeeService;
import com.example.exam_client.RetrofitServiceGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Create extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/Create.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Name = req.getParameter("Name");
        int Price = Integer.parseInt(req.getParameter("Price"));
        EmployeeService productService = RetrofitServiceGenerator.createService(EmployeeService.class);
        productService.add(new Employee(Name,Price)).execute();
        resp.sendRedirect("/List");

    }
}
