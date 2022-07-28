package com.buer.ssm.controller;

import com.buer.ssm.pojo.Employee;
import com.buer.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * 查询所有员工信息-->/employee/-->get
 * 查询所有员工的分页信息-->/employee/page/1-->get
 * 根据id查询员工信息-->/employee/1-->get
 * 跳转到添加页面-->/to/add-->get
 * 添加员工信息-->/employee-->post
 * 修改员工信息-->/employee-->put
 * 删除员工信息-->/employee/1-->delete
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee/page/{pageNum}", method = RequestMethod.GET)
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum,Model model){
//        获取员工分页信息
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
//        将分页数据共享到请求域中
        model.addAttribute("page",page);
        return "employee_list";
    }

//     * 查询所有员工信息-->/employee-->get
    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
//        查询所有员工信息
        List<Employee> list = employeeService.getAllEmployee();
//        将员工信息在请求域中共享
        model.addAttribute("list",list);
//        跳转到employee_list.html
        return "employee_list";
    }

//    * 删除员工信息-->/employee/1-->delete
    @RequestMapping(value = "/employee/delete/{id}", method = RequestMethod.GET)
    public String deleteById(@PathVariable("id") Integer id){
        employeeService.deleteById(id);
        return "redirect:/employee/page/1";
    }
}
