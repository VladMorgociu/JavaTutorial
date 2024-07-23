package accessControlPart1;

public class Caine {

    public void metodaPublica () {
    }

    private void metodaPrivata () {
    }

    protected void metodaProtejata () {
    }

    void metodaDefault () {
    }


    //Public = tip de access control face publica informatia in toate pachetele
    //Private = tip de access control ce face publica informatia doar in clasa curenta
    //Default = tip de access control ce face public informatia doar in cadrul aceluasi pachet daca vorbim de mostenire/creare obiect
    //Protected = tip de access control unde informatia este protejata doar in pachetul respectiv. Daca iesim din pachet vizibilitatea
    //            lui este prezenta doar daca vorbim de mostenire
}
