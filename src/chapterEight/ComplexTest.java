package chapterEight;

public class ComplexTest {
    public static void main(String[] args) {
        Complex complexNumber1 = new Complex(7.00,2.24);
        Complex complexNumber2 = new Complex(3.00,1.18);

        Complex.addComplexNumbers(complexNumber1.getRealPart(),complexNumber1.getImaginaryPart(),
                complexNumber2.getRealPart(),complexNumber2.getImaginaryPart());

        Complex.subtractComplexNumbers(complexNumber1.getRealPart(),complexNumber1.getImaginaryPart(),
                complexNumber2.getRealPart(),complexNumber2.getImaginaryPart());

    }
}
