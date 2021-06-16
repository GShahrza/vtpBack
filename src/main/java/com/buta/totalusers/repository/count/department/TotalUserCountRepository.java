package com.buta.totalusers.repository.count.department;

import com.buta.totalusers.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TotalUserCountRepository extends JpaRepository<User,Integer> {
    @Query(value = "select count(u.department_id) from users u ",nativeQuery = true)
    Integer findTotalUserCount();
}
