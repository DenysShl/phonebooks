package com.example.phonebook.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PhoneResponseDto {
    private Long id;
    private String numberPhone;
}
