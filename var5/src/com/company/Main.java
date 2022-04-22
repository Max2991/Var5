package com.company;

import java.beans.PersistenceDelegate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;


public class Main {

    public static void main(String[] args)
    {
        S student1=new S();
        student1.setfl("Иван Иванов");
        student1.sety(2);
        System.out.println(student1.getfl()+" начал учиться в "+student1.funct(student1.gety())+ " году ");
    }
}
