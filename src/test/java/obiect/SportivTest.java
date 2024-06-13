package obiect;

import org.testng.annotations.Test;

public class SportivTest {


    @Test
    public void testMethod() {
        //instantam un obiect de tipul sportiv
        Sportiv Ionut = new Sportiv("Popescu", "Ionut",
                28, "M", "Baschet", true);
        Ionut.prezentareSportiv();
        Ionut.varsta=29;
        Ionut.sportPracticat="Fotbal";
        Ionut.prezentareSportiv();
        Ionut.verificareVarsta();
        Ionut.marireSalar(0);

        System.out.println("----------------------");

        Sportiv Alin = new Sportiv("Exemplu", "Alin",
                18,"M","Box", false);

        Alin.prezentareSportiv();
        Alin.verificareVarsta();
        Alin.marireSalar(2);

        System.out.println("---------------");

        Sportiv Vlad = new Sportiv("Vlad", "Morgociu", 28, "M",
                "Baschet", true, 2000);

        Vlad.prezentareSportiv();
        Vlad.verificareVarsta();
        Vlad.marireSalar(10);

    }
}
