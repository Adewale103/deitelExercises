package diaryPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EntryTest {
    private Entry entry;
    DateTimeFormatter dd = DateTimeFormatter.ofPattern("E, dd-MM-yyy, hh:mma");
    private final String date = dd.format(LocalDateTime.now());

    @BeforeEach
    public void startWithThis(){
        entry = new Entry("Story of my life","It is a beautiful to know that this life is a mystery");
    }
    @Test
    public void entryCanBeCreated(){
        assertNotNull(entry);
    }

    @Test
    public void dateCanBeGeneratedTest(){
        assertEquals(date, entry.getDate());
    }

    @Test
    public void titleCanBeAddedTest(){
        assertEquals("Story of my life", entry.getTitle());
    }

    @Test
    public void bodyCanBeAddedTest(){
        assertEquals("It is a beautiful to know that this life is a mystery", entry.getBody());
    }

}
