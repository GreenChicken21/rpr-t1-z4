package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void equals() {
        Student st1 = new Student("Ahmed", "Ahmic", 1234);
        Student st2 = new Student("Ana", "Anic", 2341);
        assertFalse(st1.equals(st2));
        assertTrue(st1.equals(st1));


    }

    @Test
    void getIme() {
        Student st1 = new Student("Ahmed", "Ahmic", 1234);
        assertEquals("Ahmed", st1.getIme());
    }

    @Test
    void setIme() {
        Student st1 = new Student("Ahmed", "Ahmic", 1234);
        st1.setIme("Amar");
        assertEquals("Amar", st1.getIme());
    }

    @Test
    void getPrezime() {
        Student st1 = new Student("Ahmed", "Ahmic", 1234);
        assertEquals("Ahmic", st1.getPrezime());
    }

    @Test
    void setPrezime() {
        Student st1 = new Student("Ahmed", "Ahmic", 1234);
        st1.setPrezime("Ahmedic");
        assertEquals("Ahmedic", st1.getPrezime());
    }

    @Test
    void getBrojIndexa() {
        Student st1 = new Student("Ahmed", "Ahmic", 1234);
        assertEquals(1234,st1.getBrojIndexa());
    }

    @Test
    void setBrojIndexa() {

        Student st1 = new Student("Ahmed", "Ahmic", 1234);
        st1.setBrojIndexa(17946);
        assertEquals(17946,st1.getBrojIndexa());

    }
}