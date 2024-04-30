package com.evarlat.certification.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EvalartUi {


    public static final Target INPUT_USER_NAME = Target.the("Input user name").located(By.name("username"));
    public static final Target INPUT_PASSWORD = Target.the("Input password").located(By.name("password"));
    public static final Target INPUT_NUMBER = Target.the("Input password").located(By.name("number"));
    public static final Target TEXT_OPERATION = Target.the("Text operation").located(By.xpath("//*[@class='text-center text-xl font-bold']"));
    public static final Target FIRS_EMOJI = Target.the("Firs emoji").located(By.xpath("//*[@class='w-9/12 space-y-4']/p[1]"));
    public static final Target SECON_EMOJI = Target.the("Firs emoji").located(By.xpath("//*[@class='w-9/12 space-y-4']/p[2]"));
    public static final Target RADIO_BUTTONS = Target.the("radio buttons").locatedBy(".grid.grid-cols-4.gap-4.mt-4 label input[type='radio']");
    public static final Target BTN_LOGIN = Target.the("Btn login").located(By.xpath("//button[@class='bg-white border-black p-2 border-2 rounded-md hover:bg-blue-300 w-1/2 mx-auto']"));
    public static final Target BTN_SENT = Target.the("Btn sent").located(By.xpath("//*[contains(text(),'Enviar')]"));
    public static final Target HASH = Target.the("Hash").located(By.xpath("//*[@class='text-white text-2xl text-center break-all']"));
}
