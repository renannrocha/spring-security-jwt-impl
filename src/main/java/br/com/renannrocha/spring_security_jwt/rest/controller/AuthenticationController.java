package br.com.renannrocha.spring_security_jwt.rest.controller;

import br.com.renannrocha.spring_security_jwt.security.service.AuthenticationService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AuthenticationController {
    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }



    @PostMapping("authenticate")
    public String authenticate(Authentication authentication){
        return authenticationService.authenticate(authentication);
    }
}
