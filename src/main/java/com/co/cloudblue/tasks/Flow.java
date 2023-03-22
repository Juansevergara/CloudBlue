package com.co.cloudblue.tasks;

import com.co.cloudblue.userinterfaces.FlowMarketing;
import com.co.cloudblue.userinterfaces.LoginPage;
import com.co.cloudblue.utils.Waits;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

public class Flow implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(FlowMarketing.BTN_APPLAUNCHER));
        actor.attemptsTo(Click.on(FlowMarketing.BTN_MARKETING));
        Waits.WaitsUntils(5,"segundos");
        actor.attemptsTo(
                WaitUntil.the(FlowMarketing.BTN_CONTACT, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(FlowMarketing.BTN_CONTACT),
                WaitUntil.the(FlowMarketing.BTN_ALLCONTACT, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Click.on(FlowMarketing.BTN_ALLCONTACT)


        )   ;

    }

    public static Flow enter2 (){

        return Tasks.instrumented(Flow.class);


    }

}
