package allure;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

public class SelenideLambdaTest {
    @Test
    public void issueTabLabdaTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("open repo", () -> {
            open("https://github.com/ronin226/QAGuru15FileTesting");
        });
        step("go to the issue tab", () -> {
            $("#issues-tab").shouldHave(text("Issues")).click();
        });
        step("check text in the issue tab", () -> {
            $(".blankslate-spacious").shouldHave(text("Welcome to issues!"));
        });


    }
}
