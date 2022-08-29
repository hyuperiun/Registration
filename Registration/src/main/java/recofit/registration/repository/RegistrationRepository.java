package recofit.registration.repository;

import recofit.registration.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository
	extends JpaRepository<Registration,Long>  {
    public Registration findByid(Long id);
    public List <Registration> findAllByregisterId(Long registerId);
    public List <Registration> findAllByregisterName(String registerName);
}
