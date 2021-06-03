package vn.serenity.tutorial.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ToDoHomeUI {

	public static final Target WHAT_NEEDS_TO_BE_DONE = Target
			.the("item input field")
			.locatedBy("//input[@placeholder='What needs to be done?']");
			
	public static final Target SAMPLE_ELEMENT = Target
			.the("item input field")
			.located(By.id("xxx"));	
			

}
