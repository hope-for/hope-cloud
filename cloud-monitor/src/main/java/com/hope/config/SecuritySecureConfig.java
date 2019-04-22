package com.hope.config;

import de.codecentric.boot.admin.server.config.AdminServerProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

/**
 * @program:hope-cloud
 * @ClassName:SecuritySecureConfig
 * @author:aodeng
 * @blog:低调小熊猫(https://aodeng.cc)
 * @create:2019-04-22 22:00
 * @Description: TODO
 * @Version 1.0
 **/
//@Configuration
public class SecuritySecureConfig extends WebSecurityConfigurerAdapter {

//    private final String adminContextPath;

//    public SecuritySecureConfig(AdminServerProperties adminServerProperties) {
//        this.adminContextPath = adminServerProperties.getContextPath();
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
//        successHandler.setTargetUrlParameter("redirectTo");
//
//        http.authorizeRequests()
//                .antMatchers(  "/assets/**").permitAll()
//                .antMatchers( "/login").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin().loginPage( "/login").successHandler(successHandler).and()
//                .logout().logoutUrl( "/logout").and()
//                .httpBasic().and()
//                .csrf().disable();
//    }
}