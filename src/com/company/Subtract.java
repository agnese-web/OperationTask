package com.company;

public class Subtract implements Operation {

    private int firstNumber, secondNumber;
    public Subtract(int firstNumber, int secondNumber) {
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
        return getFirstNumber() - getSecondNumber();
    }
}





