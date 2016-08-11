package com.steps.basic.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .anonymous()
                .and()
                .authorizeRequests().antMatchers("/register").permitAll()
                .and()
                .authorizeRequests().antMatchers("/hello").fullyAuthenticated()
                .and()
                .authorizeRequests().antMatchers("/who_i_am").fullyAuthenticated();
//                .and()
//                .formLogin().permitAll().loginPage("/login").usernameParameter("username").passwordParameter("password")
//                .and()
//                .logout().permitAll()
//                .and()
//                .authorizeRequests().anyRequest().fullyAuthenticated()
//                .and()
//                .httpBasic().disable()
//                .exceptionHandling().accessDeniedPage("/403")
//                .and()
//                .headers().contentTypeOptions()
//                .disable();
    }
}
