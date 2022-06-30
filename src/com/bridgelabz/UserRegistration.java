package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to user registration program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));
        System.out.println("Enter E-mail: ");
        String email = scanner.nextLine();
        System.out.println(Pattern.matches("[a-z][A-Z a-z 0-9]+[@][a-z]+[.][a-z]{2,5}", email));
        System.out.println("Enter Mobile Number: ");
        String mobileNumber = scanner.nextLine();
        System.out.println(Pattern.matches("[+]91 [6-9]\\d{9}", mobileNumber));
        System.out.println("Enter Password1: ");
        String password1 = scanner.nextLine();
        System.out.println(Pattern.matches("[a-z A-Z]{8,}", password1));
        System.out.println("Enter Password2: ");
        String password2 = scanner.nextLine();
        System.out.println(Pattern.matches("[A-Z][a-z A-Z]{8,}", password2));
        System.out.println("Enter Password3: ");
        String password3 = scanner.nextLine();
        System.out.println(Pattern.matches("[A-Z][a-z A-Z 0-9]{8,}", password3));
        System.out.println("Enter Password4: ");
        String password4 = scanner.nextLine();
        System.out.println(Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])[a-z A-Z \\d $&+,:;=?@#|'<>.-^*()%!]{8,}", password4));
    }
}
