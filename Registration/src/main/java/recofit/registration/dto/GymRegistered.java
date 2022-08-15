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
}
