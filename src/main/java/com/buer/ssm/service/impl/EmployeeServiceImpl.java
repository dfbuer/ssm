package com.buer.ssm.service.impl;

import com.buer.ssm.mapper.EmployeeMapper;
import com.buer.ssm.pojo.Employee;
import com.buer.ssm.service.EmployeeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
//        开启分页功能
        PageHelper.startPage(pageNum,5);
//        查询所有员工信息
        List<Employee> list = employeeMapper.getAllEmployee();
//        获取分页相关数据
        PageInfo<Employee> page = new PageInfo<Employee>(list,5);
        return page;
    }
}
