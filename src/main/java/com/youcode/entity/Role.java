package com.youcode.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name ="role_table")
public class Role implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private long idRole;
    @Column(name = "role_name",length = 20,nullable = false)
    private  String roleName;

    public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@OneToMany(cascade= {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    private List<User> users;

    public Role() {

    }

    public long getIdRole() {
        return idRole;
    }

    public void setIdRole(long idRole) {
        this.idRole = idRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Role(long idRole, String roleName, List<User> users) {

        this.idRole = idRole;
        this.roleName = roleName;
        this.users = users;
    }

    public Role(String roleName, List<User> users) {
        this.roleName = roleName;
        this.users = users;
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }
}
