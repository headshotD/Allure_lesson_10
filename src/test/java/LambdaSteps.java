import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GitHubPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class LambdaSteps extends TestBase {
    @Test
    @Feature("Проверка Issues")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("ONamozov")
    @DisplayName("Поиск в Isuees значения #1")
    void lambdaStepsTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем страницу GitHub юзера headshotD урок 9", () -> {
            GitHubPage.openPage();
        });
        step("Кликаем на таб Issues", () -> {
            $x("//div//span[@data-content='Issues']").click();
        });
        step("Ищем в Issues текст #1", () -> {
            $x("//div[@data-target='react-app.reactRoot']").shouldHave(text("#1"));
        });
    }
}