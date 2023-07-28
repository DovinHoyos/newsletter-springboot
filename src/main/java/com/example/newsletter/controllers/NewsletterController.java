package com.example.newsletter.controllers;

import com.example.newsletter.models.Lead;
import com.example.newsletter.repository.EmailRepository;
import com.example.newsletter.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsletterController {

    @Autowired
    EmailRepository emailRepository;
    @PostMapping("/api/newsletter")
    public String registrar(@RequestBody Lead lead){

        String email = lead.getEmail();

        EmailValidator emailValidator = new EmailValidator();
        if(!emailValidator.esValido(email)) {
            return "este email no es valido!";
        }

        emailRepository.guardarEmail(email);
        return "Email guardado" + email;
    }

    @PostMapping("/api/newsletter/unsuscribe")
    public String eliminar(@RequestBody Lead lead){

        String email = lead.getEmail();
        emailRepository.eliminarEmail(email);
        return "Email eliminado";
    }

}
