package com.pcsglobal.listeners;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppListeners {
	
	@EventListener
	public void serveStarted1(ContextStartedEvent event) {
		System.out.println("Context started event1 occured");
	}
	
	@EventListener
	public void serveStarted2(ContextStartedEvent event) {
		System.out.println("Context1 started event2 occured");
	}
	
	@EventListener
	public void serveStarted3(ContextStartedEvent event) {
		System.out.println("Context started event3 occured");
	}
	
	@EventListener
	public void serveStopped(ContextStoppedEvent event) {
		System.out.println("Context stopped event occured");
	}

}
