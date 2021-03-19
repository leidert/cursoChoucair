package co.com.choucair.certification.proyectobase.tasks;

import static co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage.*;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {

    private AcademyChoucairData nameCourse;

    public Search(AcademyChoucairData nameCourse) {
        this.nameCourse = nameCourse;
    }

    public static Search the(AcademyChoucairData nameCourse) {
        return Tasks.instrumented(Search.class, nameCourse);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_UC),
                Enter.theValue(nameCourse.getNameCourse()).into(INPUT_COURSE),
                Click.on(BUTTON_GO),
                Click.on(SELECT_COURSE));
    }
}
