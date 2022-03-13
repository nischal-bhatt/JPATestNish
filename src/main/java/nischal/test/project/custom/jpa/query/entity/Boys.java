package nischal.test.project.custom.jpa.query.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Boys {
    
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String hobby;
	@Column(name="first_name")
	private String alahu;
	public Boys(int id, String name, String hobby,String alahu) {
		
		this.id = id;
		this.name = name;
		this.hobby = hobby;
		this.alahu = alahu;
	}
	protected Boys() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getAlahu() {
		return alahu;
	}
	public void setAlahu(String alahu) {
		this.alahu = alahu;
	}
	@Override
	public String toString() {
		return "Boys [id=" + id + ", name=" + name + ", hobby=" + hobby + "]";
	}
	
	
	
}
