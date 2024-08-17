package valueReferenceType;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ValueReferenceTest {

    // Primitive: int, double, float, char, boolean, long etc.
    // Non-primitive(Referinta): String, Object, Array etc.
    // Static: valoare care se pastreaza pentru toate instantele dintr-o clasa
    // Final: defineste o constanta care nu isi poate modifica valoare initiala
    // Wrapper class: constructie de clasa care este facuta pe baza unui tip de data (Integer, Double, Boolean etc.)

    public Integer originalInt = 10;
    public String originalString = "Vlad";
    public Curs cursTestare = new Curs("Curs nivel incepator", "Testare Automata", 17);
    public final int nrCursanti = 16;
    public Integer defaultWrapper;
    public int defaultPrimitive;

    @Test
    public void metodaTest () {
        System.out.println("1. VALUE TYPE");
        valueTypeExample(originalInt);
        System.out.println("Valoarea initiala este: " + originalInt);

        System.out.println("2. REFERENCE TYPE: STRING");
        referenceTypeStringExample(originalString);
        System.out.println("Valoarea initiala este: " + originalString);

        System.out.println("3. REFERENCE TYPE: OBJECT");
        referenceTypeObjectExample(cursTestare);
        System.out.println("Valoarea initiala este: ");
        cursTestare.prezentareCurs();

        System.out.println("4. CONSTANT");
        //nrCursanti = nrCursanti + 10;


        System.out.println("5. VALUE TYPE VS WRAPPER CLASS");
        defaultValue();
    }


    public void valueTypeExample (Integer value) {
        value = value +5;
        System.out.println("Valoarea noua este " + value);
    }

    public void referenceTypeStringExample (String value) {
        value = value + "Exemplu";
        System.out.println("Valoarea noua este " + value);
    }

    public void referenceTypeObjectExample (Curs Object) {
        Object.prezentareCurs();
        Object.setTitlu("Testare manuala");
        Object.prezentareCurs();
    }

    public void defaultValue () {
        System.out.println(defaultWrapper);
        System.out.println(defaultPrimitive);

        Integer[] Array = new Integer[5];
        List<Integer> List = new ArrayList<>();
    }
}
