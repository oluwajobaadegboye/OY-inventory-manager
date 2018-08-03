package edu.mum.cs.inventorymanager.repository;


import edu.mum.cs.inventorymanager.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface IUserRepository extends JpaRepository<User, Long> {

    User findByUserId(long id);

    User findByEmail(String email);

    User findByUsername(String userName);

    User findByFirstName(String firstName);

    User findByLastName(String lastName);

    User findByMobile(String mobile);

    User findByUsernameAndPassword(String username, String password);
}
