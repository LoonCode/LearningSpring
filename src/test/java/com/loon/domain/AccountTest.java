package com.loon.domain;

import com.loon.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"../../../config/spring-context-config.xml"})
public class AccountTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testCreateAccount() throws Exception {
        Account account = new Account();
        account.setBalance(1);
        accountService.createAccount(account);

    }
}
