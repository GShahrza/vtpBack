package com.buta.totalusers.repository.count.universities;

import com.buta.totalusers.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdaCountRepository extends JpaRepository<User,Integer> {

    @Query(value="select count(u.university_id) from users u where u.university_id =4",nativeQuery=true)
    Integer findAdaCount();
}
