package allure;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class SelenideListenerTest {
    @Test
    public void issueTabListenerTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com/ronin226/QAGuru15FileTesting");
        $("#issues-tab").shouldHave(text("Issues")).click();
        $(".blankslate-spacious").shouldHave(text("Welcome to issues!"));


    }
}
