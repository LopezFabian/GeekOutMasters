package myProject;

import java.util.Random;

public class Dado {
    private String cara, caraContraria;
    private int numberCara;
    //private String caraContraria;

    /**
     * Class Constructor
     */
    public Dado(){
        Random numeroAleatorio= new Random();
        numberCara =numeroAleatorio.nextInt(6)+1;
    };

    /**
     * Method that generate a random value to cara.
     * @return meeple, cohete, superheroe, corazon, dragon or 42
     */
    public String getCara() {
        switch (numberCara){
            case 1: cara="meeple";
                    break;
            case 2: cara="cohete";
                break;
            case 3: cara="superheroe";
                break;
            case 4: cara="corazon";
                break;
            case 5: cara="dragon";
                break;
            case 6: cara="42";
                break;
        }
        return cara;
    }
    public String getCaraContraria(){
        switch (numberCara){
            case 1: caraContraria="cohete";
                break;
            case 2: caraContraria="meeple";
                break;
            case 3: caraContraria="dragon";
                break;
            case 4: caraContraria="42";
                break;
            case 5: caraContraria="superheroe";
                break;
            case 6: caraContraria="corazon";
                break;
        }
        return caraContraria;
    }
}
