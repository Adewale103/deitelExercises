package dsa.diaryPackage;

import java.util.ArrayList;

public class Diary {
    private final String dairyName;
    private final ArrayList<Entry> entries;
    private String password;


    public Diary(String dairyName, String password) {
        entries = new ArrayList<>();
        this.dairyName = dairyName;
        this.password = password;
    }

    public void changePassword(String password) {
        this.password = password;
    }


    public Entry createEntry(String title, String body) {
        return new Entry(title, body);
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public String findEntryByTitle(String entryTitle) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getTitle().equals(entryTitle)) {
                return entry.toString();
            }
        }
        return "Entry not found!";
    }

    public String findEntryByEntryId(int EntryId) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (EntryId - 1 == i) {
                return entry.toString();
            }
        }
        return "Entry not found!";
    }

    public boolean removeEntryByTitle(String entryTitle) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (entry.getTitle().equals(entryTitle)) {
                entries.remove(entry);
                return true;
            }
        }
        return false;
    }

    public boolean removeEntryByEntryId(int EntryId) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (EntryId - 1 == i) {
                entries.remove(entry);
                return true;
            }
        }
        return false;
    }

    public boolean editEntry(String title, Entry newEntry) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (title.equals(entry.getTitle())) {
                entries.set(i, newEntry);
                return true;
            }

        }
        return false;
    }

    public boolean confirmEntry(String title) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            if (title.equals(entry.getTitle())) {
                return true;
            }
        }
        return false;

    }

    public void viewAllEntries() {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);
            System.out.println(entry.toString());
        }
    }
    public boolean validatePassword(String password){

        return this.password.equals(password);
    }

}
