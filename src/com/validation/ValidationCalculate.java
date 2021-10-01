package com.validation;

import java.util.regex.Pattern;

public class ValidationCalculate {
    String validation="[A-Z]{1}+[a-z]{2,}";
    public void Firstvalidation(String name){
        boolean result= Pattern.matches(validation,name);
        System.out.println("result of validation:"+result);
        if( result == false){
            System.out.println("Should enter start with capital letter or Minimum length is 3");
        }
    }
}
