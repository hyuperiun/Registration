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
@Table(name = "registration")
public class Registration {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Date regDt;				// 등록일
    private Date startDt;			// 시작일
    private Date endDt;				// 종료일
    private Long registerId;		// 등록자 ID : memberID
    private String registerName;	// 등록자명 : memberName

    @Enumerated(EnumType.STRING)
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
}
