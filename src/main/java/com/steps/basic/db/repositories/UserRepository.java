package com.steps.basic.db.repositories;

import com.steps.basic.db.entities.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<UserInfo, Long> {
    public UserInfo findUserByUsername(String username);
}
