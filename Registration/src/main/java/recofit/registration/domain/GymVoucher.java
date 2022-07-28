package recofit.registration.domain;

import javax.persistence.*;

import lombok.Data;

@Embeddable
@Data
public class GymVoucher {
	private Long gymID;			// 헬스장 ID
	private String gymName;		// 헬스장 명
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
}
