package com.co.cloudblue.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target  TXT_LOGIN = Target.the("enter de username")
            .locatedBy("//input[@id='username']");
    public static final Target TXT_PASSWORD = Target.the("enter the password")
            .locatedBy("//input[@id='password']");
    public static final Target BTN_LOGIN = Target.the("click the button Log In")
            .locatedBy("//input[@id='Login']");

    public static final Target BTN_APPLAUNCHER = Target.the("click the AppLauncher button")
            .locatedBy("//one-app-launcher-header/button[1]/div[1]");

    public static final Target BTN_SERVICE = Target.the("click the Service button")
            .locatedBy("//p[contains(text(),'Service')]");





}
