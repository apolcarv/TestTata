package task;

import actions.Time;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.FormularioUI.*;

public class FormularioTask implements Task {

    private final String usuario;
    private final String email;
    private final String contrasena;
    private final String confcontrasena;
    private final String nombre;
    private final String apellido;
    private final String telefono;
    private final String ciudad;
    private final String direccion;
    private final String provincia;
    private final String postalcode;

    public FormularioTask(String usuario, String email, String contrasena, String confcontrasena, String nombre, String apellido, String telefono, String ciudad, String direccion, String provincia, String postalcode) {
        this.usuario = usuario;
        this.email = email;
        this.contrasena = contrasena;
        this.confcontrasena = confcontrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.provincia = provincia;
        this.postalcode = postalcode;
    }
    // private final String validtext;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(USUARIO_INPUT, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(usuario).into(USUARIO_INPUT),
                WaitUntil.the(EMAIL_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(email).into(EMAIL_INPUT),
                WaitUntil.the(CONTRASENA_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(contrasena).into(CONTRASENA_INPUT),
                WaitUntil.the(CONF_CONTRASENA_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(confcontrasena).into(CONF_CONTRASENA_INPUT),

                WaitUntil.the(NOMBRE_INPUT, isCurrentlyEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue(nombre).into(NOMBRE_INPUT),
                WaitUntil.the(APELLIDO_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(apellido).into(APELLIDO_INPUT),
                WaitUntil.the(TELEFONO_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(telefono).into(TELEFONO_INPUT),

                WaitUntil.the(COUNTRY_DOWN_LIST, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(COUNTRY_DOWN_LIST),
                WaitUntil.the(COUNTRY_DOWN_SELECT, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(COUNTRY_DOWN_SELECT),
                WaitUntil.the(CIUDAD_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(ciudad).into(CIUDAD_INPUT),
                WaitUntil.the(DIRECCION_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(direccion).into(DIRECCION_INPUT),
                WaitUntil.the(PROVINCIA_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(provincia).into(PROVINCIA_INPUT),
                WaitUntil.the(POSTALCODE_INPUT, isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(postalcode).into(POSTALCODE_INPUT),

                WaitUntil.the(TyC_CHECK, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(TyC_CHECK),
                WaitUntil.the(REGISTRO_BTN, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(REGISTRO_BTN)
        );
    }
public static Performable Formulario(String usuario, String email, String contrasena, String confcontrasena, String nombre, String apellido, String telefono, String ciudad, String direccion, String provincia, String postalcode){
    return instrumented(FormularioTask.class,usuario,email,contrasena,confcontrasena,nombre,apellido,telefono,ciudad,direccion,provincia,postalcode);
        }

}

