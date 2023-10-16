import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

@Epic("Вторая группа")
public class Example2 {

    @Test(description = "Второй тест")
    @Description("Первый тест второй группы")
    public void testDesc() {
        step1();
        step2();
        step3();
    }

    @Step("Первый шаг")
    public void step1() {
        assertEquals(Main.desc(1,1,1), -2);
    }

    @Step("Второй шаг")
    public void step2() {
        assertEquals(Main.desc(54,0,1), -216);
    }

    @Step("Третий шаг")
    public void step3() {
        assertEquals(Main.desc(19,6,3), -192);
    }

}
