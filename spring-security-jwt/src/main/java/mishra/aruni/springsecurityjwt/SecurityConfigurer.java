package mishra.aruni.springsecurityjwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import mishra.aruni.springsecurityjwt.services.MyUserDetailsService;

/**
 * @author aruni.mishra
 *
 */
public class SecurityConfigurer extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private MyUserDetailsService myUserDetailsService;
	
@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
	
	auth.userDetailsService(myUserDetailsService);
}
	
}
