package com.yash.StringAssignments;

public class String6 {
public static void main(String[] args) {
        
        String s1 = new String("Prafulla"); 

       String s2 = new String("Prafulla"); 

       String s3 = "Prafulla"; 

       String s4 = "Prafulla"; 



       System.out.println("1:" + s1.hashCode());
        System.out.println("2:" + s2.hashCode());
        System.out.println("3:" + s3.hashCode());
        System.out.println("4:" + s4.hashCode());



       System.out.println(s1.equals(s3)); 
        System.out.println("In Heap memory: " + s1 == s3);



   }

}
