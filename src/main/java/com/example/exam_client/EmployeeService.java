package com.example.exam_client;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface EmployeeService {
    @GET("/api/employee")
    public Call<List<Employee>> getlist();
    @POST("/api/employee")
    public Call<Employee> add(@Body Employee employee);
    @GET("/api/employee/{id}")
    public Call<Employee> detail(@Path("id")int id);
    @PUT("/api/employee/{id}")
    public Call<Employee> update(@Path("id")int id,@Body Employee employee);
}
