package com.steps.basic.configs;

import com.steps.basic.db.entities.UserInfo;
import com.steps.basic.db.repositories.UserRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableJpaRepositories(basePackageClasses = {UserRepository.class})
@EnableAutoConfiguration
@EntityScan(basePackageClasses = {UserInfo.class})
public class DatabaseConfig {
}
