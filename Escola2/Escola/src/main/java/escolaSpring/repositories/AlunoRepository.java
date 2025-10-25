package escolaSpring.repositories;


import escolaSpring.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<escolaSpring.entities.Aluno, Long> {

}
