package services;

import java.util.UUID;

import web.model.BeerDto;

public class BeerServiceImplementation implements BeerService {

	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID()).beerName("GalaxyCat").beerStyle("Pale Ale").build();
	}
}
