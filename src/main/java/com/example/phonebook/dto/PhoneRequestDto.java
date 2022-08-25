package com.example.phonebook.dto;

import com.example.phonebook.util.ValidPhone;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PhoneRequestDto {
    @NotNull(message = "Please enter phone number")
    @ValidPhone
    private String numberPhone;
}
