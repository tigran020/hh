package com.company;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
        author a=new author("Rrr", "rr@mail.ru",'g');
        System.out.println(a.getGender());
        System.out.println(a.getEmail());
        System.out.println(a.getName());
        a.setEmail("rrrr@mail.ru");
        System.out.println(a.getEmail());
        System.out.println(a);
    }

}
