package ru.netology.web;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CreditCardTest {

    @Test
    public void openShouidTest() throws InterruptedException {
//        System.setProperty("selenide.headless", "true");
        open("http://localhost:9999/");
        SelenideElement form = $(".form");
        form.$("[data-test-id=name] input").setValue("Иванов Иван");
        form.$("[data-test-id=phone] input").setValue("+79998887766");
        form.$("[data-test-id=agreement]").click();
        form.$("button.button").click();
        Thread.sleep(10000);
    }

}
