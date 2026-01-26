package ru.сourses.math;

public class Fraction extends Number {

    private int num;
    private int denominator;

    public int getNum() {
        return num;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator < 0) {
            throw new IllegalArgumentException("Знаменатель должен быть > 0");
        }
        this.num = numerator;
        this.denominator = denominator;
    }

    public Fraction sum(Fraction fr) {
        Fraction fr1 = new Fraction(num * fr.getDenominator(), denominator * fr.getDenominator());
        Fraction fr2 = new Fraction(fr.getNum()*denominator, denominator * fr.getDenominator());
        return new Fraction(fr1.getNum() + fr2.getNum(), fr1.getDenominator());
    }

    public Fraction minus(Fraction fr) {
        Fraction fr1 = new Fraction(num * fr.getDenominator(), denominator * fr.getDenominator());
        Fraction fr2 = new Fraction(fr.getNum()*denominator, denominator * fr.getDenominator());
        return new Fraction(fr1.getNum() - fr2.getNum(), fr1.getDenominator());
    }

    public Fraction minus(int number) {

        Fraction temp = new Fraction(number, 1);
        Fraction fr1 = new Fraction(num * temp.getDenominator(), denominator * temp.getDenominator());
        Fraction fr2 = new Fraction(temp.getNum()*denominator, denominator * temp.getDenominator());
        return new Fraction(fr1.getNum() - fr2.getNum(), fr1.getDenominator());
    }

    @Override
    public String toString (){
        return String.format("%s/%s", num, denominator);
    }

    @Override
    public int intValue() {
        return num/denominator;
    }

    @Override
    public long longValue() {
        return num/denominator;
    }

    @Override
    public float floatValue() {
        return (float) num /denominator;
    }

    @Override
    public double doubleValue() {
        return (double) num /denominator;
    }
}
