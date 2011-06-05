package test;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



/**
 * 用户.
 * 
 * 使用JPA annotation定义ORM关系.
 * 使用Hibernate annotation定义JPA 1.0未覆盖的部分.
 * 
 * @author calvin
 */
@Entity
//表名与类名不相同时重新定义表名.
@Table(name = "SS_USER")
//默认的缓存策略.
//@DiscriminatorValue("user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long id;
	
	//字段非空且唯一,用于提醒Entity使用者及生成DDL.
	@NotNull
    @Size(min = 1, message = "{validator.notEmpty}")
        @Column(nullable = false, unique = true)
	private String loginName;
        @NotNull
    @Size(min = 1, message = "{validator.notEmpty}")
	private String password; //为简化演示,使用明文保存密码.
	private String name;
    //@Email
	private String email;
        //private boolean banned;

	
	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
        
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

    /**
     * @return the banned
     
    public boolean isBanned() {
        return banned;
    }
*/
    /**
     * @param banned the banned to set
     
    public void setBanned(boolean banned) {
        this.banned = banned;
   }
     */
}