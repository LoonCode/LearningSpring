package com.loon.repository;

import com.loon.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface AccountRepository extends CrudRepository<Account,String> {

}
