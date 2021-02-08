package guru.springframework.msscbrewery.web.model.v2;

import java.util.UUID;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {

	private UUID id;
	private String beerName;
	private BeerStyleEnum beerStyle;
	private long upc;
}
