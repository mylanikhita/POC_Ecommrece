package com.demo.service;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dto.LoginDto;
import com.demo.dto.UpdatePasswordDto;
import com.demo.dto.UpdateUserDetailesDto;
import com.demo.entity.User;
import com.demo.repository.UserRepository;
@Service
public interface UserService {

	JSONObject saveUser(User user);

	List<User> getUser();

	JSONObject updateUser(UpdateUserDetailesDto updateUserDto, long id);

	JSONObject delateUser(long id);

	JSONObject verifylogin(LoginDto users);


	User getUserById(long id);

	

	JSONObject delateUser(Long id);

	

	JSONObject getUserById(Long i);

	JSONObject updateUserPassword(UpdatePasswordDto updatePasswordDto, Long id);

	JSONObject updateUser(UpdateUserDetailesDto updateUserDto, Long id);

	JSONObject updateUserPassword(UpdatePasswordDto uDto, long id);

	
	

		}

