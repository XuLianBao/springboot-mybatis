package cn.no7player.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zl on 2015/8/27.
 */
@Entity(name = "myUser")
@Table(name = "my_user", schema = "zzq_test")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class MineUsers {
    @Id
    private  Integer id;

    @Column(name = "u_name")
    private String username;

    @Column(name = "u_age")
    private Integer age;

    @Column(name = "u_password")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
