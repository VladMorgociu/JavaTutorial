package exceptii;

import tema.Multimi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptieConcept {

    //Exceptie = o eroare care apare cand progamul ruleaza
    //Exceptiile trebuie tratate deoarece pot contine informatii din interior ce pot sa fie exploatate
    //Exista 2 tipuri de exceptii: CHECKED si UNCHECKED

    //Exceptiile de tip CHECKED se trateaza in timpul compilarii
    //Acest tip de exceptii mostenesc clasa Exception

    //Exceptiile de tip UNCHECKED sunt exceptii care nu se trateaza in timpul compilarii
    //Acest tip de exceptii mostenesc clasa RuntimeException

    //Exista 2 keywords pentru tratarea exceptiilor: throw si throws
    //Throw - folosit sa arunce explicit o exceptie/este regasit in interiorul unei metode
    //Throws - folosit in semnatura metodei ca sa declare ca o metoda poate arunca o exceptie
    //De cele mai multe ori exceptiile se trateaza folosind o structura try...catch...finally

    //Incercam sa citim continutul dintr-un fisier
    public void checkedExceptionExample() {
        File file = new File("C://Proba.text");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("A intrat pe clauza de catch! Fisierul nu exista.");
        }
    finally {
        System.out.println("A intrat pe clauza de finally! Indiferent daca a mers sau nu pe catch, tot apeleaza si fianlly.");
     }
    }

    public void uncheckedExceptionExample(){
        Integer[] multimi = new Integer[2];
        multimi[0] = 15;
        multimi[1] = 30;
        multimi[2] = 40;

        System.out.println(multimi[2]);
    }

    public void throwExceptionExample(Integer varsta){
        if (varsta>18){
            throw new RuntimeException("Nu iti dau tigari.");
        }
        else {
            System.out.println("Persoana poate primi tigari.");
        }
    }
    public void throwsExceptionExample() throws FileNotFoundException {
        File file = new File("C://Proba.text");
        FileInputStream fileInputStream = new FileInputStream(file);
    }
}
