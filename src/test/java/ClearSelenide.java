import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.*;

import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.GitHubPage;

public class ClearSelenide extends TestBase {

    @Test
    @Feature("Проверка Issues")
    @Owner("ONamozov")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка, что значение присутствует в Issues")
    void gitHubIssuesTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        GitHubPage.openPage()
                .clickIssues()
                .getIssues("#1");
    }
    @Test
    @DisplayName("Тест должен упасть")
    void gitHubIssuesBrokenTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        GitHubPage.openPage()
                .clickIssues()
                .getIssues("#10");
    }
}
