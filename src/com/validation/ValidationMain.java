package com.validation;

import java.util.Scanner;

public class ValidationMain {
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        ValidationCalculate validationCalculate=new ValidationCalculate();
        System.out.println("Enter first name for validation:");
        String name = scanner.next();
        validationCalculate.Firstvalidation(name);
    }
}
