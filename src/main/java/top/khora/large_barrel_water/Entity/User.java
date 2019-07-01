package top.khora.large_barrel_water.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user_inf")
public class User {

    @GeneratedValue
    @Id
    private Long id;

    @Column
    private String username;

    /**
     * 关键字段
     * */
    @Column
    private String phoneNumber;

    @Column
    private int waterTicketNum=0;
    @Column
    private int owedWaterTicketNum=0;
    @Column
    private int usedWaterTicketNum=0;

    //
    @Column
    private String address;
    @Column
    private String payType;

    @Column
    private String createTime;

    @Column
    private String createLastOrderTime;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", waterTicketNum=" + waterTicketNum +
                ", owedWaterTicketNum=" + owedWaterTicketNum +
                ", usedWaterTicketNum=" + usedWaterTicketNum +
                ", address='" + address + '\'' +
                ", payType='" + payType + '\'' +
                ", createTime='" + createTime + '\'' +
                ", createLastOrderTime='" + createLastOrderTime + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getWaterTicketNum() {
        return waterTicketNum;
    }

    public void setWaterTicketNum(int waterTicketNum) {
        this.waterTicketNum = waterTicketNum;
    }

    public int getOwedWaterTicketNum() {
        return owedWaterTicketNum;
    }

    public void setOwedWaterTicketNum(int owedWaterTicketNum) {
        this.owedWaterTicketNum = owedWaterTicketNum;
    }

    public int getUsedWaterTicketNum() {
        return usedWaterTicketNum;
    }

    public void setUsedWaterTicketNum(int usedWaterTicketNum) {
        this.usedWaterTicketNum = usedWaterTicketNum;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateLastOrderTime() {
        return createLastOrderTime;
    }

    public void setCreateLastOrderTime(String createLastOrderTime) {
        this.createLastOrderTime = createLastOrderTime;
    }
}
