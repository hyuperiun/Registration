package recofit.registration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import recofit.registration.domain.*;
import recofit.registration.KafkaProcessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAspectJAutoProxy
@EnableBinding(KafkaProcessor.class)
public class RegistrationApplication {

	public static ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		applicationContext=SpringApplication.run(RegistrationApplication.class, args);
	}
	
	@Autowired
	RegistrationRepository registrationRepository;
	
	@RequestMapping(method = RequestMethod.POST, path="registration/")
	public void ptProgramRegistrationRequest(@RequestBody Registration regInfo){

		Registration theRegistration = new Registration(regInfo);
		
		registrationRepository.save(theRegistration);

		return;
	}

/*	
	@Autowired
	PetRepository petRepository;

	@RequestMapping(method = RequestMethod.PUT, path="pets/{petId}/feed")
	public String feedPet(@PathVariable(value = "petId") Long petId){

		Pet thePet = petRepository.findById(petId).get();

		thePet.eat();

		petRepository.save(thePet);

		return "맛있는 거 먹였습니다.";
	}


	@RequestMapping(method = RequestMethod.PUT, path="pets/{petId}/groom")
	public String groomPet(@PathVariable(value = "petId") Long petId){
		Pet thePet = petRepository.findById(petId).get();

		if(thePet instanceof Groomable){
			String message = ((Groomable)thePet).grooming();
			petRepository.save(thePet);
			return message;
		}

		return "그루밍이 불가능한 Pet 입니다";
	}

	@RequestMapping(method = RequestMethod.PUT, path="cats/{petId}/groom")
	public String groomCat(@PathVariable(value = "petId") Long petId){
		return groomPet(petId);
	}


	@RequestMapping(method = RequestMethod.PUT, path="cats/{petId}/feed")
	public String feedCat(@PathVariable(value = "petId") Long petId){
		return feedPet(petId);
	}

	@RequestMapping(method = RequestMethod.PUT, path="dogs/{petId}/feed")
	public String feedDog(@PathVariable(value = "petId") Long petId){
		return feedPet(petId);
	}
	*/

}
