package com.evarlat.certification.automation.interactions;

import com.evarlat.certification.automation.utils.MethodEmoji;
import com.evarlat.certification.automation.utils.MethodNumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import static com.evarlat.certification.automation.userinterfaces.EvalartUi.*;
import static com.evarlat.certification.automation.utils.Constants.*;


public class CycleOperation implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = ZERO; i < CYCLE_LIMIT; i++) {
            long expectedValue = MethodNumber.performMathOperation(actor, TEXT_OPERATION);
            MethodNumber.selectOptionBasedOnResult(actor, RADIO_BUTTONS, expectedValue);
            String emoji = MethodEmoji.extractFirstEmojiFromText(actor,  FIRS_EMOJI);
            int countEmoji = MethodEmoji.countEmojiOccurrences(actor,  SECON_EMOJI, emoji);
            actor.attemptsTo(
                    Enter.theValue(String.valueOf(countEmoji)).into(INPUT_NUMBER),
                    Click.on(BTN_SENT)
            );
        }

        actor.remember(HASH_RESULT, Text.of(HASH).answeredBy(actor));
       // System.out.println(" Hash " + Text.of(HASH).answeredBy(actor));
    }

    public static CycleOperation with() {
        return Tasks.instrumented(CycleOperation.class);
    }
}
