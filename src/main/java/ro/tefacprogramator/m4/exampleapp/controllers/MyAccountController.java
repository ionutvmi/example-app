package ro.tefacprogramator.m4.exampleapp.controllers;

/**
 * MyAccountController
 */
public class MyAccountController {

    public void showSomething(int count) {
        if (count > 3) {
            System.out.println("Test message");
        } else {
            System.out.println("Default message");
        }
    }

    public void showSomethingElse() {
        System.out.println("Another nice message");
    }

}