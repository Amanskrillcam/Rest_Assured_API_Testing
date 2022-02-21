package Enums;

import java.util.EnumSet;

public class ENUMS {

    enum lang
    {
        java,csharp,html,C, Python, Ruby
    }

    public static void main(String[] args)
    {
        EnumSet<lang> langs =EnumSet.allOf(lang.class);
        System.out.println(langs);


    }
}
