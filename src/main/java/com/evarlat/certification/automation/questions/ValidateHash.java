package com.evarlat.certification.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.evarlat.certification.automation.utils.Constants.HASH_RESULT;

public class ValidateHash implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        return actor.recall(HASH_RESULT);
    }

    public static ValidateHash theHash() {
        return new ValidateHash();
    }
}
