package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("input : ");
        int input = s.nextInt();
        System.out.println();

        System.out.println("Output :");
        int n1=1,n2=1,n3,i,count=input;
        System.out.print(n1+" "+n2);

        for(i = 2; i < count; ++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
    }
}