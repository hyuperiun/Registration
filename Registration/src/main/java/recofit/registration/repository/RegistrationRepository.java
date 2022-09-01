package recofit.registration.repository;

import recofit.registration.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository
	extends JpaRepository<Registration,Long>  {
    public Registration findByid(Long id);
    public List <Registration> findByRegisterId(Long registerId);
    public List <Registration> findByRegisterName(String registerName);
    public List <Registration> findByRegisterIdAndRegisterName(Long registerId, String registerName);

    public List <Registration> findByPtProgram_TrainerID(Long trainerID);
    public List <Registration> findByPtProgram_TrainerName(String trainerName);
    public List <Registration> findByPtProgram_PtName(String ptName);
    public List <Registration> findByPtProgram_TrainerIDAndPtProgram_TrainerName(Long trainerID, String trainerName);

    public List <Registration> findByGymVoucher_GymID(Long gymID);
    public List <Registration> findByGymVoucher_GymName(String gymName);
    public List <Registration> findByGymVoucher_GymIDAndGymVoucher_GymName(Long gymID, String gymName);
}
