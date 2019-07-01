package top.khora.large_barrel_water.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "order_inf")
public class Order {
    @GeneratedValue
    @Id
    private Long id;

    /**
     * 关键字段
     * */
    @Column
    private String bindPhoneNumber;

    @Column
    private String createTime;


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", bindPhoneNumber='" + bindPhoneNumber + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBindPhoneNumber() {
        return bindPhoneNumber;
    }

    public void setBindPhoneNumber(String bindPhoneNumber) {
        this.bindPhoneNumber = bindPhoneNumber;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
