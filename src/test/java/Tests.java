import helpers.LogIn;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.MainPageSteps;
import steps.MoviePageSteps;
import steps.NewListPage;
import steps.MainPageSteps;
import steps.MoviePageSteps;

public class Tests {
    @BeforeTest // General to all test cases
    public void login(){
        LogIn userLogIn = new LogIn();
        userLogIn.logUser("nessa.cardenas", "*******");
    }

    // Desing pattern = Page Object Model
    @Test
    public void verifyRateWithMessage(){
        MainPageSteps mainPage = new MainPageSteps(); //Instanciar una clase = crear objeto
        mainPage.selectingMovie();
        mainPage.searchMovieName("Elvis");
        MoviePageSteps moviePage = new MoviePageSteps();
        moviePage.mainMoviePage();
        Assert.assertTrue(moviePage.chooseRate(3), "The movie can't be rated because the number is not between 1 to 5"); // The message is only if is false the condition
        System.out.println("#############################################################");
    }
    @Test
    public void createList(){
        MoviePageSteps moviePage = new MoviePageSteps();
        moviePage.addNewList();
        NewListPage newList = new NewListPage();

        Assert.assertTrue(newList.creatingNewList(" My first list"), "The name of the list has to have at least 5 characters");
        Assert.assertTrue(newList.newListDescription("Here are my favourite musical movies"), "The description of the list has to have at least 20 characters");
        Assert.assertTrue(newList.statusList("Private"), "The list only can be 'Private' or 'Public'");

        System.out.println("#############################################################");
    }
    @Test
    public void movieFilter(){
        System.out.println(" ");
    }
    @Test
    public void favoriteMark(){
        MoviePageSteps moviePage = new MoviePageSteps();
        moviePage.movie("Thor: Love and Thunder");

        Assert.assertTrue(moviePage.favMark("no"), "You have to mark 'yes' to add to favorite or mark 'no' if you don't want to mark as favorite");
        System.out.println("#############################################################");
    }
    @Test
    public void addToList(){
        System.out.println("Agregado a la lista");
    }
}
