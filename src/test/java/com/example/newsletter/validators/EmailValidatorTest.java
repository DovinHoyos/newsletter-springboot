package com.example.newsletter.validators;
import org.junit.Test;
import static org.junit.Assert.assertFalse;

public class EmailValidatorTest {

    @Test
    public void elEmailTieneArroba(){
        EmailValidator validator = new EmailValidator();
        boolean result = validator.esValido("dassad");
        assertFalse(result);
    }
    @Test
    public void elEmailTienePunto(){
        EmailValidator validator = new EmailValidator();
        boolean result = validator.esValido("dfsdfsdfsd");
        assertFalse(result);
    }
    @Test
    public void elArrobaNoSeaLaUltimaLetra(){
        EmailValidator validator = new EmailValidator();
        boolean result = validator.esValido("asdfds.sdfs@");
        assertFalse(result);
    }
    @Test
    public void elEmailNoDebeTenerEspacio(){
        EmailValidator validator = new EmailValidator();
        boolean result = validator.esValido("lucas moy@atl.com");
        assertFalse(result);
    }
    @Test
    public void queNoTengaMasDe255Caracteres(){
        EmailValidator validator = new EmailValidator();
        boolean result = validator.esValido("lucasdsfsdfsdfsdfdfsdfsdfsdfsdfsdfdfdfsdflucasdsfsdfsdfsdfdfsdfsdfsdfsdfsdfdfdfsdfsdfasdfsdfsdfsadfsdflucasdsfsdfsdfsdfdfsdfsdfsdfsdfsdfdfdfsdfsdfasdfsdfsdfsadfsdflucasdsfsdfsdfsdfdfsdfsdfsdfsdfsdfdfdfsdfsdfasdfsdfsdfsadfsdflucasdsfsdfsdfsdfdfsdfsdfsdfsdfsdfdfdfsdfsdfasdfsdfsdfsadfsdfmoy@atl.com");
        assertFalse(result);
    }


}
