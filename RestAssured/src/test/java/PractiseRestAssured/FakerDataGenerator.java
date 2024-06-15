package PractiseRestAssured;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerDataGenerator {
	
	@Test()
	void testgenerateDummydata() {
		Faker faker = new Faker();

		String fullname = faker.name().fullName();
		String firstname= faker.name().firstName();
		String lastname = faker.name().lastName();
		
		String username = faker.name().username();
		String password = faker.internet().password();
		
		String phoneno = faker.phoneNumber().cellPhone();
		String email   = faker.internet().safeEmailAddress();
		
		String animal = faker.animal().name();
		
		System.out.println("Full Name:"+fullname);
		System.out.println("firstname:"+firstname);
		System.out.println("lastname:"+lastname);
		System.out.println("username:"+username);
		System.out.println("password:"+password);
		System.out.println("phoneno:"+phoneno);
		System.out.println("email:"+email);
		System.out.println("animal:"+animal);

	}

}
