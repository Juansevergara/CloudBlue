package com.co.cloudblue.questions;

import com.co.cloudblue.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateTittle implements Question {


    @Override
    public Object answeredBy(Actor actor) {

        return Text.of(HomePage.LBL_COMPARE_SUBJECTPAGE2).viewedBy(actor).asString();

    }

    public static ValidateTittle compare2(){

        return new ValidateTittle();
    }

}
