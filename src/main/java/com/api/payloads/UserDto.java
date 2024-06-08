package com.api.payloads;

import java.util.HashSet;
import java.util.Set;

import com.api.entities.Role;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
  private int id;
  @NotEmpty
  @Size(min=4,message="username must be min of 4 character")
  private String name;
  @Email(message="your email is not valid")
  private String email;
  @NotEmpty
  @Size(min=3, max=10,message="password must be min of 3 character nd max of 10 chars")
  private String password;
  @NotEmpty
  private String about;
  
	private Set<RoleDto> roles = new HashSet<>();
}
