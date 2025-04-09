package tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TextBoxTest {

    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        //Configuration.timeout = 5000;

    }

    @Test
    void fillFormTest(){
        open("/text-box");
        $("#userName").setValue("Anatoliy");
        $("#userEmail").setValue("t0l4ik.kas1@gmail.com");
        $("#currentAddress").setValue("Almaty");
        $("#permanentAddress").setValue("saina");
        $("#submit").scrollIntoView(true).click();

        $("#output").$("#name").shouldHave(text("Anatoliy"));
        $("#output #email").shouldHave(text("t0l4ik.kas1@gmail.com"));
        $("#output").$("#currentAddress").shouldHave(text("Almaty"));
        $("#output").$("#permanentAddress").shouldHave(text("saina"));

    }
}
