package abstractizareRestaurant;

public class RestaurantMixt extends Restaurant implements VeganInterface, NonVeganInterface{

    public RestaurantMixt(String numeRestaurant, String adresa, String meniu, Boolean delivery, String tipRestaurant) {
        super(numeRestaurant, adresa, meniu, delivery, tipRestaurant);
    }

    @Override
    public void gatesteNonVegan() {

    }

    @Override
    public void gatesteVegan() {

    }

    @Override
    public void prezentareMeniu() {

    }
    //De incercat sa reproduc o nationala de fotbal
    //Primul nivel este persoana. Mai departe mergem la fotbalist/antrenor/medic


}
