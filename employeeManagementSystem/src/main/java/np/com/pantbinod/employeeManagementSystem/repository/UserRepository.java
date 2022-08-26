package np.com.pantbinod.employeeManagementSystem.repository;

import np.com.pantbinod.employeeManagementSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

    List<User> findAllByFirstNameAndLastName(String firstName, String lastName);

}
