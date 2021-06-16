package com.buta.totalusers.service.count.department;

import com.buta.totalusers.data.countData.department.AccountCount;
import com.buta.totalusers.repository.count.department.AccountingCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountCountService {
    @Autowired
    private AccountingCountRepository repository;
    @Autowired
    private AccountCount accountCount;

    public AccountCount getAccountingCount(){
        changeObject(repository.findAccountingCount());
        return accountCount;
    }

    public  void changeObject(Integer integer){
        this.accountCount.setCount(integer);
    }
}
