package recofit.registration.domain;

import java.util.Date;
import recofit.registration.AbstractEvent;

public class PtProgramRegistered extends AbstractEvent {
    private Long id;				// 등록 entity ID
    private Date regDt;				// 등록일
    private Date startDt;			// 시작일
    private Date endDt;				// 종료일
    private Long registerId;		// 등록자 ID
    private String registerName;	// 등록자명

	private Long ptID;			// PT 프로그램 ID
	private String ptName;		// PT 프로그램 명
    private Integer ptCount;	// PT 이용 횟수
    private Long trainerID;		// 트레이너 ID
    private String trainerName;	// 트레이너 이름

    public PtProgramRegistered(Registration aggregate) {
        super(aggregate);
    }

    public PtProgramRegistered() {
        super();
    }
    // keep
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
	 * @return the ptID
	 */
	public Long getPtID() {
		return ptID;
	}
	/**
	 * @param ptID the ptID to set
	 */
	public void setPtID(Long ptID) {
		this.ptID = ptID;
	}    
	/**
	 * @return the ptName
	 */
	public String getPtName() {
		return ptName;
	}
	/**
	 * @param ptName the ptName to set
	 */
	public void setPtName(String ptName) {
		this.ptName = ptName;
	}
	/**
	 * @return the ptCount
	 */
	public Integer getPtCount() {
		return ptCount;
	}
	/**
	 * @param ptCount the ptCount to set
	 */
	public void setPtCount(Integer ptCount) {
		this.ptCount = ptCount;
	}
	/**
	 * @return the trainerID
	 */
	public Long getTrainerID() {
		return trainerID;
	}
	/**
	 * @param trainerID the trainerID to set
	 */
	public void setTrainerID(Long trainerID) {
		this.trainerID = trainerID;
	}
	/**
	 * @return the trainerName
	 */
	public String getTrainerName() {
		return trainerName;
	}
	/**
	 * @param trainerName the trainerName to set
	 */
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
}
