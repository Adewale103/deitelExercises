package chapterFourteen;

public class TokenizingPhoneNumbers {
    public static void main(String[] args) {
        String phoneNumber = "(455) 456-6785";
        tokenizePhoneNumber(phoneNumber);
    }
    private static  void tokenizePhoneNumber(String phoneNumber){
        StringBuilder builder = new StringBuilder();
        String[] dividedNumber = phoneNumber.split(" ");
        String address = dividedNumber[0].substring(1,4);
        String[] otherNumbers = dividedNumber[1].split("-");
        builder.append(address).append("-");
        for (String otherNumber : otherNumbers) {
            builder.append(otherNumber);
        }
        System.out.println(builder);

    }
}
