import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;


public class FirstTest {

    @BeforeAll
    static void configSize() {
        Configuration.startMaximized = true;
    }


    @Test
    void firstTest(){


        open("https://www.demoqa.com/automation-practice-form");
        $(By.xpath("//input[@placeholder = 'First Name']")).setValue("Daniyar");
        $(By.xpath("//input[@placeholder = 'Last Name']")).setValue("Kuatov");
        $(By.xpath("//input[@placeholder = 'name@example.com']")).setValue("danikbidanov@gmail.com");
        $(new ByText("Male")).click();
        $(By.xpath("//input[@placeholder = 'Mobile Number']")).setValue("87473883853");
        $("[id=dateOfBirthInput]").click();
        $("[class=react-datepicker__month-select]").selectOption("August");
        $("[class=react-datepicker__year-select]").selectOption("1997");
        $( new ByText("17")).click();
        $("#subjectsInput").click();
        $("#subjectsInput").sendKeys("Co");
        $(new ByText("Computer Science")).click();
        $(new ByText("Sports")).click();
        $("[id=uploadPicture]").uploadFile(new File("src/test/resources/selenide.jpg"));
        $(By.xpath("//textarea[@placeholder = 'Current Address']")).setValue("Almaty city, Abishev str");
        $("#state").click();
        $(new ByText("NCR")).click();
        $("#city").click();
        $(new ByText("Gurgaon"));
        $("#submit").click();




    }
}
