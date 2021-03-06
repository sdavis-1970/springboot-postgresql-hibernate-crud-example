package BAK;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="survey_answers")
public class Survey_Answers {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //generates next number for us for a new record
	private double answerid;
		
	@Column(name="question_results")
	private int question_results;
	
	@Column(name="question_id")
	private int question_id;

	public Survey_Answers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Survey_Answers(double answerid, int question_results, int question_id) {
		super();
		this.answerid = answerid;
		this.question_results = question_results;
		this.question_id = question_id;
	}


	public double getAnswerid() {
		return answerid;
	}

	public void setAnswerid(double answerid) {
		this.answerid = answerid;
	}

	public int getQuestion_results() {
		return question_results;
	}

	public void setQuestion_results(int question_results) {
		this.question_results = question_results;
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public List<Survey_Answers> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
