package steps;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainPageSteps {
    Logger logger = Logger.getLogger("logs"); // It is use for create messages to execution of an application

    public void searchMovieName(String movieName){
        logger.log(Level.INFO, "The movie '" + movieName + "' is being search"); // instead System.out.println
        logger.log(Level.INFO, "You can look the films with '" + movieName + "' in the title and select what you want"); // instead System.out.println
    }
    public String selectingMovie(String movieName){
        logger.log(Level.INFO, "The movie '"+ movieName + "' is being selected");
        return movieName;
    }
    public void popularTvShowBottom (){
        logger.log(Level.INFO, "The Popular Tv Shows is clicked");
    }
}
