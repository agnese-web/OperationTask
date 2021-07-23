package com.company;

public class Main {

    public static void main(String[] args) {

        Add add = new Add(5,9);
        System.out.println(add.getFirstNumber() +  " + " + add.getSecondNumber() + " = " + add.operation(5,9));

        Subtract subtract = new Subtract(5,9);
        System.out.println(subtract.getFirstNumber() + " - " + subtract.getSecondNumber() + " = " + subtract.operation(5,9));

        Multiplication multiplication = new Multiplication(5,9);
        System.out.println(multiplication.getFirstNumber() + " * " + multiplication.getSecondNumber() + " = " + multiplication.operation(5,9));

        Division division = new Division(5,9);
        System.out.println(division.getFirstNumber() + " / " + division.getSecondNumber() + " = " + division.operation(5,9));

        Square square = new Square(5,9);
        System.out.println("Number " + square.getFirstNumber() + " squared by " + square.getSecondNumber() + " = " + square.operation(5,9));

        Squareroot squareroot = new Squareroot(5,9);
        System.out.println("Squareroot of " + squareroot.getFirstNumber() + " is " + squareroot.operation(5,9));
    }
}
