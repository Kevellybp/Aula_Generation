package org.genegartion.blogPessoal.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter {
@Autowired
private UserDetailsService userDetailsService;

@Override
protected void configure (AuthenticationManagerBuilder auth) throws Exception{
	auth.userDetailsService(userDetailsService);
}
@Bean
public PasswordEncoder passwordEncoder () {
	return new BCryptPasswordEncoder();
}
@Override
protected void configure (HttpSecurity http) throws Exception {
	http.authorizeRequests() //restringir acesso a tudo
	.antMatchers("/usuarios/logar").permitAll()
	.antMatchers("/usuarios/cadastrar").permitAll()
	.antMatchers("/usuarios/id").permitAll()
	.anyRequest().authenticated()
	.and().httpBasic() // configura a autenticação por http basic 
	.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	.and().cors() 
	.and().csrf().disable(); //adiciona suporte csrf = falsificação de solicitação entre sites
	
}
}
