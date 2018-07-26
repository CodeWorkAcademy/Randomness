package com.company;

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args)
    {
        output("Generate 10 random integers between 1 and 99");

        Random rnd = new Random();

        for (int i = 1; i <= 8; ++i)
        {
            int randomInt = 40 + rnd.nextInt(126);
            char c= (char) randomInt;
            output("Generated char: " +c);
        }

        output("Done.");
    }

    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}
