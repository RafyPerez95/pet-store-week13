package pet.store.dao;

import org.springframework.data.jpa.repository.*;
import pet.store.entity.PetStore;

public interface PetStoreDao extends JpaRepository<PetStore, Long> {

}
