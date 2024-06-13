package tema;

import org.testng.annotations.Test;

public class Homework1 {

    public String liniaUnu;
    public Integer liniaDoi;
    public String liniaTrei;
    public String liniaPatru;
    public String liniaCinci;
    public String liniaSase;
    public String liniaSapte;
    public String liniaOpt;


    @Test
    public void HomeworkTest1() {
        descriereVariabile();
        verificSalariu("Andrei");
        verificSalariu("Vlad");
        verificDepartament("Popescu", "IT", 42833);
        verificDepartament("Alexandru", "Finance", 71290);
        verificNrDepartament(391);
        verificNrDepartament(122);
    }

    public void descriereVariabile() {

        liniaUnu = "World";
        liniaDoi = 27;
        liniaTrei = "Morgociu";
        liniaPatru = "Vlad";
        liniaCinci = "M";
        liniaSase = "H";
        liniaSapte = "Z";
        liniaOpt = "Poti pleca acasa dupa ce iti verific munca!";

        System.out.println("Hello " + liniaUnu + "." + liniaOpt);
        System.out.println("Varsta ta " + liniaDoi + "." + liniaOpt);
        System.out.println("Numele meu este " + liniaTrei + "." + liniaOpt);
        System.out.println("Prenumele meu este " + liniaPatru + "." + liniaOpt);
        System.out.println("Salut" + liniaCinci + "." + liniaOpt);
        System.out.println(liniaSase + "Hello" + "." + liniaOpt);
        System.out.println("Ana" + liniaSapte + " are" + liniaSapte + " mere" + liniaSapte + ", pere" + liniaSapte + ", prune" + liniaSapte + "." + liniaOpt);

    }

    public void verificSalariu(String nume) {
        if (nume == "Andrei") {
            System.out.println("Salariul lui " + nume + " este 5000 de lei.");
        } else {
            System.out.println("Salariul nu poate fi afisat");
        }


    }

    public void verificDepartament(String nume, String departament, Integer id) {
        if (nume == "Popescu") {
            System.out.println("ID-ul de angajat al lui " + nume + " este " + id + " iar departamanetul in care activeaza este " + departament);
        } else {
            System.out.println("Informatiile nu pot fi afisate");
        }
    }

    public void verificNrDepartament(Integer numarDepartament) {
        if (numarDepartament > 287) {
            System.out.println("Numarul departamentului este " + numarDepartament);
        }else {
            System.out.println("Numarul departamentului nu poate fi afisat.");
        }
    }
}