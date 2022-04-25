package PhoneContact;

import java.util.Scanner;

public class Main {
    private static final Scanner input =new Scanner(System.in);
    private static final MobilePhone mobilePhone = new MobilePhone("08101851250");

    public static void main(String[] args) {
        boolean quit =false;
        startPhone();
        displayOptions();
        while(!quit) {
            System.out.println("Enter your option (Press 6 to view available options: )");
            int option = input.nextInt();
            input.nextLine();
            switch (option){
                case 0:
                    System.out.println("Shutting down........");
                    System.out.println("done..");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    checkContact();
                    break;
                case 6:
                    displayOptions();
                    break;
            }

        }
    }
        private static void printContacts(){
        mobilePhone.printContact();
        }
        private static void addContact(){
            System.out.println("Enter name:");
            String name = input.nextLine();

            System.out.println("Enter phone number:");
            String phoneNumber = input.nextLine();
            if(mobilePhone.queryContact(name) != null){
                System.out.println("Contact already exists");
            }
            Contact newContact = Contact.createContact(name, phoneNumber);
            mobilePhone.addContact(newContact);
            System.out.println(newContact.getName()+" successfully added to contact list");
        }
        private static void removeContact(){
            try{
                System.out.println("Enter the name of contact you want to remove");
            String name = input.nextLine();
            if(mobilePhone.queryContact(name) == null){
                System.out.println("Contact  not found");
            }
            Contact contact = mobilePhone.queryContact(name);
            mobilePhone.removeContact(contact);
            System.out.println(contact.getName() +" has been successfully removed");}

            catch(NullPointerException e){
                System.out.println("Next time, enter a name on your contact list");
            }
        }
        private static void startPhone(){
            System.out.println("Phone is starting........");
        }
        private static void checkContact(){
            System.out.println("Enter name: ");
            String name = input.nextLine();
        if (mobilePhone.queryContact(name) == null){
            System.out.println("contact not found...");
        }
        Contact contact = mobilePhone.queryContact(name);
            System.out.println("Name: "+ contact.getName()+"  Phone number: "+contact.getPhoneNumber());
        }
        private static void updateContact(){
            System.out.println("Enter name to update contact; ");
            String name = input.nextLine();
            Contact oldContact = mobilePhone.queryContact(name);
            if(oldContact == null){
                System.out.println("contact not found on the list..");
            }
            System.out.println("Enter new name:");
            String newName = input.nextLine();

            System.out.println("Enter new phoneNumber:");
            String phoneNumber = input.nextLine();

            Contact newContacts = Contact.createContact(newName,phoneNumber);
            mobilePhone.updateContact(oldContact,newContacts);
        }
        private static void displayOptions(){
            System.out.println("Available options");
            System.out.println("""
                    Press:
                    0.--> to shutdown
                    1.--> to print contacts
                    2.--> to add contact
                    3.--> to remove contact
                    4.--> to update contact
                    5.--> to query contact
                    6.--> to display options""");
        }
    }

