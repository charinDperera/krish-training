package com.krishantha.rentcloud.authorizationserver.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.krishantha.rentcloud.authorizationserver.model.AuthUserDetail;
import com.krishantha.rentcloud.authorizationserver.model.User;
import com.krishantha.rentcloud.authorizationserver.repository.UserDetailsRepository;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailsRepository userDetailsRepository;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		Optional<User> optionalUser = userDetailsRepository.findByUserName(name);

		optionalUser.orElseThrow(() -> new UsernameNotFoundException("Username or Password Wrond"));

		UserDetails userDetails = new AuthUserDetail(optionalUser.get());

		new AccountStatusUserDetailsChecker().check(userDetails);
		return userDetails;
	}

}
