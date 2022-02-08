package com.loan.loan.service;

import com.loan.loan.domain.Emp;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class EmpServiceTest {

    @Autowired
    private EmpService empService;

    @Test
    public void getEmpByEmpNo() {
        Emp emp = empService.getEmpByEmpNo(1L);
        //log.info("product : {}", emp);
    }

    @Test
    public void getAllEmp() {
        List<Emp> emps = empService.getAllEmps();
        //log.info("products : {}", emps);
    }

    @Transactional
    @Test
    public void addEmp() {
        empService.addEmp(new Emp(1L, "카이"));
        //empService.addEmp(new Emp(2L, "미나"));
        //empService.addEmp(new Emp(3L, "마스"));
    }
}
