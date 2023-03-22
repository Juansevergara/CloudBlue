package com.co.cloudblue.questions;

import com.co.cloudblue.userinterfaces.FlowMarketing;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateName implements Question {

    @Override
    public Object answeredBy(Actor actor) {


        return Text.of(FlowMarketing.INPUT_NAME).viewedBy(actor).asString();


    }


    public static ValidateName compare() {

        return new ValidateName();
    }
}
