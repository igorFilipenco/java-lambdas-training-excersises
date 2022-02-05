package com.lambda.chapter3;

public class Task6 {
    public static int getLowerCaseLettersCountFromString(String text) {
        return (int) text.chars()
                .filter(Character::isLowerCase)
                .count();
    }

    public static void main(String[] args) {
        System.out.println(getLowerCaseLettersCountFromString("AbCdefghI"));
    }
}
