package OOP;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class OOPTest {

    @Test
    public void testMethod() {
        //dam o comanda de o masina Dacia;
        List<String> echipamenteLogan = Arrays.asList("Parking Pack", "Heated seats");
        List<String> accesoriiLogan = Arrays.asList("Covorase", "Scrumiera", "Suport de pahare");

        DaciaConfigurator Logan = new DaciaConfigurator("Dacia", "Logan", 2024, "Essential", "TCe 90 MT6",
                "Grey", "Standard", "Standard",echipamenteLogan, accesoriiLogan);
        Logan.infoDacia();
        Logan.pornesteMotor();
        Logan.deschidereGeam();
        Logan.promotieDacia();
        Logan.promotieDacia("Ticket Rabla");
        Logan.promotieDacia(25);

       System.out.println("===============================");

        //dam o comanda de masina Volkswagen
//        List<String> dotariOptionalePolo = Arrays.asList("Pachet comfort", "Trapa de sticla panoramica", "Pachet IQ Drive", "Park Pilot");
//
//        VolkswagenConfigurator Polo = new VolkswagenConfigurator("Volkswagen", "Polo", 2018,"Advanced",
//                "Polo Life 1.0 TSI", "Verde", "Jante Aliaj Essex 15", "Stofa", dotariOptionalePolo);
//        Polo.infoVolkswagen();
//
//
//        System.out.println("===============================");
//
//        //Mai definesc o Dacie si un VW
//        List<String> echipamenteDuster = Arrays.asList("Pachet techno", "Pachet Clima", "Pachet Parking");
//        List<String> accesoriiDuster = Arrays.asList("Suport pentru bicicleta", "Antena Rechin", "Suport pentru tableta media");
//
//        DaciaConfigurator Duster = new DaciaConfigurator("Dacia", "Duster", 2020, "Journey","ECO - G 100",
//                "Cedar Green", "Jante aliaj full-diamantate 18", "Tapiterie specifica", echipamenteDuster, accesoriiDuster);
//        Duster.infoDacia();
//
//        System.out.println("===============================");
//
//        List<String> dotariOptionaleTouareg = Arrays.asList("Pachet comfort", "Trapa de sticla panoramica", "Pachet IQ Drive", "Park Pilot");
//        VolkswagenConfigurator Touareg = new VolkswagenConfigurator("Volkswagen", "Touareg", 2024,"R-Line",
//                "R-Line V6 TDI", "Silicon Gray Matte", "Jante aliaj Braga 20", "Tapiterie piele",dotariOptionaleTouareg);
//        Touareg.infoVolkswagen();
//
//        System.out.println("================================");
//
//        //Mai aleg o marca de masina, fac o clasa si definesc 2 obiecte
//        List<String> dotariExterioareRS7 = Arrays.asList("Carcasa oglinzi carbon", "Geamuri fumurii", "Parbriz cu incalzire");
//        List<String> dotariInterioareRS7 = Arrays.asList("Advanced sound system", "DVD Player", "Phone Box");
//        List<String> dotariExtraRS7 = Arrays.asList("Trapa panoramica", "Stergatoare adaptive", "Ornamente din carbon");
//        AudiConfigurator RS7 = new AudiConfigurator("Audi", "A7", 2024,"RS-7 Sportsback","RS7",
//                "RS7 Performance quattro", "Argintiu Florett", "Jante Audi Sport, 5 spite V 22", "Tapiterie piele",
//                dotariExterioareRS7, dotariInterioareRS7, dotariExtraRS7);
//
//
//        List<String> dotariExterioareQ8 = Arrays.asList("Adaptive air suspension", "Bare logitudinale din aluminiu eloxat", "Carlig remorcare cu asistare");
//        List<String> dotariInterioareQ8 = Arrays.asList("Phone Box - Wireless Charging", "Bang & Olufsen Advanced Sound System", "Unitate DVD");
//        List<String> dotariExtraQ8 = Arrays.asList("Grila centrala fata de culoare neagra", "Parbriz cu incalzire fara fire vizibile", "Parbriz cu protectie acustica");
//        AudiConfigurator Q8 = new AudiConfigurator("Audi", "Q8", 2020,"Q8 PI","Diesel (mild) Hybrid",
//                "Q8 PI 45 TDI quattro", "Albastru Waitomo metalizat", "Jante S Audi Sport, 10 spite 23","Tapiterie din piele Cricket",
//                dotariExterioareQ8, dotariInterioareQ8, dotariExtraQ8);
//    }
    }
}