package br.com.renannrocha.spring_security_jwt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("private")
public class PrivateController {

    // esse é o recurso que eu quero proteger o acesso
    @GetMapping
    public String getMessage(){
        return "hello from private API controller";
    }
}
