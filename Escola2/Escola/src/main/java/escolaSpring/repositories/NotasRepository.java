package escolaSpring.repositories;

import escolaSpring.entities.Notas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotasRepository extends JpaRepository<Notas, Long> {
}
