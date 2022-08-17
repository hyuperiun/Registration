package recofit.registration.service;

import recofit.registration.dto.*;
import recofit.registration.entity.*;
import recofit.registration.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegistrationService {
    @Autowired
    public RegistrationRepository regRepository;

    public void saveNewRegistration(RegistrationDto newRegDto) {
    	Registration reg = Registration.builder()
    			.regDt(newRegDto.getRegDt())
    			.startDt(newRegDto.getStartDt())
    			.endDt(newRegDto.getEndDt())
    			.registerId(newRegDto.getRegisterId())
    			.registerName(newRegDto.getRegisterName())
    			.regType(newRegDto.getRegType())
    			.ptProgram(newRegDto.getPtProgram())
    			.gymVoucher(newRegDto.getGymVoucher()).build();
    	
    	regRepository.save(reg);
    	
    	return ;
    }

    public RegistrationDto findByid(Long id){
        Registration reg = regRepository.findByid(id);

        RegistrationDto regDto = RegistrationDto.builder()
    			.regDt(reg.getRegDt())
    			.startDt(reg.getStartDt())
    			.endDt(reg.getEndDt())
    			.registerId(reg.getRegisterId())
    			.registerName(reg.getRegisterName())
    			.regType(reg.getRegType())
    			.ptProgram(reg.getPtProgram())
    			.gymVoucher(reg.getGymVoucher())
    			.build();
        
        return regDto;
    }

    public List<RegistrationDto> findAll(){
        List<Registration> regList = regRepository.findAll();

        List<RegistrationDto> regDtoList = regList.stream().map(
                registration -> RegistrationDto.builder()
    			.regDt(registration.getRegDt())
    			.startDt(registration.getStartDt())
    			.endDt(registration.getEndDt())
    			.registerId(registration.getRegisterId())
    			.registerName(registration.getRegisterName())
    			.regType(registration.getRegType())
    			.ptProgram(registration.getPtProgram())
    			.gymVoucher(registration.getGymVoucher())
    			.build()
        ).collect(Collectors.toList());

        return regDtoList;
    }
}
