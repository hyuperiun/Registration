package recofit.registration.entity;

import java.util.Date;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import recofit.registration.vo.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
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

    @Embedded
    private PtProgram ptProgram;
    
    @Embedded
    private GymVoucher gymVoucher;

    @Builder
    public Registration(Date regDt, Date startDt, Date endDt, Long registerId, String registerName, RegistrationType regType, PtProgram ptProgram, GymVoucher gymVoucher) {
        this.regDt = regDt;
        this.startDt = startDt;
        this.endDt = endDt;
        this.registerId = registerId;
        this.registerName = registerName;
        this.regType = regType;
        this.ptProgram = ptProgram;
        this.gymVoucher = gymVoucher;
    }

    // 헬스장, PT프로그램 신규등록후에 할 작업
    @PostPersist
    public void onPostPersist() {
/*    	
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
*/    	
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
}
