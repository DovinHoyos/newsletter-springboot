package com.example.newsletter.validators;

public class EmailValidator {

    public boolean esValido(String email){
        if(!email.contains("@")){
            return false;
        }
        if(!email.contains(".")){
            return false;
        }
        if(email.endsWith("@")){
            return false;
        }
        if(email.contains(" ")){
            return false;
        }
        if (email.length() >= 255){
            return false;
        }
        return true;
    }
}
