package Coupon.CouponServer.Domain;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {
    private long id;
    private String pw;

    private String number;
    private String name;
    private Integer point;




}
