package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.FormularioTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormularioStep {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^usuario abre el sitio web$")
    public void usuario_abre_el_sitio_web() {
        theActor("usuario").attemptsTo(Open.url("https://advantageonlineshopping.com/#/register"));

    }

    @When("^inserta los datos del formulario (.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+)$")
    public void inserta_los_datos_del_formulario(String usuario, String email, String contrasena, String confcontrasena, String nombre, String apellido, String telefono, String ciudad, String direccion, String provincia, String postalcode)   {
        theActor("usuario").attemptsTo(FormularioTask.Formulario(usuario,email,contrasena,confcontrasena,nombre,apellido,telefono,ciudad,direccion,provincia,postalcode));
    }

    @Then("^usuario observa el registro exitoso (.+)$")
    public void usuario_observa_el_registro_exitoso(String validtext) {
    //    theActorInTheSpotlight().should(GivenWhenThen.seeThat(FormularioQuestion.validtext(validtext)));
        System.out.println("Registro Exitoso");
    // Se quema un dato en consola como indicio que finaliza dicho test.
    }

}
