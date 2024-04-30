package com.evarlat.certification.automation.tasks;

import com.evarlat.certification.automation.interactions.EvalarLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Map;

public class Login implements Task {
    private final Map<String, String> testData;

    public Login(Map<String, String> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EvalarLogin.with(testData)
        );
    }

    public static Login inThe(Map<String, String> testData) {
        return Tasks.instrumented(Login.class, testData);
    }
}
