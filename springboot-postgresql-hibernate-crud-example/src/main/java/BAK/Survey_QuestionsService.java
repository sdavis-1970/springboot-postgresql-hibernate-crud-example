package BAK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Survey_QuestionsService  {
	
	@Autowired
	private Survey_QuestionsRepository survey_QuestionsRepository;
	

	public List<Survey_Questions> findAll() {
		List<Survey_Questions> survey_Questions = survey_QuestionsRepository.findAll();
		return survey_Questions;
		
	}
	
	
}
