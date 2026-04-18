/*
My Contacts App with users register, log in, and manage contacts (create, view,
search, edit, delete). Supports tagging, notes, and optional sync/backup/export
*/

import java.util.ArrayList;
import java.util.Scanner;

class Contacts {    
    private String contactName;
    private String contactNumber;

    Contacts() {// only public protected private modifier allowed for constructor
        System.out.println("WELCOME TO CONTACT APP !!");

    }

    public Contacts(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;

    }

    public String getContactName() {
        return contactName;
    }

    public String getNumber() {
        return contactNumber;
    }
}

public class MyContact {
    private ArrayList<Contacts> contactList = new ArrayList<>();

    public boolean validateNumber(String contactNumber) {
        return contactNumber.matches("\\d{10}");
    }

    public void createContact(String contactName, String contactNumber) {
        if (validateNumber(contactNumber)) {

            contactList.add(new Contacts(contactName, contactNumber));
            System.out.println("Contact added !");
            return;
        }
        System.out.println("Number length should be equal to 10 digits .");
        System.out.println("Contact not create !");

    }

    public void deleteContact(String name) {

        for (int i = contactList.size() - 1; i >= 0; i--) {
            String foundName = contactList.get(i).getContactName();

            if (foundName.equals(name)) {
                contactList.remove(i);
                System.out.println("Contact deleted !");
                return;
            }
        }

        System.out.println("Contact not found !");

    }

    public String viewContact(String name) {
        for (int i = contactList.size() - 1; i >= 0; i--) {
            String searchName = contactList.get(i).getContactName();
            if (searchName.equals(name)) {
                String searchNumber = contactList.get(i).getNumber();
                return "Contact name is " + searchName + " and number is " + searchNumber;
            }
        }
        return "Contact not found !";

    }

    public void editContact(String name) {
        for (int i = contactList.size() - 1; i >= 0; i++) {

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyContact myContact = new MyContact();
        while (true) {
            System.out.println("========================================");
            System.out.println("========================================");

            System.out.println("1. For add contact");
            System.out.println("2. For remove contact");
            System.out.println("3. For search contact");
            System.out.println("4. For exit system ");
            System.out.println("Enter input from above :");
            try {

                int input = Integer.parseInt(scanner.nextLine().trim());

                switch (input) {
                    case 1:
                        System.out.println("Enter name :");
                        String name1 = scanner.nextLine().trim().toLowerCase();
                        System.out.println("Enter phone number :");
                        String number = scanner.nextLine().trim();
                        // validate
                        myContact.createContact(name1, number);
                        break;
                    case 2:
                        System.out.println("Enter name for delete contact :");
                        String name2 = scanner.nextLine().trim().toLowerCase();
                        myContact.deleteContact(name2);
                        break;
                    case 3:
                        System.out.println("Enter name for search contact details :");
                        String name3 = scanner.nextLine().trim().toLowerCase();
                        System.out.println(myContact.viewContact(name3));
                        break;
                    case 4:
                        System.out.println("System off !");
                        System.exit(input);
                    default:
                        System.out.println("Enter correct input !");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Enter correct input  " + e);
            }

        }

    }

}

/*
 * add name and number
 * remove name and number
 * search name to get number
 * 
 */