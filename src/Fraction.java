public class Fraction {

    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator < 0) {
            throw new IllegalArgumentException("Знаменатель должен быть > 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction sum(Fraction fr) {
        Fraction fr1 = new Fraction(numerator * fr.getDenominator(), denominator * fr.getDenominator());
        Fraction fr2 = new Fraction(fr.getNumerator()*denominator, denominator * fr.getDenominator());
        return new Fraction(fr1.getNumerator() + fr2.getNumerator(), fr1.getDenominator());
    }

    public Fraction minus(Fraction fr) {
        Fraction fr1 = new Fraction(numerator * fr.getDenominator(), denominator * fr.getDenominator());
        Fraction fr2 = new Fraction(fr.getNumerator()*denominator, denominator * fr.getDenominator());
        return new Fraction(fr1.getNumerator() - fr2.getNumerator(), fr1.getDenominator());
    }

    public Fraction minus(int number) {

        Fraction temp = new Fraction(number, 1);
        Fraction fr1 = new Fraction(numerator * temp.getDenominator(), denominator * temp.getDenominator());
        Fraction fr2 = new Fraction(temp.getNumerator()*denominator, denominator * temp.getDenominator());
        return new Fraction(fr1.getNumerator() - fr2.getNumerator(), fr1.getDenominator());
    }

    @Override
    public String toString (){
        return String.format("%s/%s", numerator, denominator);
    }
}
