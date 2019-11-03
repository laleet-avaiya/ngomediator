package ngomediator.ngomediatorapi.mongorepository;


import ngomediator.ngomediatorapi.model.NGO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface NGORepository extends MongoRepository<NGO,String> {
    public NGO findByEmail(String email);
}
