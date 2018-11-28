package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        Pattern p4 = Pattern.compile("à",Pattern.CANON_EQ);
        Matcher m4=p4.matcher("à");
        while (m4.find()){
            System.out.println(m4.start()+" "+m4.group()+" ");
        }
        System.out.println(" ");
    }
}
