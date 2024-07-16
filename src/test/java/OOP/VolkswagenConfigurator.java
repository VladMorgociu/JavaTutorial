package OOP;

import java.util.List;

public class VolkswagenConfigurator extends MasinaConfigurator {

    private String linieDeEchipare;
    private String motor;
    private String vopsea;
    private String roti;
    private String tapiterie;
    private List<String> dotariOptionale;
    private Double pretStandard;
    private Double pretFinal;

    public VolkswagenConfigurator(String marca, String model, Integer an, String linieDeEchipare,
                                  String motor, String vopsea, String roti, String tapiterie, List<String>dotariOptionale) {
        super(marca, model, an);

        this.linieDeEchipare = linieDeEchipare;
        this.motor = motor;
        this.vopsea = vopsea;
        this.roti = roti;
        this.tapiterie = tapiterie;
        this.dotariOptionale = dotariOptionale;
    }

    public void infoVolkswagen() {
        infoMasina();
        System.out.println("Linia de echipare a masinii este: " + linieDeEchipare);
        System.out.println("Motorul masinii este: " + motor);
        System.out.println("Vopseaua masinii este: " + vopsea);
        System.out.println("Rotile masinii sunt: " + roti);
        System.out.println("Tapiteria masinii este: " + tapiterie);
        System.out.println("Dotarile optionale ale masinii sunt: ");
        for (Integer t = 0; t < dotariOptionale.size(); t++) {
            System.out.println(dotariOptionale.get(t));
        }
    }

    public String getLinieDeEchipare() {
        return linieDeEchipare;
    }

    public void setLinieDeEchipare(String linieDeEchipare) {
        this.linieDeEchipare = linieDeEchipare;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getVopsea() {
        return vopsea;
    }

    public void setVopsea(String vopsea) {
        this.vopsea = vopsea;
    }

    public String getRoti() {
        return roti;
    }

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public String getTapiterie() {
        return tapiterie;
    }

    public void setTapiterie(String tapiterie) {
        this.tapiterie = tapiterie;
    }

    public List<String> getDotariOptionale() {
        return dotariOptionale;
    }

    public void setDotariOptionale(List<String> dotariOptionale) {
        this.dotariOptionale = dotariOptionale;
    }

    public Double getPretStandard() {
        return pretStandard;
    }

    public Double getPretFinal() {
        return pretFinal;
    }
}
