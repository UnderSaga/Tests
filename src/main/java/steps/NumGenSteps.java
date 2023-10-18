package steps;
import static org.testng.Assert.assertTrue;
import io.qameta.allure.Step;

public class NumGenSteps {

    @Step("Проверка на наличие цифр")
    public void haveNumber(String a){
        assertTrue(a.chars().anyMatch(Character::isDigit));
    }
}
