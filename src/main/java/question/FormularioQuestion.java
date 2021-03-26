package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static ui.FormularioUI.*;

public class FormularioQuestion implements Question {
    private final String validtext;

    public FormularioQuestion(String validtext) {
        this.validtext = validtext;
    }

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(TEXT_VALID_QUESTION, containsText(validtext)).forNoMoreThan(5).seconds());
        return true;
    }
    public static Question<Boolean> validtext(String validtext){
        return new FormularioQuestion(validtext);
    }

}
