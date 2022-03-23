package Personal;

import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Enter
                1.-> Phone book
                2.-> Messages
                3.-> Chat
                4.-> Call register
                5.-> Tones
                6.-> Settings
                7.-> Call divert
                8.-> Games
                9.-> Calculator
                10.-> Reminders
                11.-> Clock
                12.-> Profiles
                13.-> SIM services""");
        int menuOption = input.nextInt();
        switch (menuOption) {
            case 1:
                System.out.println("""
                        Enter
                        1.-> Search
                        2.-> Service Nos
                        3.-> Add Name
                        4.-> Erase
                        5.-> Edit
                        6.-> Assign tone
                        7.-> Send b'card
                        8.-> Options
                        9.-> Speed dials
                        10.-> Voice tags""");
                int phoneBook = input.nextInt();
                switch (phoneBook) {
                    case 8:
                        System.out.println("""
                                Enter
                                1.-> Type of view
                                2.-> Memory status""");
                        int Options = input.nextInt();
                        break;
                    default:
                        System.out.println("......");
                        break;
                }
                break;
            case 2:
                System.out.println("""
                        Enter
                        1.-> Write messages
                        2.-> Inbox
                        3.-> Outbox
                        4.-> Picture messages
                        5.-> Templates
                        6.-> Smileys
                        7.-> Message settings
                        8.-> info service
                        9.-> Voice mailbox number
                        10.-> Service command editor""");
                int messagesOption = input.nextInt();
                switch (messagesOption) {
                    case 7:
                        System.out.println("""
                                Enter
                                1.-> Set 1
                                2.-> Common""");
                        int mes_set = input.nextInt();
                        switch (mes_set) {
                            case 1:
                                System.out.println("""
                                        Enter
                                        1.-> Message centre number
                                        2.-> Message sent as
                                        3.-> Message validity""");

                                int set = input.nextInt();
                                break;
                            case 2:
                                System.out.println("""
                                        Enter
                                        1.-> Delivery reports
                                        2.-> Reply via same centre
                                        3.-> Character support""");

                                int common = input.nextInt();
                                break;
                            default:
                                System.out.println("......");
                                break;
                        }
                    default:
                        System.out.println("......");
                        break;
                }
                break;
            case 3:
                System.out.println("Chat");
                break;
            case 4:
                System.out.println("""
                        Enter
                        1.-> Missed calls
                        2.-> Received calls
                        3.-> Dialled numbers
                        4.-> Erase recent call lists
                        5.-> Show call duration
                        6.-> Show call cost
                        7.-> Call cost settings
                        8.-> Prepaid credit""");
                int callReg = input.nextInt();
                switch (callReg) {
                    case 5:
                        System.out.println("""
                                Enter
                                1.-> Last call duration
                                2.-> All calls duration
                                3.-> Received calls duration
                                4.-> Dialled calls duration
                                5.-> Clear timer""");
                        int duration = input.nextInt();
                        break;
                    case 6:
                        System.out.println("""
                                Enter
                                1.-> Last call cost
                                2.-> All calls cost
                                3.-> Clear counters""");
                        int call_cost = input.nextInt();
                        break;
                    case 7:
                        System.out.println("""
                                Enter
                                1.-> Call cost limit
                                2.-> Show costs in
                                """);
                        int callCost = input.nextInt();
                        break;
                    default:
                        System.out.println("......");
                        break;
                }
                break;
            case 5:
                System.out.println("""
                        Enter
                        1.-> Ringing Tone
                        2.-> Ringing Volume
                        3.-> Incoming call alert
                        4.-> Composer
                        5.-> Message alert tone
                        6.-> Keypad tones
                        7.-> Warning and game tones
                        8.-> Vibrating alert
                        9.-> Screen saver""");
                int tones = input.nextInt();
                break;
            case 6:
                System.out.println("""
                        Enter
                        1.-> Call settings
                        2.-> Phone settings
                        3.-> Security settings
                        4.-> Restore factory settings""");
                int settings = input.nextInt();
                switch (settings) {
                    case 1:
                        System.out.println("""
                                Enter
                                1.-> Automatic redial
                                2.-> Speed dialing
                                3.-> Call waiting options
                                4.-> Own number sending
                                5.-> Phone line in use
                                6.-> Automatic answer
                                """);
                        int call_settings = input.nextInt();
                        break;

                    case 2:
                        System.out.println("""
                                Enter
                                1.-> Language
                                2.-> Cell info display
                                3.-> Welcome note
                                4.-> Network selection
                                5.-> Lights
                                6.-> Confirm sim settings action
                                """);
                        int phone_settings = input.nextInt();
                        break;

                    case 3:
                        System.out.println("""
                                Enter
                                1.-> PIN code request
                                2.-> Call barring service
                                3.-> Fixed dialing
                                4.-> Closed user group
                                5.-> Phone security
                                6.-> Change access codes
                                """);
                        int security_settings = input.nextInt();
                        break;
                    case 4:
                        System.out.println("""
                                Enter
                                1.-> Restore factory settings""");
                        int factory_settings = input.nextInt();
                        break;
                    default:
                        System.out.println("......");
                        break;
                }
                break;
            case 7:
                System.out.println("Call divert");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminder");
                break;
            case 11:
                System.out.println("""
                        Enter
                        1.-> Alarm clock
                        2.-> Clock settings
                        3.-> Date setting
                        4.-> Stopwatch
                        5.-> Countdown timer
                        6.-> Auto update of date and time""");
                int clock = input.nextInt();
                break;
            case 12:
                System.out.println("Profiles");
                break;
            case 13:
                System.out.println("SIM services");
                break;
            default:
                System.out.println("incorrect entry");
                break;
        }

    }
}
                
                


