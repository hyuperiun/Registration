package recofit.registration.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Embeddable
@NoArgsConstructor
public class GymVoucher {
	private Long gymID;			// 헬스장 ID
	private String gymName;		// 헬스장 명
	
	@Builder
	public void GymVoucher(Long gymID, String gymName) {
		 this.gymID = gymID;
		 this.gymName = gymName;
	}
}
