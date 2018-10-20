package ba.unsa.etf.rpr;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndexa;


    public Student(Student s){
        setIme(s.getIme());
        setPrezime(s.getPrezime());
        setBrojIndexa(s.getBrojIndexa());
    }
    public Student(String ime, String prezime, int index){
        setIme(ime);
        setPrezime(prezime);
        setBrojIndexa(index);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }
    @Override
    public String toString(){
        String s = (getIme() + " " + getPrezime()+ " (" + getBrojIndexa() + ")");
        return s;
    }
    public boolean equals(Student s){
        if(s.getIme().equals(this.getIme())
                && s.getPrezime().equals(this.getPrezime())
                && s.getBrojIndexa() == this.getBrojIndexa())
        return true;
        else return false;
    }

}
