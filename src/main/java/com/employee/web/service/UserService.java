package com.employee.web.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.employee.web.entity.User;
import com.employee.web.repo.UserRepo;

@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public User saveUser(User user) {
		String encodedPwd= passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPwd);
		return userRepo.save(user);
	}

	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> userOpt = userRepo.findByUsername(username);
		
		if(userOpt.isEmpty()) {
			
			throw new UsernameNotFoundException(username);
			
		}
		else {
			
			User user = userOpt.get();
			
			Set<SimpleGrantedAuthority> roleSet = new HashSet<>();
			
			for(String role : user.getUrole()) {
				roleSet.add(new SimpleGrantedAuthority(role));
			}
			
			return new org.springframework.security.core.userdetails.User(
														user.getUsername(),
														user.getPassword(),
														roleSet);
		}
		
	}

}
