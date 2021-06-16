package com.buta.totalusers.repository.departments;

import com.buta.totalusers.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDepartmentUserRepository extends JpaRepository<User,Integer> {

    @Query(value = "select u.ages,u.names,u.surname ,u.email ,u.phone,\n" +
            " g.names as gender_names,\n" +
            " u2.names as universities_names,\n" +
            " ud.names as degree_names\n" +
            " from users u \n" +
            " inner join gender g  on u.gender_id =g.id \n" +
            " inner join universities u2 ON u.university_id =u2.id \n" +
            " inner join university_degree ud on u.degree_id =ud.id\n" +
            " where u.department_id =2", nativeQuery = true)
    List<String> findAccountUsers();
}
