package ir.quantumsoft.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by AliSalehi on 29/03/2017.
 */
public class AppSecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
            auth
                .inMemoryAuthentication()
                .withUser("user")  // #1
                .password("password")
                .roles("USER")
                .and()
                .withUser("admin") // #2
                .password("password")
                .roles("ADMIN","USER");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web
                .ignoring()
                .antMatchers("/resources/**"); // #3
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/signup","/about").permitAll() // #4
                .antMatchers("/index").hasRole("ADMIN") // #6
                .anyRequest().authenticated() // 7
                .and()
                .formLogin()  // #8
                .loginPage("/login") // #9
                .permitAll(); // #5
    }
}
