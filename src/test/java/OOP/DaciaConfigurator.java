package OOP;

import java.util.List;

public class DaciaConfigurator extends MasinaConfigurator {

    private String versiune;
    private String motor;
    private String culoare;
    private String jante;
    private String interior;
    private List<String> echipamente;
    private List<String> accesorii;
    private Double pretStandard;
    private Double pretFinal;

    public DaciaConfigurator(String marca, String model, Integer an, String versiune, String motor,
                             String culoare, String jante, String interior, List<String> echipamente, List<String> accesorii) {
        super(marca, model, an);
        this.versiune = versiune;
        this.motor = motor;
        this.culoare = culoare;
        this.jante = jante;
        this.interior = interior;
        this.echipamente = echipamente;
        this.accesorii = accesorii;
    }

    public void infoDacia(){
        infoMasina();
        System.out.println("Versiunea masinii este: " +versiune);
        System.out.println("Motorul masinii este: " +motor);
        System.out.println("Culoarea masinii este: " +culoare);
        System.out.println("Jantele masinii sunt: " +jante);
        System.out.println("Interiorul masinii este: " +interior);

        System.out.println("Echipamentele masinii sunt: ");
        for (Integer i=0; i<echipamente.size(); i++){
            System.out.println(echipamente.get(i));
        }
        System.out.println("Accesoriile masinii sunt: ");
        for (Integer j=0; j<accesorii.size(); j++){
            System.out.println(accesorii.get(j));
        }
        calculPretStandard();

        calculPretFinal();
    }

    //Aplicam polimofrismul dinamic
    public void pornesteMotor () {
        System.out.println("Masinile Dacia pornesc de la buton.");
    }

    public void deschidereGeam () {
        System.out.println("Geamurile se deschid manual.");
    }
    //Trebuie sa determinam pretul standard in functie de model

    public void calculPretStandard(){
        if (getModel().equals("Logan")){
            if (versiune.equals("Essential")){
                pretStandard = 13.500;
            }
            if (versiune.equals("Expresion")){
                pretStandard = 14.150;
            }
            if (versiune.equals("Journey")){
                pretStandard = 15.250;
            }
            if (versiune.equals("Jorney+")){
                pretStandard = 15.700;
            }
        }

        System.out.printf("Pretul pentru Dacia " + getModel() + ", versiunea " + versiune + " este de: %, .3f \n", pretStandard);
    }
    public void calculPretFinal(){
        double pretOptiuni = 0.000;
        if (getModel().equals("Logan")){
            if (versiune.equals("Essential")){
                switch (culoare){
                    case "Grey":
                        pretOptiuni += 0.460;
                        break;

                    case "White":
                        pretOptiuni += 0;
                        break;
                }
                switch (jante){
                    case "Standard":
                        pretOptiuni += 2.000;
                        break;
                }
                switch (interior){
                    case "Standard":
                        pretOptiuni += 0;
                        break;
                }
            }
        }
        pretFinal = pretStandard + pretOptiuni;
        System.out.printf("Pretul final este: %, .3f \n",  pretFinal);
    }

    public String getVersiune() {
        return versiune;
    }
    public void setVersiune(String versiune) {
        this.versiune = versiune;
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    public String getCuloare() {
        return culoare;
    }
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    public String getJante() {
        return jante;
    }
    public void setJante(String jante) {
        this.jante = jante;
    }
    public List<String> getEchipamente() {
        return echipamente;
    }
    public void setEchipamente(List<String> echipamente) {
        this.echipamente = echipamente;
    }
    public List<String> getAccesorii() {
        return accesorii;
    }
    public void setAccesorii(List<String> accesorii) {
        this.accesorii = accesorii;
    }
    public String getInterior() {
        return interior;
    }
    public void setInterior(String interior) {
        this.interior = interior;
    }
    public Double getPretStandard() {
        return pretStandard;
    }
    public Double getPretFinal() {
        return pretFinal;
    }
}
