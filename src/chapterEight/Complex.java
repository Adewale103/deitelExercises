package chapterEight;


public class Complex {
    private static final String i = "i";
    private final double realPart;
    private final double imaginaryPart;

    public Complex(double realPart,double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public Complex(){
        this(0.67,0.12);
    }
    public static void addComplexNumbers(double realPart1, double imaginaryPart1, double realPart2, double imaginaryPart2){
        double realPart = realPart1+realPart2;
        double imaginaryPart = (imaginaryPart1) + (imaginaryPart2);
        System.out.printf("The sum of the two complex numbers is approximately (%.2f, %.2f%s)%n",realPart,imaginaryPart,i);
    }

    public static void subtractComplexNumbers(double realPart1, double imaginaryPart1, double realPart2, double imaginaryPart2){
        double realPart = realPart1-realPart2;
        double imaginaryPart = (imaginaryPart1) - (imaginaryPart2);
        System.out.printf("The difference of the two complex numbers is approximately (%.2f, %.2f%s)%n",realPart,imaginaryPart,i);
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }
}
