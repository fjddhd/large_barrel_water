package top.khora.large_barrel_water.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import top.khora.large_barrel_water.Entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>, JpaSpecificationExecutor<UserDao> {
    //添加扩展查询
    @Query(value = "select * from user_inf where username = ?1", nativeQuery = true)
    User findByUsername(String username);

    @Query(value = "select * from user_inf where phoneNumber = ?1", nativeQuery = true)
    User findByPhoneNumber(String PhoneNumber);

}
