package by.overone.it.repository;

import by.overone.it.pojo.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface UserRepository extends CrudRepository<User, String> {

    @Query("from User where username =:username")
    User getUserByUsername(@Param("username") String username);

    @Query("from User where username =:username and password =:password")
    User getUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
