package com.capgemini.start.api.dto.output;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(name = "Product", description = "Objeto de saída da entidade Product")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
	
	private Long id;
	private String name;
	private String descricao;
	private Double price;
	private String imgUrl;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataAlteracao;

}