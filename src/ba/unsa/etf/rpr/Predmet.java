package ba.unsa.etf.rpr;

import java.util.Objects;

import static java.lang.System.exit;

public class Predmet {

    public int brojStudenata = 0;
    public Student studenti[];
    private String imePredmeta;
    private String sifraPredmeta;
    final int maxBrojStrudenata;

    public Predmet(String imePredmeta, String sifraPredmeta, int n) {
        maxBrojStrudenata = n;
        setImePredmeta(imePredmeta);
        setSifraPredmeta(sifraPredmeta);
        studenti = new Student[n];
        for(int i = 0; i < n; i++)
            studenti[i] = null;
    }

    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public String getSifraPredmeta() {
        return sifraPredmeta;
    }

    public void setSifraPredmeta(String sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }
    public void Izlistaj(){
        for(int i = 0; i < brojStudenata; i++){
            System.out.println(i + 1 + ". " + studenti[i]);
        }
    }

    public void upisi(Student s){
        if(Objects.equals(brojStudenata, maxBrojStrudenata)){
            System.out.println("Max broj studenata dostignut");
            exit(0);
        }
        studenti[brojStudenata] = new Student(s);
        brojStudenata++;
    }

    public void ispisi(Student s){
        for(int i = 0;i < brojStudenata; i++){
            if(s.getBrojIndexa() == studenti[i].getBrojIndexa()){
                for(int j = i; j < brojStudenata -1; j++)
                    studenti[j] = studenti[j+1];


                brojStudenata--;
                studenti[brojStudenata] = null;
                i = brojStudenata;
            }
        }
    }
}
