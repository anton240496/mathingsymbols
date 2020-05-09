package com.company;

public class mathingsimbols {
    private String text;

    public mathingsimbols( String text1) {

int len;
        this.text = text1;

        do{
            len = text.length();//сохраняем длину строки

            text = text.replaceAll("([a-z])\\1", "");
        }while(len != text.length());

    }
    public String getText() {
        return text;
    }

}
