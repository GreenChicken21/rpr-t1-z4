package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void izlistaj() {

        Predmet p = new Predmet("RPR", "rpr-ri2", 5);
        Student st1 = new Student("Ahmed", "Ahmic", 1234);
        p.upisi(st1);
        assertEquals("Ahmed Ahmic (1234)", p.studenti[0].toString());
    }

    @Test
    void upisi() {
        Predmet p = new Predmet("RPR", "rpr-ri2", 5);
        Student st1 = new Student("Ahmed", "Ahmic", 1234);
        p.upisi(st1);
        assertEquals(p.brojStudenata, 1);
        assertEquals(p.studenti[0], st1 );
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