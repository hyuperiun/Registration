package recofit.registration.repository;

import recofit.registration.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository
	extends JpaRepository<Registration,Long>  {
    public Registration findByid(Long id);
    public List <Registration> findByregisterId(Long registerId);
    public List <Registration> findByregisterName(String registerName);
    public List <Registration> findByregisterIdAndregisterName(Long registerId, String registerName);

    public List <Registration> findByPtProgram_trainerID(Long trainerID);
    public List <Registration> findByPtProgram_trainerName(String trainerName);
    public List <Registration> findByPtProgram_ptName(String ptName);
    public List <Registration> findByPtProgram_trainerIDAndtrainerName(Long trainerID, String trainerName);

    public List <Registration> findByGymVoucher_gymID(Long gymID);
    public List <Registration> findByGymVoucher_gymName(String gymName);
    public List <Registration> findByGymVoucher_gymIDAndgymName(Long gymID, String gymName);
}
