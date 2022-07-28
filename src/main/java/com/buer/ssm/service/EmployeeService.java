package com.buer.ssm.service;

import com.buer.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    /**
     * 查询所有信息
     */
    List<Employee> getAllEmployee();

    /**
     * 获取员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);

    /**
     * 根据id删除用户信息
     * @param id
     */
    void deleteById(Integer id);
}
