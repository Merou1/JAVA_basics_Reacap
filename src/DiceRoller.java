import java.util.Random;

public class DiceRoller {
    Random random;
    int number;
    DiceRoller(){
        random = new Random();//flewel kan ghe var de type random db rdinah objet ay anahou y9der y acceder l les methodes dyal R ndom class khassoi ykoun var de type random bash n9derouh nredouh objet d la classe random
        roll();
    }
    public void roll(){
        number=random.nextInt(6)+1;
        System.out.println(number);
    }
}
