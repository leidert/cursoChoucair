package co.com.choucair.certification.proyectobase.stepdefinitions;
import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Chocair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChocair(List<AcademyChoucairData> userData) {
        theActorCalled("Bramdon").wasAbleTo(OpenUp.thePage(), (Login.onThePage(userData.get(0))));
    }

    @When("^he search for the course ISTQB Agile Tester Extension on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> nameCourse) {
        theActorInTheSpotlight().attemptsTo(Search.the(nameCourse.get(0)));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesISTQBAgileTesterExtension(String question) {
        theActorInTheSpotlight().should(seeThat(Answer.toThen(question)));
    }
}
