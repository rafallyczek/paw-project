package paw.project.calendarapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import paw.project.calendarapp.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findByLogin(String login);
}
