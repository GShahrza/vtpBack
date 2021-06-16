package com.buta.totalusers.repository.compare.degree;

import com.buta.totalusers.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GraduateCountRepository extends JpaRepository<User,Integer> {

    @Query(value = "select count(u.degree_id) from users u where u.degree_id = 1",nativeQuery = true)
    Integer findGraduateusers();
}
