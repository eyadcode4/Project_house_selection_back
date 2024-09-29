package dec.eyad.house_selection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dec.eyad.house_selection.model.Consult;

@Repository
public interface ConsultRepository extends JpaRepository<Consult, Long> {
}