package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

public interface AccountDao {

    List<Account> findAll();

    Account findById();

    boolean addMoney(String accountId, double money);

}
