package tel_ran.quality.entities;
import java.util.Map;
import javax.persistence.*;
@Entity
public abstract class Person {
	@Id
	@Column(name = "id", nullable = false, insertable = true, updatable = true)
	int id;
	String name;
	int birthyear;
	String phone;
	String email;
	
	@Embedded
	Address address;
	
	public Person(int id, String name, int birthyear, String phone, String email, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.birthyear = birthyear;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public Person() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public Address getAddress() {
		return address;
	}

	public int getBirthyear() {
		return birthyear;
	}

	@Override
	public abstract String toString();
	
	
}
