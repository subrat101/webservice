package com.springapp.services;

import com.springapp.models.Employee;

import java.util.List;

/**
 * Created by alexfernandezwhiteskylabs on 12/4/14.
 */
public interface DataServices {
    public boolean addEntity(Employee employee) throws Exception;
    public Employee getEntityById(long id) throws Exception;
    public List<Employee> getEntityList() throws Exception;
    public boolean deleteEntity(long id) throws Exception;
}