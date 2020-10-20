package BAK;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

@Controller
public class Survey_QuestionsController {

		@Autowired
		private Survey_QuestionsService survey_QuestionsService;
		
		/*
		 * @GetMapping(value = {"/", "index"}) public String index(Model model) { return
		 * "index";
		 * 
		 * }
		 */
		
		@GetMapping("/survey_Questions")
		public String getsurvey_Questions(Model model) {
			List<Survey_Questions> survey_Questions = survey_QuestionsService.findAll();
			model.addAttribute("survey_Questions", survey_Questions);
			return "survey_questions";
		}
}
