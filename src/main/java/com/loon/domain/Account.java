package com.loon.domain;


import com.loon.domain.entity.AbstractAuditableEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_account")
public class Account extends AbstractAuditableEntity {

    private Integer balance;

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}