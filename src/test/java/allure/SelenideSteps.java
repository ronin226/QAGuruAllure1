package allure;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import io.qameta.allure.Step;

public class SelenideSteps {
    @Step("open repo")
    public void openRepo() {
        open("https://github.com/ronin226/QAGuru15FileTesting");
    }

    @Step("open issues tab")
    public void openIssues() {
        $("#issues-tab").shouldHave(text("Issues")).click();
    }

    @Step("check issues tab text")
    public void checkIssuesText() {
        $(".blankslate-spacious").shouldHave(text("Welcome to issues!"));
    }
}