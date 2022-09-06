import helpers.LogIn;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.mainPageSteps;
import steps.moviePageSteps;

public class Tests {
    @BeforeTest // General para todos los test cases
    public void login(){
        LogIn userLogIn = new LogIn();
        userLogIn.logUser("nessa.cardenas", "*******");
    }

    @Test
    public void verifyRateWithMessage(){
        mainPageSteps mainPage = new mainPageSteps(); //Instanciar una clase = crear objeto
        //Patron de diseno = Page Object Model
        mainPage.searchMovieName("Elvis");
        mainPage.selectingMovie();
        moviePageSteps moviePage = new moviePageSteps();
        moviePage.chooseRate(5);

        System.out.println("Al hacer rate se verifique con un mensaje");
    }
    @Test
    public void createList(){
        System.out.println("La lista se creo");
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
