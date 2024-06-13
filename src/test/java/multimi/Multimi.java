package multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {
    //Multimi = array, list(arraylist), map

    @Test
    public void metodaTest() {
        //afisareColegiArray();
        //afisareColegiArraylist();
        //obiecteMap();
        tariOrase();

    }

    //Afisam numele colegilor de la curs prin ARRAY

    public void afisareColegiArray() {

        String[] colegi = new String[6];
        colegi[0] = "Larisa";
        colegi[1] = "Robert";
        colegi[2] = "Daniel";
        colegi[3] = "Vlad";
        colegi[4] = "Corina";
        colegi[5] = "Alex";

        for (Integer index = 0; index < colegi.length; index++) {
            System.out.println("Numele cursantului este: " + colegi[index]);
        }
    }

    //Afisam numele colegilor de la curs prin ARRAYLIST

    public void afisareColegiArraylist() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Larisa");
        colegi.add("Robert");
        colegi.add("Daniel");
        colegi.add("Vlad");
        colegi.add("Corina");
        colegi.add("Alex");

        for (Integer index = 0; index < colegi.size(); index++) {
            System.out.println("Numele cursantului este: " + colegi.get(index));
        }

    }

    //Key-value
    public void obiecteMap(){
        Map<String,String> obiecte = new HashMap<>();
        obiecte.put("Fruct", "Mar");
        obiecte.put("Masina", "BMW");
        obiecte.put("Telefon", "iPhone");
        obiecte.put("Tricou", "Nike");
        for (String key: obiecte.keySet()){
            System.out.println("Key-ul este " + key);
            System.out.println("Valoarea este " + obiecte.get(key));
        }
    }

    //afisam cateva tari cu orasele aferente
    public void tariOrase () {
        Map<String, List<String>> tari = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Cluj");
        oraseRomania.add("Iasi");
        oraseRomania.add("Timisoara");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Milano");
        oraseItalia.add("Napoli");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Valencia");

        tari.put("Romania", oraseRomania);
        tari.put("Italia", oraseItalia);
        tari.put("Spania", oraseSpania);

        for (String key: tari.keySet()){
            System.out.println("Tara este " + key);
            System.out.println("Orasele sunt " + tari.get(key));

            //Tema - carte de bucate - "reteta este X iar ingredintele folosite sunt Y"
        }
    }
}
