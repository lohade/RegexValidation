package com.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationCalculate {
    Pattern pattern;
    Matcher matcher;
    String FirstName_validation="[A-Z]{1}+[a-z]{2,}";
    String LastName_validation="[A-Z]{1}+[a-z]{2,}";
    //String email_validation="[a-zA-Z0-9.]+@[a-z.]+[a-z]";


    public void Firstvalidation(String name){
        boolean result= Pattern.matches(FirstName_validation,name);
        System.out.println("result of validation:"+result);
        if( result == false){
            System.out.println("Should enter start with capital letter or Minimum length is 3");
        }
    }
    public void LastNameValidation(String surname){
        pattern=Pattern.compile(LastName_validation);
        matcher=pattern.matcher(surname);
        boolean result= matcher.matches();
        System.out.println(result);
        if(result==false){
            System.out.println("Enter validate Surname");
        }
    }
    /*public void email(String email){
        boolean result=Pattern.matches(email_validation,email);
        System.out.println(result);
        if(result==false){
            System.out.println("enter validation email");
        }
    }*/

}
