package PhoneContact;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumbers;
    private static ArrayList<Contact> phoneBook;

    public MobilePhone(String myNumbers) {
        this.myNumbers = myNumbers;
        phoneBook = new ArrayList<>();
    }
   private int findContact(String name){
       for (int i = 0; i < phoneBook.size(); i++) {
           Contact contact = phoneBook.get(i);
           if (contact.getName().equals(name)){
               return i;}
       }
       return -1;
   }

   private int findContact(Contact contact){
        return phoneBook.indexOf(contact);
   }
   public void removeContact(Contact contact){
        if(findContact(contact) >= 0){
            phoneBook.remove(findContact(contact));
        }
   }

   public boolean addContact(Contact contact){
        if (findContact(contact) > 0){
            System.out.println("Contact already exists");
            return false;
        }
        phoneBook.add(contact);
        return true;
   }
   public boolean updateContact(Contact oldContact, Contact newContact){
        if (findContact(oldContact) < 0){
            System.out.println(oldContact.getName() + " not found");
            return false;
        }
        else if (findContact(newContact.getName()) > -1){
            System.out.println(newContact.getName()+ " already exist\n Update unsuccessful");
        }
        phoneBook.set(findContact(oldContact),newContact);
       System.out.println(oldContact.getName()+" has been successfully replaced by "+newContact.getName());
   return true;
    }

    public String queryContact(Contact contact){
        if (findContact(contact) < 0){
            return null;
        }
        return contact.getName();
    }
    public Contact queryContact(String name){
        if(findContact(name) >= 0){
            return phoneBook.get(findContact(name));
        }
        return null;
    }
    public void printContact(){
        for (int i = 0; i < phoneBook.size(); i++) {
            Contact contact = phoneBook.get(i);
            System.out.println("Name: "+contact.getName()+"   |   "+ "Phone number: "+contact.getPhoneNumber());
        }
    }


}
