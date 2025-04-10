import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnnotationStepsTest {

    @Test
    @Owner("ONamozov")
    @DisplayName("Проверка значения у Issue")
    public void issueValueSearchTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        AnnotationSteps steps = new AnnotationSteps();

        steps.openGitHunPageUserHeadshotLesson9Test();
        steps.clickIssueTest();
        steps.checkValueOnIssuePageTest();
    }
}
