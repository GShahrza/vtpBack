package com.buta.totalusers.repository.count.ages;

import com.buta.totalusers.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EighteenCountRepository extends JpaRepository<User,Integer> {

    @Query(value = "select count(u.ages) from users u where u.ages =18",nativeQuery = true)
    Integer findEighteenCount();
}
