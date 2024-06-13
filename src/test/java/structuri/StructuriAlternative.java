package structuri;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structuri alternative: if.. then.. else.. /Switch.. case..


    @Test
    public void metodaTest() {
        //verificNrMaiMare();
        //verificamNuMaiMareV2(11);
        //verificamNuMaiMareV2(8);
//        verificNumarPar(7);
//        verificNumarPar(6);
//        verificNumarPar(0);
//        verificNumarPar(-1);
//        verificNumarPar(-4);
        zileSaptamana(7);

    }

    //Verificam daca un numar e mai mare decat 10
    public void verificNrMaiMare() {

        if (15 > 10) {
            System.out.println("Numarul 15 e mai mare decat 10");
        } else {
            System.out.println("Numarul 15 nu e mai mare decat 10");
        }
    }

    //Verificam daca un numar e mai mare decat 10 - V2
    public void verificamNuMaiMareV2(Integer numar) {

        if (numar > 10) {
            System.out.println("Numarul " + numar + " e mai mare decat 10");
        } else {
            System.out.println("Numarul " + numar + " nu e mai mare decat 10");
        }
    }


    //Verificam daca un numar este par si pozitiv
    public void verificNumarPar(Integer numar) {
        //Daca targetam catul impartirii = / (divide)
        //Daca vrem sa luam restul impartirii = % (modulo)
        if (numar > 0) {
            if (numar % 2 == 0) {
                System.out.println("Numarul este pozitiv " + numar + " si par.");
            } else {
                System.out.println("Numarul meu este pozitiv " + numar + " si impar");
            }


        } else if (numar < 0) {
            if (numar % 2 == 0) {
                System.out.println("Numarul este negativ " + numar + " si par.");
            } else {
                System.out.println("Numarul este negativ " + numar + " si impar");
            }
        } else {
            System.out.println("Numarul este egal cu 0");
        }
    }

    //Definim zilele saptamanii
    public void zileSaptamana(Integer zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este Luni");
                break;
            case 2:
                System.out.println("Astazi este Marti");
                break;
            case 3:
                System.out.println("Astazi este Miercuri");
                break;
            case 4:
                System.out.println("Astazi este Joi");
                break;
            case 5:
                System.out.println("Astazi este vineri");
                break;

            default:
                System.out.println("S-au terminat zilele");
        }
    }
}
