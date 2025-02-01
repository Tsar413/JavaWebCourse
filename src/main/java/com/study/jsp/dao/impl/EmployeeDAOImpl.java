package com.study.jsp.dao.impl;

import com.study.jsp.dao.EmployeeDAO;
import com.study.jsp.entity.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class EmployeeDAOImpl implements EmployeeDAO {
    private final JdbcTemplate jdbcTemplate;

    public EmployeeDAOImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Employee> getList() {
        String sql = "select * from t_emp;";
        List<Employee> list = jdbcTemplate.query(sql, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee = new Employee();
                employee.setId(Integer.parseInt(resultSet.getString("id")));
                employee.setName(resultSet.getString("name"));
                employee.setSalary(Double.valueOf(resultSet.getString("salary")));
                employee.setAge(Integer.valueOf(resultSet.getString("age")));
                return employee;
            }
        });
        return list;
    }
}
