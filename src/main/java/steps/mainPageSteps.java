package steps;

import java.util.logging.Level;
import java.util.logging.Logger;

public class mainPageSteps {
    Logger logger = Logger.getLogger("logs");
    public void searchMovieName(String movieName){
        logger.log(Level.INFO, "The movie: " + movieName + " is being search");
        System.out.println("The movie: " + movieName + " is being search");
    }
    public void selectingMovie(){
        System.out.println("The movie is being select");
    }
}
