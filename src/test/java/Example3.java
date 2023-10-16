import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

@Epic("Третья группа")
public class Example3 {

    @Test(description = "Третий тест")
    @Description("Первый тест третей группы")
    public void testDesc() {
        step1();
        step2();
        step3();
    }

    @Step("Первый шаг")
    public void step1() {
        assertEquals(Main.desc(7,1,4), -111);
    }

    @Step("Второй шаг")
    public void step2() {
        assertEquals(Main.desc(9,49,9), 2077);
    }

    @Step("Третий шаг")
    public void step3() {
        assertEquals(Main.desc(5,1,9), -179);
    }

}
