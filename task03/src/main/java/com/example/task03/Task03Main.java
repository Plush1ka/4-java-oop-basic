package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        ComplexNumber number1 = new ComplexNumber(4, -8);
        ComplexNumber number2 = new ComplexNumber(6, 16);

        ComplexNumber addResult = number1.add(number2);
        ComplexNumber multiResult = number1.multi(number2);

        System.out.println(addResult.getComplexNumber());
        System.out.println(multiResult.getComplexNumber());
    }
}


class ComplexNumber{
    private double re;
    private double im;

    public ComplexNumber(double re, double im){
        this.re = re;
        this.im = im;
    }

    public double getRe(){
        return re;
    }

    public double getIm(){
        return im;
    }

    public ComplexNumber add(ComplexNumber number){
        double newRe = re + number.getRe();
        double newIm = im + number.getIm();

        return new ComplexNumber(newRe, newIm);
    }

    public ComplexNumber multi(ComplexNumber number){
        double newRe = re * number.getRe() - im * number.getIm();
        double newIm = re * number.getIm() + im * number.getRe();

        return new ComplexNumber(newRe, newIm);
    }

    public String getComplexNumber() {
        if (im > 0){
            return re + " + " + im + "i";
        } else {
            return re + " - " + Math.abs(im) + "i";
        }
    }
}
