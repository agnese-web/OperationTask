package com.company;

public class Multiplication implements Operation{
    private int firstNumber, secondNumber;
    public Multiplication(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double operation(int firstNumber, int secondNumber) {
        return getFirstNumber() * getSecondNumber();
    }
}
