package diaryPackage;

import dsa.diaryPackage.Diary;
import dsa.diaryPackage.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;
    @BeforeEach
    public void startWithThis(){
        diary = new Diary("Wale Diary", "4321");
    }
    @Test
    public void diaryCanBeCreatedTest(){
        assertNotNull(diary);
    }

    @Test
    public void entryCanBeCreatedInDiaryTest(){
        Entry entry = diary.createEntry("Cake Time","I love cake time.");
        diary.addEntry(entry);
        assertEquals(1, diary.getNumberOfEntries());
    }

    @Test
    public void multipleEntriesCanBeCreateTest(){
        Entry entry1 = diary.createEntry("Story of my life","It is a beautiful to know that this life is a mystery");
        diary.addEntry(entry1);
        assertEquals(1, diary.getNumberOfEntries());

        Entry entry2 = diary.createEntry("Cake Time","I love cake time.");
        diary.addEntry(entry2);
        assertEquals(2, diary.getNumberOfEntries());

        Entry entry3 = diary.createEntry("Car Time","I just got a new car.");
        diary.addEntry(entry3);
        assertEquals(3, diary.getNumberOfEntries());
    }
    @Test
    public void entryCanBeFoundByTitleTest(){
        Entry entry1 = diary.createEntry("Story of my life","It is a beautiful to know that this life is a mystery");
        diary.addEntry(entry1);
        assertEquals(1, diary.getNumberOfEntries());

        Entry entry2 = diary.createEntry("Cake Time","I love cake time.");
        diary.addEntry(entry2);
        assertEquals(2, diary.getNumberOfEntries());

        Entry entry3 = diary.createEntry("Car Time","I just got a new car.");
        diary.addEntry(entry3);
        assertEquals(3, diary.getNumberOfEntries());

        String foundEntry = diary.findEntryByTitle("Cake Time");
        assertEquals(foundEntry,foundEntry);

        String foundEntry1 = diary.findEntryByTitle("Owo ti de");
        assertEquals( "Entry not found!",foundEntry1);
    }
    @Test
    public void entryCanBeFoundByEntryIdTest(){
        Entry entry1 = diary.createEntry("Story of my life","It is a beautiful to know that this life is a mystery");
        diary.addEntry(entry1);
        assertEquals(1, diary.getNumberOfEntries());

        Entry entry2 = diary.createEntry("Cake Time","I love cake time.");
        diary.addEntry(entry2);
        assertEquals(2, diary.getNumberOfEntries());

        Entry entry3 = diary.createEntry("Car Time","I just got a new car.");
        diary.addEntry(entry3);
        assertEquals(3, diary.getNumberOfEntries());

        String foundEntry = diary.findEntryByEntryId(2);
        assertEquals(foundEntry,foundEntry);

        String foundEntry1 = diary.findEntryByEntryId(5);
        assertEquals( "Entry not found!",foundEntry1);
    }
    @Test
    public void entryCanBeRemovedByTitleTest(){
        Entry entry1 = diary.createEntry("Story of my life","It is a beautiful to know that this life is a mystery");
        diary.addEntry(entry1);
        assertEquals(1, diary.getNumberOfEntries());

        Entry entry2 = diary.createEntry("Cake Time","I love cake time.");
        diary.addEntry(entry2);
        assertEquals(2, diary.getNumberOfEntries());

        Entry entry3 = diary.createEntry("Car Time","I just got a new car.");
        diary.addEntry(entry3);
        assertEquals(3, diary.getNumberOfEntries());

        assertTrue(diary.removeEntryByTitle("Cake Time"));
        assertEquals(2, diary.getNumberOfEntries());

    }

    @Test
    public void entryCanBeRemovedByEntryIdTest(){
        Entry entry1 = diary.createEntry("Story of my life","It is a beautiful to know that this life is a mystery");
        diary.addEntry(entry1);
        assertEquals(1, diary.getNumberOfEntries());

        Entry entry2 = diary.createEntry("Cake Time","I love cake time.");
        diary.addEntry(entry2);
        assertEquals(2, diary.getNumberOfEntries());


        assertTrue(diary.removeEntryByEntryId(2));
        assertEquals(1, diary.getNumberOfEntries());

    }
@Test
    public void multipleEntriesCanBeRemovedTest(){
        Entry entry1 = diary.createEntry("Story of my life","It is a beautiful to know that this life is a mystery");
        diary.addEntry(entry1);
        assertEquals(1, diary.getNumberOfEntries());

        Entry entry2 = diary.createEntry("Cake Time","I love cake time.");
        diary.addEntry(entry2);
        assertEquals(2, diary.getNumberOfEntries());

        Entry entry3 = diary.createEntry("Car Time","I just got a new car.");
        diary.addEntry(entry3);
        assertEquals(3, diary.getNumberOfEntries());

        assertTrue(diary.removeEntryByEntryId(2));
        assertEquals(2, diary.getNumberOfEntries());

         assertTrue(diary.removeEntryByEntryId(2));
         assertEquals(1, diary.getNumberOfEntries());

    }
}
