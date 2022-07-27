package com.buer.ssm.mapper;

import com.buer.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    /**
     * 查询所有信息
     */
    List<Employee> getAllEmployee();
}
