package com.co.cloudblue.questions;

import com.co.cloudblue.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.QuestionSubject;
import net.serenitybdd.screenplay.questions.Text;

public class ValidatePage implements Question {


    @Override
    public Object answeredBy(Actor actor) {


        return Text.of(HomePage.LBL_COMPARE_SUBJECTPAGE).viewedBy(actor).asString();


    }


    public static ValidatePage compare(){

        return new ValidatePage();
    }
}
