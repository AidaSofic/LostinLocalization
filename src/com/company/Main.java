package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);

        int n = scan.nextInt();

        if (n >= 1 && n < 5){
            System.out.print ("few");

        }
        if (n >= 5 && n < 10){
            System.out.print ("several");

}
        if (n >= 10 && n < 20){
            System.out.print ("pack");}



        if (n >= 20 && n < 50){
            System.out.print ("lots");}

        if (n >= 50 && n < 100){
            System.out.print ("horde");}

        if (n >= 100 && n < 250){
            System.out.print ("throng");}

        if (n >= 250 && n < 500){
            System.out.print ("swarm");}

        if (n >= 500 && n < 1000){
            System.out.print ("zounds");}

        if (n >= 1000){
            System.out.print ("legion");}

        }

}

