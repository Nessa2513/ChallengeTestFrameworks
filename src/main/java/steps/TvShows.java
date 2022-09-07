package steps;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TvShows {
    Logger logger = Logger.getLogger("logs"); // It is use for create messages to execution of an application

    public boolean selectingTvShow(int tvShow){
        logger.log(Level.INFO, "The Tv Show number '" + tvShow + "' is selected");
        if(1 <= tvShow & tvShow <= 20){
            return true;
        } else {
            return false;
        }
    }
}
