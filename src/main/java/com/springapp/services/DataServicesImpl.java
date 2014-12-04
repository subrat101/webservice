package com.springapp.services;

import com.springapp.dao.DataDao;
import com.springapp.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by alexfernandezwhiteskylabs on 12/4/14.
 */
public class DataServicesImpl implements DataServices {

    @Autowired
    DataDao dataDao;

    @Override
    public boolean addEntity(Employee employee) throws Exception {
        return dataDao.addEntity(employee);
    }

    @Override
    public Employee getEntityById(long id) throws Exception {
        return dataDao.getEntityById(id);
    }

    @Override
    public List<Employee> getEntityList() throws Exception {
        return dataDao.getEntityList();
    }

    @Override
    public boolean deleteEntity(long id) throws Exception {
        return dataDao.deleteEntity(id);
    }
}
