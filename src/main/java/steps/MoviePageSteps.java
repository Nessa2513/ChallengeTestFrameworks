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
    public void addNewList(){
        logger.log(Level.WARNING,"You haven't create any lists.");
        System.out.println("+ Create new list");
    }
    public void favMovie (String movieName){
        System.out.println("Do you want to mark '" + movieName + "' as favorite? yes/no");
    }
    public boolean favMark(String userDecision){
        if(userDecision == "yes"){
            System.out.println("Your decision is: " + userDecision);
            logger.log(Level.INFO,"The favorite icon has been marked");
            System.out.println("Success! The movie has been added to your favorites");
            return true;
        } if (userDecision == "no") {
            System.out.println("Your decision is: " + userDecision);
            logger.log(Level.INFO,"The favorite icon is dismark");
            return true;
        } else {
            return false;
        }
    }
    public void toListMovie (String movieName){
        logger.log(Level.INFO,"The user clicked on the buttom 'Add to list'");
        System.out.println("Add '" + movieName + "' to one of your lists");
        System.out.println("Select the list where you want to add '" + movieName + "' ");
    }
    public boolean addToList(String addMovieToList){
        if (addMovieToList == "List 1" || addMovieToList == "List 2" || addMovieToList == "List 3"){
            System.out.println("Success! Item added to '" + addMovieToList + "'");
            logger.log(Level.INFO,"The list '" + addMovieToList + "' has a new item");
            return true;
        }else {
            return false;
        }
    }
}
