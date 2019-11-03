package ngomediator.ngomediatorapi.mongorepository;


import ngomediator.ngomediatorapi.model.Admin;
import ngomediator.ngomediatorapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User,String> {
    User findByEmail(String email);
}
