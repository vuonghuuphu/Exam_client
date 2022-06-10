package com.example.exam_client.list;

import com.example.exam_client.Employee;
import com.example.exam_client.EmployeeService;
import com.example.exam_client.RetrofitServiceGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Liste extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("list");
        EmployeeService productService = RetrofitServiceGenerator.createService(EmployeeService.class);
        List<Employee> list = productService.getlist().execute().body();
        req.setAttribute("l",list);
        req.getRequestDispatcher("/list.jsp").forward(req,resp);
    }
}
