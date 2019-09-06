package com.simpragma.assignment.backendassignment.dto.request.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterRequestDto {

  private String username;

  private String password;

  private String email;

  private String address;
}
