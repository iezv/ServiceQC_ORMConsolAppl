package tel_ran.quality.entities;

import java.util.*;
import javax.persistence.*;

@Entity
public class Question {
	@Id
	@Column(name = "id", nullable = false, insertable = true, updatable = true)
	int id;
	String body;
	public final int RAITING = 5;
			
	public Question(int id, String body) {
		super();
		this.id = id;
		this.body = body;
	}
	
	public Question() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getBody() {
		return body;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", body=" + body + ", RAITING=" + RAITING + "]";
	}

	
}
