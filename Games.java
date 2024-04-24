package Games.pck;


import Controleur.GameController;
import View.pck.View;
import com.cartes.Deck;

public class Games {
    public static void main(String args[]) {
        GameController gc = new GameController(new Deck(), new View());
        gc.run();
    }
}
