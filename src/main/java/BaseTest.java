import org.testng.annotations.BeforeMethod;
import steps.Steps;

public class BaseTest implements Steps {
    String password;

    @BeforeMethod
    public void bfM(){
        password = PassGenerator.generateRandomPassword(10);
    }

}
