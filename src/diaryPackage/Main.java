package diaryPackage;

import java.util.Scanner;

public class Main {
    private static Diary diary;
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    public static void runApp(){

        System.out.println("Create username: ");
        String username = input.nextLine();

        System.out.println("Create password: ");
        String password = input.nextLine();

        diary = new Diary(username, password);

        System.out.println("Welcome "+username+"....");
        System.out.println("Your secret is safe here!!");


        boolean quit = false;
        while(!quit){
            String prompt = """
                    Press:
                    1. --> To add new entry
                    2. --> To find entry
                    3. --> To remove entry
                    4. --> To update entry
                    5. --> To view all entries
                    6. --> To change password
                    7. --> To exit""";
            System.out.println(prompt);
            int response = input.nextInt();
            input.nextLine();
            switch (response) {
                case 1 -> addEntry();
                case 2 -> findEntry();
                case 3 -> removeEntry();
                case 4 -> updateEntry();
                case 5 -> viewAllEntries();
                case 6 -> changePassword();
                case 7 -> {
                    System.out.println("Bye! Remember to pen down your thoughts tomorrow too!");
                    quit = true;
                }
                default -> runApp();
            }
            System.out.println();
        }
    }

    private static void changePassword() {
            System.out.println("Enter old password: ");
            String oldPassword = input.nextLine();
            if (diary.validatePassword(oldPassword)) {
                System.out.println("Enter new password: ");
                String newPassword = input.nextLine();

                diary.setPassword(newPassword);
                System.out.println("Password successfully changed... ");
            } else System.out.println("Incorrect password..");
        }

    private static void viewAllEntries() {
        diary.viewAllEntries();
    }

    private static void updateEntry() {
            System.out.println("Enter the title: ");
            String oldTitle = input.nextLine();

            if (!diary.confirmEntry(oldTitle)) {
                System.out.println("Entry not found! ");
            } else {

                System.out.println("Enter new title: ");
                String newTitle = input.nextLine();

                System.out.println("Enter new body: ");
                String newBody = input.nextLine();

                Entry entry = diary.createEntry(newTitle, newBody);
                if (diary.editEntry(oldTitle, entry)) {
                    System.out.println("Entry successfully updated ");
                }
            }
        }

    private static void removeEntryByTitle() {
            System.out.println("Enter the title: ");
            String title = input.nextLine();

            if(diary.removeEntryByTitle(title)){
                System.out.println("Entry with "+ title+" as title successfully removed! ");
            }
            else System.out.println("Entry not found! ");

        }
    private static void removeEntryByEntryNumber() {
        System.out.println("Enter entry number: ");
        int entryNumber = input.nextInt();


        if(diary.removeEntryByEntryId(entryNumber)){
            System.out.println("Entry with entry Number "+ entryNumber+" as title successfully removed! ");
        }
        else System.out.println("Entry not found! ");

    }

    private static void findEntry() {
        System.out.println("""
                How do you wish to find entry?
                1. -> By Title
                2. -> By Entry Number""");
        int response = input.nextInt();
        switch (response) {
            case 1 -> findEntryByTitle();
            case 2 -> findEntryByEntryNumber();
            default -> runApp();
        }
    }

    private static void removeEntry() {
        System.out.println("""
                How do you wish to remove entry?
                1. -> By Title
                2. -> By Entry Number""");
        int response = input.nextInt();
        switch (response) {
            case 1 -> removeEntryByTitle();
            case 2 -> removeEntryByEntryNumber();
            default -> runApp();
        }
        input.nextLine();
    }
    private static void findEntryByEntryNumber() {
        System.out.println("Enter the entry number: ");
        int entryNumber = input.nextInt();
        input.nextLine();
        String result = diary.findEntryByEntryId(entryNumber);
        System.out.println(result);
    }

    private static void findEntryByTitle() {
        System.out.println("Enter the title: ");
        String title = input.nextLine();
        String result = diary.findEntryByTitle(title);
        System.out.println(result);
    }

    private static void addEntry() {
        System.out.println("Enter the title: ");
        String title = input.nextLine();

        System.out.println("Enter the body of the entry: ");
        String body = input.nextLine();

        Entry entry = diary.createEntry(title,body);
        diary.addEntry(entry);
        System.out.println(title+" successfully added as new entry. ");
        }

}
