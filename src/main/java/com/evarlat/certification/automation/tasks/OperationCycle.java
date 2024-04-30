package com.evarlat.certification.automation.tasks;

import com.evarlat.certification.automation.interactions.CycleOperation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OperationCycle implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CycleOperation.with()
        );
    }

    public static OperationCycle inThe() {
        return Tasks.instrumented(OperationCycle.class);
    }
}
