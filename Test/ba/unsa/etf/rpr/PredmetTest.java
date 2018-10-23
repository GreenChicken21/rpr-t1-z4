package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void getImePredmeta() {
        Predmet p1 = new Predmet ("predmet1", "p1", 5);
        assertEquals("predmet1",p1.getImePredmeta());
    }

    @Test
    void setImePredmeta() {
        Predmet p1 = new Predmet ("predmet1", "p1", 5);
        p1.setImePredmeta("Predmet1");
        assertEquals("Predmet1",p1.getImePredmeta());
    }

    @Test
    void getSifraPredmeta() {
        Predmet p1 = new Predmet ("predmet1", "p1", 5);
        assertEquals("p1",p1.getSifraPredmeta());
    }

    @Test
    void setSifraPredmeta() {
        Predmet p1 = new Predmet ("predmet1", "p1", 5);
        p1.setSifraPredmeta("P1");
        assertEquals("P1",p1.getSifraPredmeta());
    }
    @Test
    void upisi() {
        Predmet p = new Predmet("RPR", "rpr-ri2", 5);
        Student st1 = new Student("Ahmed", "Ahmic", 1234);
        p.upisi(st1);
        assertEquals(p.brojStudenata, 1);
        assertTrue(p.studenti[0].equals(st1));
    }



    @Test
    void ispisi() {
        Predmet p = new Predmet("RPR", "rpr-ri2", 5);
        Student st1 = new Student("Ahmed", "Ahmic", 1234);
        p.upisi(st1);
        p.ispisi(st1);
        assertEquals(p.brojStudenata, 0);
        assertEquals(p.studenti[0], null );
    }


}