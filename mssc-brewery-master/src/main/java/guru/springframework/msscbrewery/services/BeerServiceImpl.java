package guru.springframework.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Slf4j
@Service
@Deprecated
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		return BeerDto.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDto beerDto) {
		// TODO update beer dto
		
	}

	@Override
	public void deleteBeerById(UUID beerId) {
		// TODO delete beer dto
		log.debug("Deleting a beer...");
	}
}
