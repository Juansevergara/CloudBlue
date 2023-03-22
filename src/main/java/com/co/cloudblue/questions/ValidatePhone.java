package com.co.cloudblue.questions;

import com.co.cloudblue.userinterfaces.FlowMarketing;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidatePhone implements Question {
    @Override
    public Object answeredBy(Actor actor) {


        return Text.of(FlowMarketing.INPUT_PHONE).viewedBy(actor).asString();


    }


    public static ValidatePhone compare() {

        return new ValidatePhone();
    }
}
