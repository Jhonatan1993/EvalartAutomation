package com.evarlat.certification.automation.stepdefinition;


import com.evarlat.certification.automation.utils.Environment;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.evarlat.certification.automation.utils.Constants.URL_BASE_1;
import static com.evarlat.certification.automation.utils.Constants.URL_PAGE_TAG_1;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Hooks {
    @Before(URL_PAGE_TAG_1)
    public void setupPageOne() {
        setup(URL_BASE_1);
    }


    private void setup(String pagina){
        setTheStage(new OnlineCast());
        theActorCalled("User").wasAbleTo(Open.browserOn().thePageNamed(new Environment(pagina).getUrl()), Browser.maximize());


    }
}
