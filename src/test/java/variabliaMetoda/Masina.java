package variabliaMetoda;

import org.testng.annotations.Test;

public class Masina {

    public String marca;
    public String model;
    public Float pret;
    public Boolean decapotabila;
    public Integer an;
    public Double greutate;

    @Test
    public void metodaTest() {
        afisareMasina();
        System.out.println("===Exemplul 2===");
        afisareOriceMasina("Hyundai", "Ioing", 233.49, 1994, false,2500.8f);
        afisareOriceMasina("BMW", "X", 533.1, 2010, true, 2833.2f);


    }

    //Descriem o masina
    public void afisareMasina () {
        marca = "Mercedes";
        model = "GLS";
        pret = 2500.2f;
        an = 2010;
        decapotabila = true;
        greutate = 54.2;

        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Pretul masinii este " + pret);
        System.out.println("Anul constructiei este " + an);
        System.out.println("Masina este decapotabila? " + decapotabila);
        System.out.println("Greutatea masinii este de " + greutate);
    }

    //Descriem orice masina

    public void afisareOriceMasina (String marca,String model, Double greutate, Integer an, Boolean decapotabila, Float pret) {


        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Pretul masinii este " + pret);
        System.out.println("Anul constructiei este " + an);
        System.out.println("Masina este decapotabila? " + decapotabila);
        System.out.println("Greutatea masinii este de "  + greutate);
    }
}
