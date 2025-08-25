package utilities;

import com.github.javafaker.Faker;

public class FakerUtility {  //For fake data generation(fake email, phone no etc..)
	Faker faker = new Faker();

	public String creatARandomFirstName() {

		return faker.name().firstName();

	}

	public String creatARandomLastName() {

		return faker.name().lastName();

	}

	public String generateAddress() {

		return faker.address().fullAddress();

	}

	public String generateEmail() {

		return faker.internet().emailAddress();

	}
	

}
