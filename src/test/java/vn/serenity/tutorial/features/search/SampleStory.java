package vn.serenity.tutorial.features.search;

import static net.serenitybdd.screenplay.GivenWhenThen.when;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.actions.Enter;
import vn.serenity.tutorial.ui.ToDoHomeUI;

@RunWith(SerenityRunner.class)
public class SampleStory extends WebHook{

    @Test
    public void my_name_scenario() {

        when(anna).attemptsTo(
        		
        		Enter
        			.theValue("Serenity vietnam community")
        			.into(ToDoHomeUI.WHAT_NEEDS_TO_BE_DONE)
        		
        		);

     
    }
}