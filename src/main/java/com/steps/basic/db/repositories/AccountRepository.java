package com.steps.basic.db.repositories;

import com.steps.basic.db.entities.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AccountRepository extends CrudRepository<Account, Long> {
    public Account findByUid(String uid);
}
