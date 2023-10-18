import org.testng.annotations.BeforeMethod;
import steps.Steps;

public class BaseTest implements Steps {

    Desc desc = new Desc();
    PassGenerator passGenerator = new PassGenerator();

    String password;

    @BeforeMethod
    public void bfM(){
        password = PassGenerator.generateRandomPassword(10);
    }

}
