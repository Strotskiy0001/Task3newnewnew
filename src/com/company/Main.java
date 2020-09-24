package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


                int a;
                int b;
                int c;
                int x;
                int y;
                int z;


                Scanner keyboard = new Scanner(System.in);
                System.out.println("Input a");
                a=keyboard.nextInt();
                System.out.println("Input b");
                b=keyboard.nextInt();
                System.out.println("Input c");
                c=keyboard.nextInt();
                System.out.println("Input x");
                x=keyboard.nextInt();
                System.out.println("Input y");
                y=keyboard.nextInt();
                System.out.println("Input z");
                z=keyboard.nextInt();
                System.out.println((x-a)*3600 + (y-b)*60 + z - c);
            }

        }