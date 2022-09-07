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
        Assert.assertTrue(moviePage.chooseRate(3), "The movie can't be rated because the number is not between 1 to 5");
        System.out.println("#############################################################");
    }
    @Test
    public void createList(){
        MoviePageSteps moviePage = new MoviePageSteps();
        moviePage.addToList();
        NewListPage newList = new NewListPage();

        Assert.assertTrue(newList.creatingNewList(" My first list"), "The name of the list has to have at least 5 characters");
        Assert.assertTrue(newList.newListDescription("Here are my favourite musical movies"), "The description of the list has to have at least 20 characters");
        Assert.assertTrue(newList.statusList("Private"), "The list only can be 'Private' or 'Public'");

        System.out.println("#############################################################");
    }
    @Test
    public void filmData(){
        System.out.println("Datos del filme");
    }
    @Test
    public void favoriteMark(){
        System.out.println("Marcado como favorito");
    }
    @Test
    public void addToList(){
        System.out.println("Agregado a la lista");
    }
}
