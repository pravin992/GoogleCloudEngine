package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello Pravin!!";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }

    public String getMessage() {
        return message;
    }
}
