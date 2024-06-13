package obiect;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelefonTest {

    @Test
    public void metodaTest() {
        System.out.println("=== TELEFON: iPhone ===");
        Map<String,String> iphone = new HashMap<>();
        iphone.put("Model procesor", "Apple A16 Bionic");
        iphone.put("Sistem de operare", "iOS");
        iphone.put("Memorie RAM", "6GB");
        iphone.put("Numar camere", "2");
        iphone.put("Tip display", "Super Retina XDR");
        iphone.put("Rezolutie video", "4K");
        iphone.put("Porturi", "USB Type C");



        List<String> iphoneAccesorii = new ArrayList<>();
        iphoneAccesorii.add("Incarcator");
        iphoneAccesorii.add("Cablu de alimentare");
        iphoneAccesorii.add("Brick");

        Telefon iphone15 = new Telefon("Apple", "iPhone 15", "Black", "128GB", 6400,
                iphone, iphoneAccesorii, false,"Urme fine de utilizare" );
        iphone15.infoTelefon();

        Map<String,String> samsung = new HashMap<>();
        samsung.put("Model procesor", "Apple A16 Bionic");
        samsung.put("Sistem de operare", "iOS");
        samsung.put("Memorie RAM", "6GB");
        samsung.put("Numar camere", "2");
        samsung.put("Tip display", "Super Retina XDR");
        samsung.put("Rezolutie video", "4K");
        samsung.put("Porturi", "USB Type C");



        List<String> samsungAccesorii = new ArrayList<>();
        samsungAccesorii.add("Incarcator");
        samsungAccesorii.add("Cablu de alimentare");
        samsungAccesorii.add("Brick");
        samsungAccesorii.add("Casti");

        Telefon samsung24 = new Telefon("Galaxy", "S24", "Pink", "64GB",5500,
                samsung, samsungAccesorii, false, "Urme fine de utilizare");
        samsung24.infoTelefon();



        Map<String,String> huawei = new HashMap<>();
        huawei.put("Model procesor", "Apple A16 Bionic");
        huawei.put("Sistem de operare", "iOS");
        huawei.put("Memorie RAM", "6GB");
        huawei.put("Numar camere", "2");
        huawei.put("Tip display", "Super Retina XDR");
        huawei.put("Rezolutie video", "4K");
        huawei.put("Porturi", "USB Type C");



        List<String> huaweiAccesorii = new ArrayList<>();
        huaweiAccesorii.add("Cablu de alimentare");
        huaweiAccesorii.add("Brick");

        Telefon huawei = new Telefon("Huawei", "Pro", "White", "32GB", 5700,
                huawei, huaweiAccesorii, "true", "Urme fine de utilizare");
        huawei.infoTelefon();
    }

}
