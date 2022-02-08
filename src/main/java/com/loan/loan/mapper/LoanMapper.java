package com.loan.loan.mapper;

import com.loan.loan.domain.Emp;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Optional;

@Mapper
public interface LoanMapper {

    Emp selectEmpByEmpNo(Long empNo);
    List<Emp> selectAllEmps();
    void insertEmp(Emp emp);
}
