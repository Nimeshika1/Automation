package com.sysco.automation_web_UI.data;

public class LoginData {
    public String validEmail = "williamjacob802@gmail.com";
    public String invalidEmail = "williamjacob@gmail.com";
    public String validPassword = "abc123$$";
    public String invalidPassword = "abc123";
    public String errorMessage = "YOU DID NOT SIGN IN CORRECTLY OR YOUR ACCOUNT IS TEMPORARILY DISABLED.";

    public String getValidEmail(){
        return validEmail;
    }
    public String getInvalidEmail(){
        return invalidEmail;
    }
    public String getValidPassword(){
        return validPassword;
    }
    public String getInvalidPassword(){
        return invalidPassword;
    }
    public String getErrorMessage(){
        return errorMessage;
    }

}
