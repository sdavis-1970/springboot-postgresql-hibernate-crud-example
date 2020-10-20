package BAK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {
	
	@Autowired
	private PetRepository petRepository;
	
	public List<Pet> findAll() { 
		List<Pet> pets = petRepository.findAll();
		return pets; 
		
	}
	
	

}
