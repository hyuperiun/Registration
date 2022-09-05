package recofit.registration.dto;

import java.util.Date;

import recofit.registration.vo.GymVoucher;
import recofit.registration.vo.PtProgram;
import recofit.registration.vo.RegistrationType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class RegistrationDto {
    private Long id;
    private Date regDt;				// 등록일
    private Date startDt;			// 시작일
    private Date endDt;				// 종료일
    private Long registerId;		// 등록자 ID
    private String registerName;	// 등록자명

    private RegistrationType regType;

    private PtProgram ptProgram;
    
    private GymVoucher gymVoucher;

    @Builder
    public RegistrationDto(Long id, Date regDt, Date startDt, Date endDt, Long registerId, String registerName,
    		RegistrationType regType, PtProgram ptProgram, GymVoucher gymVoucher) {
        this.id = id;
        this.regDt = regDt;
        this.startDt = startDt;
        this.endDt = endDt;
        this.registerId = registerId;
        this.registerName = registerName;
        this.regType = regType;
        this.ptProgram = ptProgram;
        this.gymVoucher = gymVoucher;
    }    
}
