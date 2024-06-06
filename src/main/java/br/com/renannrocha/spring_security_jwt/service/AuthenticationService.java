package br.com.renannrocha.spring_security_jwt.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public String authenticate(){
        return  "token";
    }
}
