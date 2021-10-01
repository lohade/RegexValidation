package com.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationCalculate {
    Pattern pattern;
    Matcher matcher;
    String Name="[A-Z]{1}+[a-z]{2,}";
    String email_validation="[a-zA-Z0-9.]+@[a-z.]+[a-z]";
    String mobile_validation="[0-9]{2}\\{0-9}{10}$";
    String password_validation="^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";


    public void Firstvalidation(String name){
        boolean result= Pattern.matches(Name,name);
        System.out.println("result of validation:"+result);
        if( result == false){
            System.out.println("Should enter start with capital letter or Minimum length is 3");
        }
    }
    public void LastNameValidation(String surname){
        pattern=Pattern.compile(Name);
        matcher=pattern.matcher(surname);
        boolean result= matcher.matches();
        System.out.println(result);
        if(result==false){
            System.out.println("Enter validate Surname");
        }
    }
    public void email(String email){
        boolean result=Pattern.matches(email_validation,email);
        System.out.println(result);
        if(result==false){
            System.out.println("enter validation email");
        }
    }

    public void mobile(String mobile){
        boolean value=Pattern.matches(mobile_validation,mobile);
        System.out.println(value);
        if (value==false){
            System.out.println("enter proper mobile number");
        }
    }
    public void password(String password){
        pattern=Pattern.compile(password_validation);
        matcher=pattern.matcher(password);
        boolean val= matcher.matches();
        System.out.println(val);
        if(val==false){
            System.out.println("pattern does not match");
        }
    }


}
