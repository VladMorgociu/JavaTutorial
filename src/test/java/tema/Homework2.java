package tema;

import org.testng.annotations.Test;

public class Homework2 {


    @Test
    public void HomeworkTest2() {
        liniaUnu();
        liniaDoi();
        liniaCinci();
        liniaSase();
        liniaSapte();
        liniaOpt();
        liniaNoua();

    }

    public void liniaUnu() {
        System.out.println("DA DA DA DA DA");
    }

    public void liniaDoi() {
        for (Integer index = 1; index <= 3; index++)
            System.out.println(index);
    }

    public void liniaCinci() {
        for (Integer index = 0; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.println("Numarul " + index + " este par.");
            } else {
                System.out.println("Numarul " + index + " este impar.");
            }
        }
    }

    public void liniaSase() {
        for (Integer index = 0; index <= 10; index++) {
            if (index % 2 == 0) {
                System.out.println("Numarul " + index + " este par.");
            }
        }
    }

    public void liniaSapte() {
        for (Integer index = 0; index <= 50; index++) {
            if (index % 5 == 0) {
                System.out.println("Numarul " + index + " este divizibil cu 5.");
            }
        }
    }

    public void liniaOpt() {
        for (Integer index = 0; index <= 15; index++) {
            if (index % 5 == 0) {
                System.out.println("Numarul " + index + " este divizibil cu 5.");
            }
        }
    }

    public void liniaNoua() {

        Integer A = 235;
        Integer B = 10;

        System.out.println("Suma celor doua numere este " + Integer.sum(A, B));

    }


}