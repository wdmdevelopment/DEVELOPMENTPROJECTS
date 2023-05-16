package com.wdm.google.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wdm.google.entity.User;
import com.wdm.google.repository.UserRepository;
import com.wdm.google.request.RequestUser;
import com.wdm.google.request.ResponseUser;

 

@RestController
@RequestMapping("/user")
public class UserController {
	
		@Autowired
		UserRepository userRepo;
		
		/* 
		 * To use password encoder for encryption password information
		 *   */
//		@Autowired
//		PasswordEncoder passwordEncoder;

	
	@PostMapping("/socialLogin")
	public ResponseEntity<?> socialLogin (@Valid @RequestBody RequestUser socialLogin) throws Exception {
			
		 
		User userAccount = userRepo.findByEmailId(socialLogin.getEmail());
		 
		 
			
		if(userAccount!=null) {
			  

				return ResponseEntity.ok(new ResponseUser(
						userAccount.getUserId(), 
						userAccount.getUserName(), 
						userAccount.getEmailId(),
						userAccount.getUserRole()
			            ));
		
		}
		
		else {
			User user = new User();
				
		 
			
			  user.setEmailId(socialLogin.getEmail());
			  user.setFirstName(socialLogin.getFirstName());
			  user.setLastName(socialLogin.getLastName());
			
//			  user.setPassword(passwordEncoder.encode(socialLogin.getPassword()));
			  
			  user.setPassword(socialLogin.getPassword());
			  
			  user.setUserName(socialLogin.getUserName());
			  user.setUserRole("Customer");
			  
			  		 User user2 = userRepo.save(user);
			  	
			  	
						return ResponseEntity.ok(new ResponseUser( 
								user2.getUserId(), 
								user2.getUserName(), 
								user2.getEmailId(),
								user2.getUserRole()
					            ));
					
		      
 
		}
	 
	 
	}
	
}
