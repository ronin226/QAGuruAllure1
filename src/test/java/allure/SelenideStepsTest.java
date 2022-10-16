package allure;

import org.junit.jupiter.api.Test;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;

public class SelenideStepsTest {
    @Test
    public void annotadetTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        SelenideSteps steps = new SelenideSteps();
        steps.openRepo();
        steps.openIssues();
        steps.checkIssuesText();

    }
}
