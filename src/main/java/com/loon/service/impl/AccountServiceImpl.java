package com.loon.service.impl;

import com.loon.model.Account;
import com.loon.repository.AccountRepository;
import com.loon.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    @Transactional
    public void createAccount(Account account) throws Exception {
        accountRepository.save(account);
    }
}




