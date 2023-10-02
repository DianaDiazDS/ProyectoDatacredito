package edu.co.datacredito.repositories;

import edu.co.datacredito.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IARepositoryUser extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM USER WHERE ID_USER = :idUser", nativeQuery = true)
    User findByIdUserSQL(Long idUser);

}
