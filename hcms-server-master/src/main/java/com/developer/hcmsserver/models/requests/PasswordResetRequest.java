package com.developer.hcmsserver.models.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PasswordResetRequest {
    private String email;

    public boolean isEmpty() {
        return email.isEmpty();
    }
}
