package com.example.phonebook.dto.mapper;

/**
 * @author Denys.Shl
 * @created 23.08.2022 - 19:34
 * @project Phonebook
 */
public interface MapperRequestDto<U, V> {
    U toModel(V v);
}
