package Assignments;

public class CreditCardValidation {
    public long getPrefix(long cardNumber, int numberOfDigits) {
        String stringFormOfNumber = Long.toString(cardNumber);
        StringBuilder stringBuilder = new StringBuilder();
        if(cardNumber > numberOfDigits) {
            for (int i = 0; i < numberOfDigits; i++) {
                stringBuilder.append(stringFormOfNumber.charAt(i));
            }
           return Long.parseLong(String.valueOf(stringBuilder));
        }
        return cardNumber;
    }

    public int getSize(long cardNumber) {
        String stringFormOfNumber = Long.toString(cardNumber);
        return stringFormOfNumber.length();
    }

    public boolean prefixMatched(long cardNumber, int prefix) {
        String stringFormOfNumber = Long.toString(cardNumber);
        String stringFormOfPrefix = String.valueOf(prefix);

        return stringFormOfNumber.charAt(0) == stringFormOfPrefix.charAt(0);

    }

    public int sumOfOddPlace(long cardNumber) {
        int sum = 0;
        String stringFormOfNumber = Long.toString(cardNumber);
        for (int i = (stringFormOfNumber.length()-1); i > 0; i-=2) {
            sum = sum + Integer.parseInt(String.valueOf(stringFormOfNumber.charAt(i)));
        }
        return sum;
    }

    public int getDigit(int number) {
        String stringFormOfNumber = Long.toString(number);
        if(stringFormOfNumber.length() == 1){
            return number;
        }
        else if(stringFormOfNumber.length() == 2){
            return Integer.parseInt(String.valueOf(stringFormOfNumber.charAt(0))) + Integer.parseInt(String.valueOf(stringFormOfNumber.charAt(1)));
        }
        return 0;
    }

    public int sumOfDoubleEvenPlace(long cardNumber) {
        int sum = 0;
        String stringFormOfNumber = Long.toString(cardNumber);
        for (int i = stringFormOfNumber.length()-2; i >= 0; i-=2) {
            int num = Integer.parseInt(String.valueOf(stringFormOfNumber.charAt(i))) * 2;
            sum = sum + getDigit(num) ;
        }
        return sum;
    }


    public boolean isValid(long cardNumber) {
        return (sumOfOddPlace(cardNumber) + sumOfDoubleEvenPlace(cardNumber)) % 10 == 0;
    }
}

