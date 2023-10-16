import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

@Epic("Первая группа")
public class Example1 {

    @BeforeTest
    public void beforeTest() {
        System.out.println("Делаем что-то перед тестами");
    }

    @Test(description = "Первый тест")
    @Description("Первый тест первой группы")
    public void testDesc() {
        step1();
        step2();
        step3();
    }

    @Step("Первый шаг")
    public void step1() {
        assertEquals(Main.desc(1,-8,15), 4);
    }

    @Step("Второй шаг")
    public void step2() {
        assertEquals(Main.desc(2,2,2), -12);
    }

    @Step("Третий шаг")
    public void step3() {
        assertEquals(Main.desc(4,3,8), -119);
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Делаем что-то после тестов");
    }

}
