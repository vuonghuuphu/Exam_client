package com.example.exam_client.edit;

import com.example.exam_client.Employee;
import com.example.exam_client.EmployeeService;
import com.example.exam_client.RetrofitServiceGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Update extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        EmployeeService productService = RetrofitServiceGenerator.createService(EmployeeService.class);
        Employee p = productService.detail(id).execute().body();
        req.setAttribute("d", p);
        req.getRequestDispatcher("/update.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("Id"));
        String Name = req.getParameter("Name");
        int Price = Integer.parseInt(req.getParameter("Price"));
        EmployeeService productService = RetrofitServiceGenerator.createService(EmployeeService.class);
        productService.update(id,new Employee(id,Name,Price)).execute();
        resp.sendRedirect("/List");
    }
}
