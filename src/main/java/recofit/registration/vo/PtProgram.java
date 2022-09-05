package recofit.registration.vo;

import javax.persistence.*;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor

public class PtProgram {
	private Long ptID;			// PT 프로그램 ID
	private String ptName;		// PT 프로그램 명
    private Integer ptCount;	// PT 이용 횟수
    private Long trainerID;		// 트레이너 ID
    private String trainerName;	// 트레이너 이름

	@Builder
	public void PtProgram(Long ptID, String ptName, Integer ptCount, Long trainerID, String trainerName) {
		 this.ptID = ptID;
		 this.ptName = ptName;
		 this.ptCount = ptCount;
		 this.trainerID = trainerID;
		 this.trainerName = trainerName;
	}
}
