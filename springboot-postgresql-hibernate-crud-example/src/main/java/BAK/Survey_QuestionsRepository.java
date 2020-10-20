package BAK;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Survey_QuestionsRepository extends JpaRepository<Survey_Questions, Integer> {

}
