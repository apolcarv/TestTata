package ui;



import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioUI {

    public static Target USUARIO_INPUT = Target.the("llena campo usuario")
            .located(By.name("usernameRegisterPage"));

    public static Target EMAIL_INPUT = Target.the("llena campo email")
            .located(By.name("emailRegisterPage"));
    public static Target CONTRASENA_INPUT = Target.the("llena campo contrasena")
            .located(By.name("passwordRegisterPage"));
    public static Target CONF_CONTRASENA_INPUT = Target.the("llena campo conf contrasena")
            .located(By.name("confirm_passwordRegisterPage"));

    public static Target  NOMBRE_INPUT= Target.the("llena campo  nombre")
            .located(By.name("first_nameRegisterPage"));
    public static Target APELLIDO_INPUT = Target.the("llena campo  apellido")
            .located(By.name("last_nameRegisterPage"));
    public static Target TELEFONO_INPUT = Target.the("llena campo  telefono")
            .located(By.name("phone_numberRegisterPage"));

    public static Target COUNTRY_DOWN_LIST = Target.the("Despliega el campo pais")
            .located(By.name("countryListboxRegisterPage"));
    public static Target COUNTRY_DOWN_SELECT = Target.the("Seleccion el pais")
            .located(By.xpath("//select/option[45]"));


    public static Target CIUDAD_INPUT = Target.the("llena campo ciudad")
            .located(By.name("cityRegisterPage"));
    public static Target DIRECCION_INPUT = Target.the("llena campo conf direccion")
            .located(By.name("addressRegisterPage"));
    public static Target PROVINCIA_INPUT = Target.the("llena campo conf provincia")
            .located(By.name("state_/_province_/_regionRegisterPage"));
    public static Target POSTALCODE_INPUT = Target.the("llena campo postal code")
            .located(By.name("postal_codeRegisterPage"));


    public static Target TyC_CHECK = Target.the("Chekea el campo")
            .located(By.name("i_agree"));
    public static Target REGISTRO_BTN = Target.the("pulsa el boton registro")
            .located(By.id("register_btnundefined"));

    public static Target TEXT_VALID_QUESTION = Target.the("se posiciona en el localizador para obtener el texto")
            .located(By.id("xxxxxx"));
    // No se puede mapear debido a que la pagina una vez que hace dicho registro que da en blanco


}
