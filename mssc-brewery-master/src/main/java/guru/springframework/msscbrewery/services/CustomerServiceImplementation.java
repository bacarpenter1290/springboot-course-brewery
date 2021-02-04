package guru.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.BeerDto;
import guru.springframework.msscbrewery.web.model.CustomerDto;

@Service
public class CustomerServiceImplementation implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .customerName("Baylee").build();
    }

	@Override
	public CustomerDto saveNewCustomer(CustomerDto customerDto) {
		return CustomerDto.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void updateCustomer(UUID customerId, BeerDto customerDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomerById(UUID customerId) {
		// TODO Auto-generated method stub
		
	}
}