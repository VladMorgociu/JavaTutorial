package OOP;

import java.util.List;

public class AudiConfigurator extends MasinaConfigurator {

    public String versiune;
    public String linieDeEchipare;
    public String motor;
    public String culoare;
    public String jante;
    public List<String> exterior;
    public String tapiterie;
    public List<String> interior;
    public List<String> extra;
    private Double pretStandard;
    private Double pretFinal;

    public AudiConfigurator(String marca, String model, Integer an, String versiune, String linieDeEchipare,
                            String motor, String culoare, String jante, String tapiterie,List<String> exterior,List<String>interior,List<String>extra) {
        super(marca, model, an);
        this.versiune = versiune;
        this.linieDeEchipare = linieDeEchipare;
        this.motor = motor;
        this.culoare = culoare;
        this.jante = jante;
        this.exterior = exterior;
        this.tapiterie = tapiterie;
        this.interior = interior;
        this.extra = extra;
    }

    public void infoAudi() {
        infoMasina();
        System.out.println("Versiunea masinii este: " + versiune);
        System.out.println("Linia de echipare a masinii este: " + linieDeEchipare);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Jantele masinii sunt: " + jante);
        System.out.println("Interiorul masinii este: " + tapiterie);

        System.out.println("Dotarile exterioare ale masinii sunt: ");
        for (Integer i = 0; i < exterior.size(); i++) {
            System.out.println(exterior.get(i));}

            System.out.println("Dotarile interioare ale masinii sunt: ");
            for (Integer i = 0; i < interior.size(); i++) {
                System.out.println(interior.get(i));}

                System.out.println("Dotarile extra ale masinii sunt: ");
                for (Integer i = 0; i < extra.size(); i++) {
                    System.out.println(extra.get(i));
                }
            }
        }

