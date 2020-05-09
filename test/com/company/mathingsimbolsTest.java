package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mathingsimbolsTest {

    @Test
    void test() {
        mathingsimbols a = new mathingsimbols("accvvdv");
        System.out.println(a.getText());
        assertEquals("adv",a.getText());


    }

    @Test
    void test1() {
        mathingsimbols a = new mathingsimbols("aa89bbffc");
        System.out.println(a.getText());
        assertEquals("89c",a.getText());
    }

    @Test
    void test2() {
        mathingsimbols a = new mathingsimbols("aabbcc");
        System.out.println(a.getText());
        assertEquals("",a.getText());
    }

    @Test
    void test3() {
        mathingsimbols a = new mathingsimbols("AnnA?!");
        System.out.println(a.getText());
        assertEquals("AA?!",a.getText());
    }

    @Test
    void test4() {
        mathingsimbols a = new mathingsimbols("AnnA?!12234aa34");
        System.out.println(a.getText());
        assertEquals("AA?!1223434",a.getText());

    }
}