package com.dipi.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RunDemo {
	

	public static void main(String[] args) {
		try {
			//Create object mapper 
			ObjectMapper mapper=new ObjectMapper();
			
			
			//Read JSON file and map/convert to java POJO
			Student theStudent=mapper.readValue(new File("data/employee-details.json"), Student.class);

			//print the object properties
		System.out.println("ID:"   +theStudent.getId());
		System.out.println("FirstName:"   +theStudent.getFirstName());
		System.out.println("FirstName:"   +theStudent.getLastName());
		
		
		Address theAddress=theStudent.getAddress();
		
		System.out.println("\nAddress:\n City:"   +theAddress.getCity());
		System.out.println("State:"   +theAddress.getState());
		
		
		String[] theLanguages=theStudent.getLanguages();
		System.out.println("Languages");
		for(String myobjectisin:theLanguages) {
			System.out.println(myobjectisin);
		}

		
		


		
			

		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	
	}

}
