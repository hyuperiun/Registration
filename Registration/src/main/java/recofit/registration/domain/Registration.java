package recofit.registration.domain;

import java.util.Date;

import javax.persistence.*;
import lombok.Data;
import recofit.registration.RegistrationApplication;
import recofit.registration.domain.GymRegistered;
import recofit.registration.domain.PtProgramRegistered;

@Entity
@Table(name = "Registration_table")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date regDt;				// 등록일
    private Date startDt;			// 시작일
    private Date endDt;				// 종료일
    private Long registerId;		// 등록자 ID
    private String registerName;	// 등록자명

    private RegistrationType regType;

    private PtProgram ptProgram;
    private GymVoucher gymVoucher;

    public Registration(Registration regstration) {
        regDt=regstration.regDt;
        startDt=regstration.startDt;
        endDt=regstration.endDt;
        registerId=regstration.registerId;
        registerName=regstration.registerName;
        regType=regstration.regType;
        ptProgram=regstration.ptProgram;
        gymVoucher=regstration.gymVoucher;
    }

    // 헬스장, PT프로그램 신규등록후에 할 작업
    @PostPersist
    public void onPostPersist() {
    	if(this.regType==RegistrationType.PT_PROGRAM) {
	        PtProgramRegistered ptProgramRegistered = new PtProgramRegistered();
	        ptProgramRegistered.setId(this.getId());
	 
	        ptProgramRegistered.setRegDt(this.getRegDt());
	        ptProgramRegistered.setStartDt(this.getStartDt());
	       	ptProgramRegistered.setEndDt(this.getEndDt());
	       	ptProgramRegistered.setRegisterId(this.getRegisterId());
	       	ptProgramRegistered.setRegisterName(this.getRegisterName());
	       	ptProgramRegistered.setPtID(this.getPtProgram().getPtID());
	       	ptProgramRegistered.setPtName(this.getPtProgram().getPtName());
	       	ptProgramRegistered.setPtCount(this.getPtProgram().getPtCount());
	       	ptProgramRegistered.setTrainerID(this.getPtProgram().getTrainerID());
	       	ptProgramRegistered.setTrainerName(this.getPtProgram().getTrainerName());
	         
	        ptProgramRegistered.publishAfterCommit();
    	}
    	else if(this.regType==RegistrationType.GYM) {
	        GymRegistered gymRegistered = new GymRegistered();
	        gymRegistered.setRegDt(this.getRegDt());
	        gymRegistered.setStartDt(this.getStartDt());
	        gymRegistered.setEndDt(this.getEndDt());
	        gymRegistered.setRegisterId(this.getRegisterId());
	        gymRegistered.setRegisterName(this.getRegisterName());
	        gymRegistered.setGymID(this.getGymVoucher().getGymID());
	        gymRegistered.setGymName(this.getGymVoucher().getGymName());
	       	
	        gymRegistered.publishAfterCommit();
    	}
    }

    // 헬스장, PT프로그램 등록 변경 후에 할 작업
/*    
    @PostUpdate
    public void onPostUpdate() {
       	PtProgramUpdated ptProgramUpdated = new PtProgramUpdated();
        ptProgramUpdated.setId(this.getId());
 
        ptProgramUpdated.setRegDt(this.getRegDt());
        ptProgramUpdated.setStartDt(this.getStartDt());
       	ptProgramUpdated.setEndDt(this.getEndDt());
       	ptProgramUpdated.setRegisterId(this.getRegisterId());
       	ptProgramUpdated.setRegisterName(this.getRegisterName());
       	ptProgramUpdated.setPtID(this.getPtProgram().getPtID());
       	ptProgramUpdated.setPtName(this.getPtProgram().getPtName());
       	ptProgramUpdated.setPtCount(this.getPtProgram().getPtCount());
       	ptProgramUpdated.setTrainerID(this.getPtProgram().getTrainerID());
       	ptProgramUpdated.setTrainerName(this.getPtProgram().getTrainerName());
         
        ptProgramUpdated.publishAfterCommit();

       
        GymUpdated gymUpdated = new GymUpdated();
        gymUpdated.setRegDt(this.getRegDt());
        gymUpdated.setStartDt(this.getStartDt());
        gymUpdated.setEndDt(this.getEndDt());
        gymUpdated.setRegisterId(this.getRegisterId());
        gymUpdated.setRegisterName(this.getRegisterName());
        gymUpdated.setGymID(this.getGymVoucher().getGymID());
        gymUpdated.setGymName(this.getGymVoucher().getGymName());
       	
        gymUpdated.publishAfterCommit();
    }
*/    
    public static RegistrationRepository repository() {
        RegistrationRepository registrationRepository = RegistrationApplication.applicationContext.getBean(
            RegistrationRepository.class
        );
        return registrationRepository;
    }

    public void ptProgramRegistrationRequest() {}

    public void gymRegistrationRequest() {}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * @return the regDt
	 */
	public Date getRegDt() {
		return regDt;
	}

	/**
	 * @param regDt the regDt to set
	 */
	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}

	/**
	 * @return the startDt
	 */
	public Date getStartDt() {
		return startDt;
	}

	/**
	 * @param startDt the startDt to set
	 */
	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	/**
	 * @return the endDt
	 */
	public Date getEndDt() {
		return endDt;
	}

	/**
	 * @param endDt the endDt to set
	 */
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	/**
	 * @return the registerId
	 */
	public Long getRegisterId() {
		return registerId;
	}

	/**
	 * @param registerId the registerId to set
	 */
	public void setRegisterId(Long registerId) {
		this.registerId = registerId;
	}

	/**
	 * @return the registerName
	 */
	public String getRegisterName() {
		return registerName;
	}

	/**
	 * @param registerName the registerName to set
	 */
	public void setRegisterName(String registerName) {
		this.registerName = registerName;
	}

	/**
	 * @return the regType
	 */
	public RegistrationType getRegType() {
		return regType;
	}

	/**
	 * @param regType the regType to set
	 */
	public void setRegType(RegistrationType regType) {
		this.regType = regType;
	}

	/**
	 * @return the ptProgram
	 */
	public PtProgram getPtProgram() {
		return ptProgram;
	}

	/**
	 * @param ptProgram the ptProgram to set
	 */
	public void setPtProgram(PtProgram ptProgram) {
		this.ptProgram = ptProgram;
	}

	/**
	 * @return the gymVoucher
	 */
	public GymVoucher getGymVoucher() {
		return gymVoucher;
	}

	/**
	 * @param gymVoucher the gymVoucher to set
	 */
	public void setGymVoucher(GymVoucher gymVoucher) {
		this.gymVoucher = gymVoucher;
	}
}
