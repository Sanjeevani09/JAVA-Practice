package com.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.beans.Address;
import com.spring.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddressObj() {
		Address addr = new Address();
		
		//setting values
		addr.setHouseNo(205);
		addr.setStreetName("Vijay Chowk");
		addr.setCity("Mumbai");
		addr.setPincode(400101);
		
		return addr;
	}
	
	//What if we have 2 bean object of same class?
	//This will give error
	@Bean
	public Address createAddressObj2() {
		Address addr = new Address();
		
		//setting values
		addr.setHouseNo(108);
		addr.setStreetName("Shanti Nagar");
		addr.setCity("Mumbai");
		addr.setPincode(400103);
		
		return addr;
	}
	
	@Bean
	public Student createSudentObj() {
		Student stud = new Student();
		
		//Setting Values
		stud.setName("Sandy");
		stud.setRollno(101);
		//This below line is removed if we use @Autowired anno
		//stud.setAddress(createAddressObj()); //Manually DI    //refering to bean of Address
		
		return stud;
	}

}
