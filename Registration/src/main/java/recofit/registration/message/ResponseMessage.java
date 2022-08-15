package recofit.registration.message;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class ResponseMessage {
    public String message;

    public Date responseTime;

    public Object data;

    @Builder
    public ResponseMessage(String message, Date responseTime, Object data) {
        this.message = message;
        this.responseTime = responseTime;
        this.data = data;
    }
}