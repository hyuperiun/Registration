package recofit.registration.domain;

import javax.persistence.*;

import lombok.Data;

@Embeddable
@Data
public class PtProgram {
	private Long ptID;			// PT 프로그램 ID
	private String ptName;		// PT 프로그램 명
    private Integer ptCount;	// PT 이용 횟수
    private Long trainerID;		// 트레이너 ID
    private String trainerName;	// 트레이너 이름

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
}
