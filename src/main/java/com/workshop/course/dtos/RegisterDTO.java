package com.workshop.course.dtos;

import com.workshop.course.entities.enums.UserRoles;

public record RegisterDTO(String name, String email, String phone, String password, UserRoles role) {
}
