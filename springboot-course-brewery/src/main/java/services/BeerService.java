package services;

import java.util.UUID;

import web.model.BeerDto;

public interface BeerService {
	BeerDto getBeerById(UUID beerId);
}
