package recofit.registration.controller;

//import recofit.registration.dto.RegGymDto;
//import recofit.registration.dto.RegPtProgramDto;
import recofit.registration.dto.RegistrationDto;
//import recofit.registration.kafka.Producer;
import recofit.registration.message.ResponseMessage;
import recofit.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/registration")
public class RegistrationController {
	
    @Autowired
    public RegistrationService regService;

//    @Autowired
//    public Producer producer;
    @PostMapping("/new")
    public ResponseEntity<ResponseMessage> saveNewRegistration(@RequestBody RegistrationDto regDto){
    	
        regService.saveNewRegistration(regDto);

        ResponseMessage responseMessage = ResponseMessage.builder()
                .message("save Registration Information Success.")
                .responseTime(new Date())
                .build();

        return new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.OK);
    }
    
    @GetMapping(value="/info/{regId}")
    public ResponseEntity<ResponseMessage> findByid(@PathVariable Long regId){
    	RegistrationDto regDto = regService.findByid(regId);

        ResponseMessage responseMessage = ResponseMessage.builder()
                .message("Find registration By regId")
                .responseTime(new Date())
                .data(regDto)
                .build();

        return new ResponseEntity<ResponseMessage>(responseMessage, HttpStatus.OK);
    }
}
