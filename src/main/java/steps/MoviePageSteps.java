package steps;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MoviePageSteps {
    Logger logger = Logger.getLogger("logs"); // It is use for create messages to execution of an application
    public void mainMoviePage(){
    logger.log(Level.INFO,"You are in the data page of the selected movie");
    }
    public boolean chooseRate(int rate){
        System.out.println("#############################################################");
        System.out.println("Please select a rate for the movie");
        System.out.println("The selected rate is: " + rate);
        if(1<=rate & rate<=5){
            System.out.println("Success! Your rating has been saved");
            return true;
        }else{
            return false;
        }
    }
    public void addToList(){
        logger.log(Level.WARNING,"You haven't create any lists.");
        System.out.println("+ Create new list");
    }
}
