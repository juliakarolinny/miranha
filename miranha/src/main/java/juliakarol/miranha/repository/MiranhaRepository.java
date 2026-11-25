package juliakarol.miranha.repository;

import juliakarol.miranha.entities.Miranha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiranhaRepository  extends JpaRepository<Miranha, Integer> {
}
