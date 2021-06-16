package com.buta.totalusers.repository.count.department;

import com.buta.totalusers.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HRCountRepository extends JpaRepository<User,Integer> {
    @Query(value = "select count(u.department_id) from users u where u.department_id =4",nativeQuery = true)
    Integer findHRCount();
}
