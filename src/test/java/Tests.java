import helpers.LogIn;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.MainPageSteps;
import steps.MoviePageSteps;
import steps.NewListPage;
import steps.TvShows;

public class Tests {

    MainPageSteps mainPage = new MainPageSteps(); //Instanciar una clase = crear objet
    MoviePageSteps moviePage = new MoviePageSteps();
    @BeforeTest // General to all test cases
    public void login(){
        LogIn userLogIn = new LogIn();
        userLogIn.logUser("nessa.cardenas", "*******");
    }

    // Desing pattern = Page Object Model
    @Test
    public void verifyRateWithMessage(){
        mainPage.searchMovieName(mainPage.selectingMovie("Elvis"));
        moviePage.mainMoviePage();
        Assert.assertTrue(moviePage.chooseRate(3), "The movie can't be rated because the number is not between 1 to 5"); // The message is only if is false the condition
        System.out.println("#############################################################");
    }
    @Test
    public void createList(){
        moviePage.addNewList();
        NewListPage newList = new NewListPage();

        Assert.assertTrue(newList.creatingNewList(" My first list"), "The name of the list has to have at least 5 characters");
        Assert.assertTrue(newList.newListDescription("Here are my favourite musical movies"), "The description of the list has to have at least 20 characters");
        Assert.assertTrue(newList.statusList("Private"), "The list only can be 'Private' or 'Public'");

        System.out.println("#############################################################");
    }
    @Test
    public void favoriteMark(){
        moviePage.favMovie(mainPage.selectingMovie("Thor: Love and Thunder"));
        Assert.assertTrue(moviePage.favMark("no"), "You have to mark 'yes' to add to favorite or mark 'no' if you don't want to mark as favorite");
        System.out.println("#############################################################");
    }
    @Test
    public void addToList(){
        moviePage.toListMovie(mainPage.selectingMovie("Top Gun"));
        Assert.assertTrue(moviePage.addToList("List 3"), "The name has to match with one of your named lists");
        System.out.println("#############################################################");
    }
    @Test
    public void ratePopularTvShow(){
        TvShows tvShows = new TvShows();
        mainPage.popularTvShowBottom();
        Assert.assertTrue(tvShows.selectingTvShow(10), "The number of popular TV Shows is between 1 to 20");
        Assert.assertTrue(moviePage.chooseRate(1), "The movie can't be rated because the number is not between 1 to 5");
        System.out.println("#############################################################");
    }
}
