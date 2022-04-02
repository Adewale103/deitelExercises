package ClassWork;

import java.security.SecureRandom;

public class PasswordGenerator {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        char[] array = {'1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j',
                'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F',
                'G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','!','@','#','$','%','^','&','*','?'};
        char password = ' ';
        int x = 1;
        while(x < 13){
            password = array[random.nextInt(67)];
            System.out.print(password);
            x++;
        }


        }

    }

