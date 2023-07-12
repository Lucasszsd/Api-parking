package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.ParkingSpotRepository;

@Service
public class ParkingSpotService {

	final ParkingSpotRepository parkingSpotRepository;
	public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
		
		this.parkingSpotRepository =  parkingSpotRepository;
	}
	
}
