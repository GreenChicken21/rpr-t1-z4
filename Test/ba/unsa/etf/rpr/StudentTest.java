package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void toString() {
        Student st1 = new Student("Ahmed", "Ahmic", 1234);
        Student st2 = new Student("Ana", "Anic", 2341);
        Student st3 = new Student("Franjo", "Franjevac", 1432);


        assertEquals("Ahmed Ahmic (1234)", st1.toString());
        assertEquals("Ana Anic (2341)", st2.toString());
        assertEquals("Franjo Franjevac (1432)", st3.toString());

    }

    @Test
    void equals() {
        Student st1 = new Student("Ahmed", "Ahmic", 1234);
        Student st2 = new Student("Ana", "Anic", 2341);
        assertEquals(st1.equals(st2), false);
        assertEquals(st1.equals(st1), true);


    }
}