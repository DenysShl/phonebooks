package com.example.phonebook.util;

import com.example.phonebook.dto.PhoneRequestDto;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<ValidPhone, PhoneRequestDto> {
    private static final String VALID_PHONE_NUMBER_REGEX
            = "^\\\\+[0-9]{1,2}\\-[0-9]{1,3}\\-[0-9]{1,3}-[0-9]{1,4}";

    @Override
    public boolean isValid(PhoneRequestDto phoneRequestDto, ConstraintValidatorContext context) {
        String phoneNumber = phoneRequestDto.getNumberPhone();
        return phoneNumber != null && phoneNumber.matches(VALID_PHONE_NUMBER_REGEX);
    }
}
