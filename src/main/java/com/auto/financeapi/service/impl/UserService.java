package com.auto.financeapi.service.impl;

import org.springframework.http.ResponseEntity;

import com.auto.financeapi.entity.AuthRequest;
import com.auto.financeapi.entity.ResponseSuccess;

public interface UserService {
//reabse1
	public abstract ResponseEntity<ResponseSuccess> signUpUser(AuthRequest authRequest);
}
