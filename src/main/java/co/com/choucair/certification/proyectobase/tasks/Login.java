package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import static co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private AcademyChoucairData userData;

    public Login(AcademyChoucairData userData) {
        this.userData = userData;
    }

    public static  Login onThePage(AcademyChoucairData userData){
        return Tasks.instrumented(Login.class, userData);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOGIN_BUTTON),
                Enter.theValue(userData.getUserName()).into(INPUT_USER),
                Enter.theValue(userData.getPassword()).into(INPUT_PASSWORD),
                Click.on(ENTER_BUTTON));

    }
}
