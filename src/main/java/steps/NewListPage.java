package steps;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewListPage {
    Logger logger = Logger.getLogger("logs"); // It is use for create messages to execution of an application
    public boolean creatingNewList(String nameList){
        logger.log(Level.INFO, "You are creating a new list");
        System.out.println("Add a name for your new list ");
        System.out.println("The name of you new list is: " + nameList);
        if (nameList.length() >= 5){
            return true;
        }else {
            return false;
        }
    }
    public boolean newListDescription(String descriptionList){
        System.out.println("Add a description to your new list ");
        System.out.println("The description of your new list is: " + descriptionList);
        if (descriptionList.length() >= 20){
            return true;
        }else {
            return false;
        }
    }
    public boolean statusList(String priOrPub){
        System.out.println("Do you want your list to be 'Private' or 'Public'?");
        System.out.println("your new list is: " + priOrPub);
        if (priOrPub == "Private" || priOrPub == "Public"){
            System.out.println("Success! Your changes have been successfully saved.");
            return true;
        }else {
            return false;
        }
    }
}
