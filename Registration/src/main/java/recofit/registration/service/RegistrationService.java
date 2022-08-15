package recofit.registration.service;

import recofit.registration.dto.*;
import recofit.registration.entity.*;
import recofit.registration.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class RegistrationService {
    @Autowired
    public RegistrationRepository regRepository;

    public Registration findByid(Long id){
        Registration reg = regRepository.findByid(id);

        return reg;
    }
    
    public void saveNewRegistration(RegistrationDto newRegDto) {
/*    	
        this.regDt = regDt;
        this.startDt = startDt;
        this.endDt = endDt;
        this.registerId = registerId;
        this.registerName = registerName;
        this.regType = regType;
        this.ptProgram = ptProgram;
        this.gymVoucher = gymVoucher;
*/        
    	Registration reg = Registration.builder()
    			.regDt(newRegDto.getRegDt())
    			.startDt(newRegDto.getStartDt())
    			.endDt(newRegDto.getEndDt())
    			.registerId(newRegDto.getRegisterId())
    			.registerName(newRegDto.getRegisterName())
    			.regType(newRegDto.getRegType())
    			.ptProgram(newRegDto.getPtPromgram())
    			.gymVoucher(newRegDto.getGymVoucher())
    			.build();
    	regRepository.save(newReg);
    	return ;
    }
/*
    public List<RegGymDto> findAll(){
        List<Registration> reggymList = regRepository.findAll();

        List<RegGymDto> gymDtoList = reggymList.stream().map(
                gym -> RegGymDto.builder()
                        .gymId(gym.getGymId())
                        .gymName(gym.getGymName())
                        .address(gym.getAddress())
                        .floor(gym.getFloor())
                        .ownerId(gym.getOwnerId())
                        .rating(gym.getRating())
                        .build()
        ).collect(Collectors.toList());

        return gymDtoList;
    }
*/
}
