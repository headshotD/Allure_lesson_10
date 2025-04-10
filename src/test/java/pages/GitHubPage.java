package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitHubPage {
    public static GitHubPage openPage() {
        open("https://github.com/headshotD/qa_guru_lesson9");
        return new GitHubPage();
    }

    private final SelenideElement profileLogo = $(".AppHeader-user"),
            repositoriesTab = $x("//div//a[@data-tab-item='repositories']"),
            yourRepositories = $x("//div[@role='dialog']//span[text()='Your repositories']"),
            findInputRepository = $x("//div//input[@id='your-repos-filter']"),
            findRepositoryByFilter = $x("//div/ul[@data-filterable-for='your-repos-filter']"),
            issues = $x("//div//span[@data-content='Issues']"),
            issuesCheck = $x("//div[@data-target='react-app.reactRoot']");

    public GitHubPage clickIssues() {
        issues.click();
        return this;
    }

    public SelenideElement getIssues(String value) {
        issuesCheck.shouldHave(text(value));
        return issues;
    }

}
