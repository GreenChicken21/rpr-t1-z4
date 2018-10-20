package ba.unsa.etf.rpr;

public class Program {


    public static void main(String[] args) {
        // write your code here
        Predmet p = new Predmet("RPR", "rpr-ri2", 5);
        Student st1 = new Student("Ahmed", "Ahmic", 1234);
        Student st2 = new Student("Ana", "Anic", 2341);
        Student st3 = new Student("Franjo", "Franjevac", 1432);
        p.upisi(st1);
        p.upisi(st2);
        p.upisi(st3);
        p.Izlistaj();
        p.ispisi(st2);
        p.Izlistaj();
    }
}
