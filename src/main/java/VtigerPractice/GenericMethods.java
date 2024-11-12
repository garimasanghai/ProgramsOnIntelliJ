package VtigerPractice;

import com.github.javafaker.Faker;

public class GenericMethods {
	  static Faker faker = new Faker();
	
	public static String orgname() {
		String companyName = faker.company().name();
		return companyName;
	}

	public static String leadname() {
		 
	        String leadName = faker.name().fullName();
	        return leadName;
	}
	
	public static String contactname() {
		 
        String contactName = faker.name().fullName();
        return contactName;
     }
	
	public static String opportunityname() {
		
		String opportunityName = faker.name().fullName();
		return opportunityName;
	}
	
	public static String productname() {
		
		String productName = faker.name().fullName();
		return productName;
	}
}
