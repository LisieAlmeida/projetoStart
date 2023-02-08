package com.capgemini.start.api.dto.output;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(name = "User", description = "Objeto de saída da entidade User")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
	
	private Long id;
	private Integer cpf;
	private String name;
	private String email;
	private String adress;
	private String phone;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataAlteracao;

}