package com.co.cloudblue.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target LBL_COMPARE_SUBJECTPAGE = Target.the("Subjects")
            .locatedBy("//body/div[4]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/span[1]");

    public static final Target LBL_COMPARE_SUBJECTPAGE2 = Target.the("Subjects").locatedBy("//span[contains(text(),\"Today's Events\")]");

    public static final Target LBL_COMPARE_SUBJECTPAGE3 = Target.the("Subjects").locatedBy("//span[contains(text(),\"Today's Events\")]");







}
