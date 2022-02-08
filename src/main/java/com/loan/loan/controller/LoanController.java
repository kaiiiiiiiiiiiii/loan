package com.loan.loan.controller;

import com.loan.loan.service.EmpService;
import com.loan.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoanController {

    private LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping("/loan/limit")
    public String getLimit() {
        return "loan/loanLimit";
    }

    /*
    @GetMapping("limit");
    public String limit(Model model) {
        model.addAttribute("data", "hello!");
        return
    }
     */
}
