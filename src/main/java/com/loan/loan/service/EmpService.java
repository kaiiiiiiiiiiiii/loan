package com.loan.loan.service;

import com.loan.loan.domain.Emp;
import com.loan.loan.mapper.LoanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {


    private LoanMapper loanMapper;

    public EmpService(LoanMapper loanMapper) {
        this.loanMapper = loanMapper;
    }

    public Emp getEmpByEmpNo(Long empNo) {

        return loanMapper.selectEmpByEmpNo(empNo);
    }

    public List<Emp> getAllEmps() {

        return loanMapper.selectAllEmps();
    }

    @Transactional
    public void addEmp(Emp emp) {

        loanMapper.insertEmp(emp);
    }

}
