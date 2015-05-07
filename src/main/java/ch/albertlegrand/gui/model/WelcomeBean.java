package ch.albertlegrand.gui.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("request")
public class WelcomeBean {
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		System.out.println(text);
		this.text = text;
	}
		
}