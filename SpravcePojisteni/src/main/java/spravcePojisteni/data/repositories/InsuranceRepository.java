package spravcePojisteni.data.repositories;

import org.springframework.data.repository.CrudRepository;
import spravcePojisteni.data.entities.InsuranceEntity;

public interface InsuranceRepository extends CrudRepository<InsuranceEntity, Long> {
}
