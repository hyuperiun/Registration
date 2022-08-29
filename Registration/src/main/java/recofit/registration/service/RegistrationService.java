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
    
    public List<RegistrationDto> findByRegisterId(Long regsterID){
        List<Registration> regList = regRepository.findByregisterId(regsterID);

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

    public List<RegistrationDto> findByRegisterName(String regsterName){
        List<Registration> regList = regRepository.findByregisterName(regsterName);

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

    public List<RegistrationDto> findByRegisterIdAndRegisterName(Long registerId, String regsterName){
        List<Registration> regList = regRepository.findByregisterIdAndregisterName(registerId, regsterName);

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

    public List<RegistrationDto> findByPtTrainerID(Long trainerID){
        List<Registration> regList = regRepository.findByPtProgram_trainerID(trainerID);

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
    
    public List<RegistrationDto> findByPtTrainerName(String trainerName){
        List<Registration> regList = regRepository.findByPtProgram_trainerName(trainerName);

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

    public List<RegistrationDto> findByPtTrainerNameAndPtTrainerName(Long trainerID, String trainerName){
        List<Registration> regList = regRepository.findByPtProgram_trainerIDAndtrainerName(trainerID, trainerName);

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

    public List<RegistrationDto> findByPtName(String ptName){
        List<Registration> regList = regRepository.findByPtProgram_ptName(ptName);

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

    public List<RegistrationDto> findByGymID(Long gymID){
        List<Registration> regList = regRepository.findByGymVoucher_gymID(gymID);

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
    
    public List<RegistrationDto> findByGymName(String gymName){
        List<Registration> regList = regRepository.findByGymVoucher_gymName(gymName);

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
    
    public List<RegistrationDto> findByGymIDAndGymName(Long gymID, String gymName){
        List<Registration> regList = regRepository.findByGymVoucher_gymIDAndgymName(gymID, gymName);

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
    
    public void deleteRegistration(Long regId) {
    	regRepository.deleteById(regId);
    }
}
