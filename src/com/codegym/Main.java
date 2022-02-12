package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stopwatch watch1=new Stopwatch();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Mời bạn bắt đầu");
        watch1.start();
        System.out.println("Bạn muốn kết thúc?");
        int a= scanner.nextInt();
        if (a==1){
            watch1.end();
            System.out.println(watch1.getElapsedTime());
        }
    }
}
