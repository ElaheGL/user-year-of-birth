package com.example.helloage;

import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HelloAge {
    public static void main(String [] args){
        String Name = JOptionPane.showInputDialog(null,"Please Enter Your Name");
        int Age = Integer.parseInt(JOptionPane.showInputDialog
                (null,"How Old Will Be At The End Of This Year?"));
        int BirthYear = CalculateBirthYear(Age);
        JOptionPane.showMessageDialog(null,Name +"You was born in"+ BirthYear);

    }
    private static int CalculateBirthYear(int x){
        GregorianCalendar now = new GregorianCalendar();
        int ThisYear = now.get(Calendar.YEAR);
        return ThisYear - x;

    }
}
