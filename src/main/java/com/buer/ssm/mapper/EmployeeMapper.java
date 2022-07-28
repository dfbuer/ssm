package com.buer.ssm.mapper;

import com.buer.ssm.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {

    /**
     * 查询所有信息
     */
    List<Employee> getAllEmployee();

    /**
     * 根据id删除员工信息
     * @param id
     */
    void deleteById(@Param("id") Integer id);
}
