package com.zosh.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class SignupRequest {
    private String email;
    private String fullName;
    private String otp;
}
