package tema;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Multimi {


    @Test
    public void testCarteBucate(){
        carteBucate();
    }
    //Tema - carte de bucate - "reteta este X iar ingredintele folosite sunt Y"

    public void carteBucate () {
        Map<String, List<String>> retete = new HashMap<>();

        List<String> omleta = new ArrayList<>();
        omleta.add("Oua");
        omleta.add("Bacon");
        omleta.add("Sare");
        omleta.add("Piper");
        omleta.add("Ceapa verde");

        List<String> snitel = new ArrayList<>();
        snitel.add("Piept de pui");
        snitel.add("Sare");
        snitel.add("Piper");
        snitel.add("Oua");
        snitel.add("Faina");
        snitel.add("Pesmet");

        List<String> piure = new ArrayList<>();
        piure.add("Cartofi");
        piure.add("Lapte");
        piure.add("Unt");
        piure.add("Sare");

        retete.put("Omleta", omleta);
        retete.put("Snitel de pui", snitel);
        retete.put("Piure de cartofi", piure);

        for (String key: retete.keySet()){
            System.out.println("Reteta este " + key);
            System.out.println("Ingredientele sunt " + retete.get(key));


        }
    }
}
