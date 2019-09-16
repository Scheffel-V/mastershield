package com.rpg.mastershield.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.rpg.mastershield.model.User;
import com.rpg.mastershield.service.UserService;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

  static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

  @Autowired
  private UserService userService;
  
  static {
    inMemoryUserList.add(new JwtUserDetails(1L, "in28minutes",
        "$2a$10$3zHzb.Npv1hfZbLEU5qsdOju/tk2je6W6PnNnY.c1ujWPcZh4PL6e", "ROLE_USER_2"));
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	try {
		User userData = userService.getUserByUsername(username);
	
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		JwtUserDetails userDetails = new JwtUserDetails(userData.getId(), userData.getUsername(), encoder.encode(userData.getPassword()), "ROLE_USER_2");
		return userDetails;
	} catch(NoSuchElementException exception) {
		throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
	}
  }

}


