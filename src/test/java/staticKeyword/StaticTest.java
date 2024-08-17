package staticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void methodTest(){
        Elev Stefan = new Elev("Stefan", "Stan", 14);
        Stefan.prezentare();
        System.out.println("===============================================");
        Elev Marius = new Elev("Marius", "Iftimie", 12);
        Marius.prezentare();
    }
}
