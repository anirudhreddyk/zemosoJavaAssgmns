package JavaGeneralPrograms;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        System.out.println(randomNumber.nextInt(100));
        System.out.println(randomNumber.nextInt());

    }
}
