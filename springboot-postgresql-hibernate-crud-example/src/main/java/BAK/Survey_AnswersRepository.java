package BAK;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Survey_AnswersRepository extends JpaRepository<Survey_Answers, Double> {

}
