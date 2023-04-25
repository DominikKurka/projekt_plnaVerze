package spravcePojisteni.data.repositories;

import org.springframework.data.repository.CrudRepository;
import spravcePojisteni.data.entities.ClientEntity;

public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
}
