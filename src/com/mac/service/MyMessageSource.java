package com.mac.service;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

@Component
public class MyMessageSource implements MessageSourceAware {
	
	private MessageSource messageSource;
	
	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource=messageSource;
	}

	public void displayMessage() {
		System.out.println(messageSource.getMessage("greetings", new String[] {"Spencer", "Louie"}, "", null));
	}

}
