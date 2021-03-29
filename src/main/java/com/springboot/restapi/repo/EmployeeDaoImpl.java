package com.springboot.restapi.repo;

import com.springboot.restapi.model.Employee;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class EmployeeDaoImpl implements EmployeeDao{

    private final EntityManager entityManager;
//
//    @Autowired
//    public EmployeeDaoImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//
//    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);
        List<Employee> employees = query.getResultList();
        return employees;
    }
}
