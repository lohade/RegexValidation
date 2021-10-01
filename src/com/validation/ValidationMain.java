package com.validation;

import java.util.Scanner;

public class ValidationMain {
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        ValidationCalculate validationCalculate=new ValidationCalculate();
        boolean status=true;
        do {
            System.out.println("1:first name validation:\n2:Last name validation:\n3:Email validation:\n");
            int choice= scanner.nextInt();
            switch(choice) {
                case 1:
                System.out.println("Enter first name for validation:");
                String name = scanner.next();
                validationCalculate.Firstvalidation(name);
                break;

                case 2:
                System.out.println("Enter last name for validation:");
                String surname = scanner.next();
                validationCalculate.LastNameValidation(surname);
                break;
                /*
                case 3:
                System.out.println("enter email to validation:");
                String email = scanner.next();
                validationCalculate.email(email);
                break;*/

                case 3:
                    status=false;
                    break;
            }
        }while(status);
    }
}
