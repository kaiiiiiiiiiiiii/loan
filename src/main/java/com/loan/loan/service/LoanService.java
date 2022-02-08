package com.loan.loan.service;

import com.loan.loan.mapper.LoanMapper;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    private LoanMapper loanMapper;

    public LoanService(LoanMapper loanMapper) {
        this.loanMapper = loanMapper;
    }
}
