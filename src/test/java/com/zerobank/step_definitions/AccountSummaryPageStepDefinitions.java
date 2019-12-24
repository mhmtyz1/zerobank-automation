package com.zerobank.step_definitions;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryPageStepDefinitions {
    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();


    @Then("title should be {string}")
    public void title_should_be(String title) {
        String expectedTitle=title;
        String actualTitle=accountSummaryPage.returnTitle();
        Assert.assertEquals("Title not matched", expectedTitle, actualTitle);
    }

    @Then("following account types should be displayed")
    public void following_account_types_should_be_displayed(List<String> expectedSubTitles) {
        List<String> actualSubTitles=accountSummaryPage.returnSubTitles();
        System.out.println(actualSubTitles);
        System.out.println(expectedSubTitles);
        Assert.assertEquals(expectedSubTitles,actualSubTitles);
    }
}