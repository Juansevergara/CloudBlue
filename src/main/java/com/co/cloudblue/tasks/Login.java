package com.co.cloudblue.tasks;

import com.co.cloudblue.userinterfaces.LoginPage;
import com.co.cloudblue.utils.Waits;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue("test.qa.cloudblue@gmail.com").into(LoginPage.TXT_LOGIN));
        actor.attemptsTo(Enter.theValue("T3stQ4CB2023").into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));
        Waits.WaitsUntils(10,"segundos");
        actor.attemptsTo(Click.on(LoginPage.BTN_APPLAUNCHER));
        actor.attemptsTo(Click.on(LoginPage.BTN_SERVICE));
        Waits.WaitsUntils(10,"segundos");


    }

    public static Login enter (){

        return Tasks.instrumented(Login.class);


    }


}
