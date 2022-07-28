package recofit.registration.domain;

import java.util.Date;
import lombok.Data;

import recofit.registration.AbstractEvent;

@Data
public class GymRegistered extends AbstractEvent {
    private Long id;				// 등록 entity ID
    private Date regDt;				// 등록일
    private Date startDt;			// 시작일
    private Date endDt;				// 종료일
    private Long registerId;		// 등록자 ID
    private String registerName;	// 등록자명
    
	private Long gymID;			// 헬스장 ID
	private String gymName;		// 헬스장 명
	
    public GymRegistered(Registration aggregate) {
        super(aggregate);
    }

    public GymRegistered() {
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
	 * @return the gymID
	 */
	public Long getGymID() {
		return gymID;
	}
	/**
	 * @param gymID the gymID to set
	 */
	public void setGymID(Long gymID) {
		this.gymID = gymID;
	}
	/**
	 * @return the gymName
	 */
	public String getGymName() {
		return gymName;
	}
	/**
	 * @param gymName the gymName to set
	 */
	public void setGymName(String gymName) {
		this.gymName = gymName;
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
