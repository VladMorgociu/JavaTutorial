package variabliaMetoda;

import org.testng.annotations.Test;

public class Cursant {

    //Acesta e un comentariu
    //Recunoastem o clasa intr-un fisier Java dupa cuvantul cheie "class"
    //Intr-un fisier Java putem avea o multime de clase pe care le diferentiem prin numele lor
    //Nu este un practice bun in Java sa avem intr-un fisier mai multe clase
    //In fiecare clasa trebuie sa definim un nume
    //Intelegem printr-o clasa ca fiind un sablon specific din viata reala
    //Intr-o clasa putem defini variabile si metode
    //Variabila = proprietatea unei clase
    //Intr-o clasa putem avea o multime de variabile
    //Variabilele se diferentiaza prin tip si nume
    //Variabilele pot fi de doua feluri: global si local
    //Varabila globala = proprietate vizibila oriunde in cod
    //Variabila locala = proprietate vizibila doar in locul definit
    //Tipuri de date: string, integer, double/float, character, boolean

    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areRestante;

    //Metoda = actiunea unei clase
    //Intr-o clasa putem avea o multime de metode diferentiate prin numele acestora
    //Exista 2 tipuri de metode: void si return
    //Metoda void = actiune pe care vrem sa o afisam / interpretam fara a fi nevoie sa o returnam
    //Pentru o metoda trebuie sa specificam un access control (public), (), si {}

    @Test
    public void metodaTest ()
    {
      descrieCursant();
      primesteBursa();
    }


    public void primesteBursa () {
        Integer bursa = 1000;
        System.out.println("Bursa cursantului este" + bursa);
    }


    public void descrieCursant () {
        nume = "Morgociu";
        prenume = "Vlad";
        varsta = 27;
        adresa = "Strada Exemplu, nr. 211";
        inaltime = 1.81;
        greutate = 81.00f;
        sex='M';
        areRestante = true;

        System.out.println("Numele cursantului este " + nume);
        System.out.println("Prenumele cursantului este " + prenume);
        System.out.println("Varsta cursantului este " + varsta);
        System.out.println("Adresa cursantului este " + adresa);
        System.out.println("Inaltimea cursantului este " + inaltime);
        System.out.println("Greutatea cursantului este " + greutate);
        System.out.println("Sexul cursanutlui este " + sex);
        System.out.println("Are cursantul restante " + areRestante);
    }
}
