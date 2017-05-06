package com.aek56.platform.admin.web.common.config;

import com.aek56.platform.common.web.config.AbstractWebSecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

/**
 * spring-security配置
 *
 * @author zj@aek56.com
 */
@Configuration
public class WebSecurityConfig extends AbstractWebSecurityConfig {

    @Override
    protected void configure(HttpSecurity security) throws Exception {
        security
            .authorizeRequests()
            .antMatchers(HttpMethod.POST, "/auth/token").permitAll();
        super.configure(security);
    }
}
