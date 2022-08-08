package in.ashokit;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import antlr.collections.List;
import in.ashokit.entity.User;
import in.ashokit.repository.UserRepository;
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository userRepo = context.getBean(UserRepository.class);
		
		  User entity1 = new User(); entity1.setUserId(104);
		  entity1.setUsername("shraddha"); entity1.setUserAge(26);
		  entity1.setUserPhno(734567890); entity1.setUserCountry("caneda");
		  
		  userRepo.save(entity1); System.out.println("**** Record Inserted ****");      //for inserting one record we use save method
		 
		
		
		/*
		 * User entity2 = new User(); entity2.setUserId(102);
		 * entity2.setUsername("sneha"); entity2.setUserAge(25);
		 * entity2.setUserPhno(987654321); entity2.setUserCountry("UK");
		 * 
		 * 
		 * 
		 * User entity3 = new User(); entity3.setUserId(103);
		 * entity3.setUsername("swara"); entity3.setUserAge(10);
		 * entity3.setUserPhno(546767890); entity3.setUserCountry("US");
		 * 
		 * java.util.List<User> entitiesList = Arrays.asList(entity2,entity3);
		 * userRepo.saveAll(entitiesList);                                         // for inserting multiple records we use saveall method
		 * 
		 */
		
		/*
		 * Optional<User> findById = userRepo.findById(101); if(findById.isPresent()) {
		 * System.out.println(findById.get()); }                                             //findById method gives single records by using primary key 
		 */
		
		/*Iterable<User> findAllById = userRepo.findAllById(Arrays.asList(101,103));
		findAllById.forEach(user -> {                                                     //findAllById method gives the multiple records by using primary key
			System.out.println(user);                
		});*/
		
		/*
		 * Iterable<User> findAll = userRepo.findAll(); findAll.forEach(user -> {               // findAll gives all records 
		 * System.out.println(user); });
		 * 
		 */
		
	//	System.out.println("Total Records::"+userRepo.count());      //Total record count
		
		 // userRepo.deleteById(103);     // deleteById method deleted records for perticular Id
		
		
		
		
		
		
	
	}
}
