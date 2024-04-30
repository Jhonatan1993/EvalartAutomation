package com.evarlat.certification.automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.evarlat.certification.automation.userinterfaces.EvalartUi.*;
import static com.evarlat.certification.automation.utils.Constants.PASSWORD;
import static com.evarlat.certification.automation.utils.Constants.USERNAME;

public class EvalarLogin implements Interaction {

    private final Map<String, String> testData;

    public EvalarLogin(Map<String, String> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(testData.get(USERNAME)).into(INPUT_USER_NAME),
                Enter.theValue(testData.get(PASSWORD)).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN)
        );

    }



    public static EvalarLogin with(Map<String, String> testData) {
        return Tasks.instrumented(EvalarLogin.class, testData);
    }
}
