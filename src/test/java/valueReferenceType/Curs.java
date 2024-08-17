package valueReferenceType;

public class Curs {

    private String descriere;
    private String titlu;
    private Integer numarCursanti;

    public Curs(String descriere, String titlu, Integer numarCursanti) {
        this.descriere = descriere;
        this.titlu = titlu;
        this.numarCursanti = numarCursanti;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Integer getNumarCursanti() {
        return numarCursanti;
    }

    public void setNumarCursanti(Integer numarCursanti) {
        this.numarCursanti = numarCursanti;
    }

    public void prezentareCurs() {
        System.out.println("Descrierea este: " + descriere);
        System.out.println("Titlul este: " + titlu);
        System.out.println("Numarul total de cursanti este: " + numarCursanti);
    }
}
