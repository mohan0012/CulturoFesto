package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.model.Event;
import com.cg.model.UserRegistration;
import com.cg.service.EventService;
import com.cg.service.UserRegistrationService;



@SpringBootTest
public class EventTest {
	@Autowired
	private Event event;
	@Autowired
	private EventService ser;
	@Autowired
	private UserRegistration user;
	@Autowired
	private UserRegistrationService userser;
	
	@Test
	void contextLoads() {
	}
	
	
	  @Test 
	  public void addEventTest() { 
		  event.setName("Holi");
	  event.setAmount(5000); 
	  event.setVenue("Banglore");
	  ser.createEvent(event);
	  
	  }
	  @Test 
	  public void  createUserTest() { 
		  user.setFirstName("test");
	  user.setAdultsCount(2); 
	  user.setState("Andhra Pradesh");
	  userser.addUserDetails(user);
	  
	  }
	 
		/*
		 * @Test public void getAllEvents() {
		 * 
		 * assertEquals(event.getName(),"null");
		 * assertNotEquals(event.getAmount(),"null");
		 * 
		 * }
		 */
	 	
		/*
		  @Test 
		  public void deleteEventTest() 
		  { 
		  Event event=new Event();
		  event.setEventId(1); 
		  ser.deleteEvent(event); 
		  }
		  */
	  
	  @Test 
	  public void deleteUserDetailsTest() 
	  { 
      UserRegistration use=new UserRegistration();
	  use.setId((long) 7); 
	  userser.deleteUserDetails(user); 
	  }
	  
		  
		 
	
}
