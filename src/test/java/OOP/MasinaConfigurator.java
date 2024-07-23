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
    //Polimorfism = conceptul prin care o metoda poate avea implementari diferite
    //Polimorfismul poate sa fie de 2 feluri: dinamic(override) si static (overload)
    //Polimorfism dinamic = intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //Polimorfismul dinamic este prezent doar la mostenire
    //Polimorfismul static = daca avem nevoie ca o metoda sa fie folosita in diferite circumstante putem defini mai multe metode cu
    //                       acelasi nume avand un numar de parametrii/tip parametrii diferiti

    public void infoMasina(){
        System.out.println("Marca masinii este: " +marca);
        System.out.println("Modelul masinii este: " +model);
        System.out.println("Anul de fabriactie al masinii este: " +an);
    }

    //Polimorfism dinamic
    public void pornesteMotor () {
        System.out.println("Masina se proneste cu ajutorul cheii.");
    }

    public void deschidereGeam () {
        System.out.println("Geamurile de deschid electric.");
    }

    //Polimorfism static
    public void promotieDacia () {
        System.out.println("Pentru luna iulie Dacia nu are promotii.");
    }

    public void promotieDacia (String ticket) {
        System.out.println("Daca ai " + ticket + " la Dacia beneficiezi de reduceri.");
    }

    public void promotieDacia (Integer reducere) {
        System.out.println("Daca ofera " + reducere + "% reducere.");
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
