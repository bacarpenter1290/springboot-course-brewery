package web.model;

import java.util.UUID;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

	private UUID id;
	private String beerName;
	private String beerStyle;
	private Long upc;
}
