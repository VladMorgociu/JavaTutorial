package tema;

import org.testng.annotations.Test;

public class Fruct {

    //descriem un fruct
    //dam proprietati
    //@Test
    //6-7 fructe prin schema de parametrizare
    public String nume;
    public String culoare;
    public Double greutate;
    public Boolean esteCopt;
    public Integer numarBucati;
    public Float pretKg;

    @Test
    public void metodaTest() {

        System.out.println("===Exemplul 1===");
        descriereFruct();

        System.out.println("===Exemplul 2===");
        descriereOriceFruct("Mar", "Rosu", 232.8, true, 4, 10.22f);
        descriereOriceFruct("Banana", "Galben", 704.1,true, 3, 9.99f);
        descriereOriceFruct("Pere", "Verde", 511.3, false,2, 19.99f);
        descriereOriceFruct("Struguri", "Albi", 449.23, true, 2, 16.89f);
        descriereOriceFruct("Portocala", "Portocalie", 134.71, true, 1, 15.21f);

    }

    //Descriere un anumit fruct
    public void descriereFruct() {
        nume = "Kiwi";
        culoare = "verde";
        greutate = 233.6;
        esteCopt = false;
        numarBucati = 5;
        pretKg = 11.99f;

        System.out.println("Numele fructului este " + nume);
        System.out.println("Culoarea fructului este " + culoare);
        System.out.println("Greutatea fructului este " + greutate + " grame");
        System.out.println("Fructul este copt = " + esteCopt);
        System.out.println("Cate bucati avem? " + numarBucati);
        System.out.println("Cat costa per KG? " + pretKg + " lei");

    }

    public void descriereOriceFruct(String nume, String culoare, Double greutate, Boolean esteCopt, Integer numarBucati, Float pretKg) {

        System.out.println("Numele fructului este " + nume);
        System.out.println("Culoarea fructului este " + culoare);
        System.out.println("Greutatea fructului este " + greutate + " grame");
        System.out.println("Fructul este copt = " + esteCopt);
        System.out.println("Cate bucati avem? " + numarBucati);
        System.out.println("Cat costa per KG? " + pretKg + " lei");
    }
}



