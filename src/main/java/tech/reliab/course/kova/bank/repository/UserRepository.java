package tech.reliab.course.kova.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.reliab.course.kova.bank.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllUsersByBankId(Long id);
}
