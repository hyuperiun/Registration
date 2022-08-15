package recofit.registration.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import recofit.registration.AbstractEvent;
import recofit.registration.entity.*;

@Getter
@Setter
@NoArgsConstructor
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
}
