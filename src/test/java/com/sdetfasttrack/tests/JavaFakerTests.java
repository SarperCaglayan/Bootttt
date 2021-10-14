package com.sdetfasttrack.tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerTests {
    @Test
    public void testJavaFaker(){

        Faker faker= new Faker();
        String firstName= faker.name().firstName();
        System.out.println("firstName = " + firstName);
        String lastName= faker.name().lastName();
        System.out.println("lastName = " + lastName);
        String fullName= faker.name().fullName();
        System.out.println("fullName = " + fullName);
        String address= faker.address().fullAddress();

        System.out.println("address = " + address);
        String phoneNumber= faker.phoneNumber().phoneNumber();
        System.out.println("phoneNumber = " + phoneNumber);
        String creditCard= faker.business().creditCardNumber();
        System.out.println("creditCard = " + creditCard);
        String emailAddress= faker.internet().emailAddress();



    }
}
