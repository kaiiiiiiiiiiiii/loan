package com.loan.loan.controller;

import com.loan.loan.domain.Emp;
import com.loan.loan.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmpController {

    private EmpService empService;

    @Autowired
    public EmpController(EmpService empService) {
        this.empService = empService;
    }

    @GetMapping("/emp/new")
    public String createForm() {
        return "emp/createEmpForm";
    }

    @PostMapping("/emp/new")
    public String create(EmpForm form) {
        Emp emp = new Emp();
        emp.setEmpNo(form.getEmpNo());
        emp.setEmpName(form.getEmpName());
        System.out.println("empno = " + form.getEmpNo());
        System.out.println("empname = " + form.getEmpName());
        System.out.println("emp = " + emp);

        empService.addEmp(emp);

        return "redirect:/";
    }

    @GetMapping("/emp")
    public String list(Model model) {
         List<Emp> emps = empService.getAllEmps();
         model.addAttribute("emps", emps);
         //System.out.println("emp = " + emp);

        // Print the name from the list....
        for(Emp emp : emps) {
            System.out.println(emp.getEmpNo());
            System.out.println(emp.getEmpName());
        }
         return "emp/empList";
    }

}
