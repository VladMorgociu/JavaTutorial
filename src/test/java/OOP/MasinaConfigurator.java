package OOP;

public class MasinaConfigurator {

    private String marca;
    private String model;
    private Integer an;


    public MasinaConfigurator(String marca, String model, Integer an){
        this.marca = marca;
        this.model = model;
        this.an = an;

    }

    //OOP = Programare orientata pe obiecte
    //OOP = 4 PRINCIPII -> Mostenire, Incapsulare, Polimorfism, Abstractizare
    //Mostenirea = conceptul prin care o clasa mosteneste o alta clasa;
    //Clasa care este mostenita = parinte
    //Clasa care mosteneste = copil
    //In Java putem mosteni o singura clasa
    //Mostenirea se realizeaza cu cuvantul "extends"
    //Cand copilul mosteneste parintele, copilul trebuie sa apeleze consturctorul din parinte
    //Copilul va avea acces la proprietatile/metodele din clasa parinte (daca se foloseste public/protected/default)
    //Pentru a apela constructorul din parinte in copil se foloseste cuvantul 'super'

    //Incapsularea=conceptul prin care putem sa setam anumite restrictii de vizibilitate pentru proprietati/metode

    public void infoMasina(){
        System.out.println("Marca masinii este: " +marca);
        System.out.println("Modelul masinii este: " +model);
        System.out.println("Anul de fabriactie al masinii este: " +an);
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public Integer getAn() {
        return an;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
