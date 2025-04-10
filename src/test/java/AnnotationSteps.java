import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class AnnotationSteps {

@Step("Открываем ГитХаб юзера headshotD урок 9")
public void openGitHunPageUserHeadshotLesson9Test() {
    open("https://github.com/headshotD/qa_guru_lesson9");
}

@Step("Кликаем на Issue")
public void clickIssueTest() {
    $x("//div//span[@data-content='Issues']").click();
}

@Step("Находим значение #1 на странице Issue")
public void checkValueOnIssuePageTest() {
    $x("//div[@data-target='react-app.reactRoot']").should(text("#1"));
}
}
