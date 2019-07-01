package top.khora.large_barrel_water.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import top.khora.large_barrel_water.Entity.Order;
import top.khora.large_barrel_water.Entity.User;

@Repository
public interface OrderDao  extends JpaRepository<Order, Long>, JpaSpecificationExecutor<OrderDao> {
}
