package com.capgemini.start.api.dto.input;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(name = "UserInput", description = "Objeto de entrada para inclusão e alteração da entidade User")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserInputDTO {
	
	@NotNull
	@Length(max = 100)
	private String name;
	
	@NotNull
	@Length(max = 100)
	private String email;
	
	@NotNull
	@Length(max = 8)
	private String password;
	
}