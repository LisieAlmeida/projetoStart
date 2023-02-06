package com.capgemini.start.api.dto.input;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(name = "ClientInput", description = "Objeto de entrada para inclusão e alteração da entidade Client")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientInputDTO {
	
	
	private Integer cpf;
	
	@NotNull
	@Length(max = 100)
	private String name;
	
	@NotNull
	@Length(max = 100)
	private String email;
	
	@Length(max = 250)
	private String adress;
	
	private String phone;
	
	
	
}