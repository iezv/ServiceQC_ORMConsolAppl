package tel_ran.quality.entities;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import javax.persistence.*;

@Entity
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, insertable = true, updatable = true)
	int id;
	LocalDate date;
	String comment;
	
	@Embedded
	Result result;

	@OneToOne
	Client client;

	@OneToOne
	Service service;
	
	public Feedback(LocalDate date, String comment, Result result) {
		super();
		this.date = date;
		this.comment = comment;
		this.result = result;
	}

	public Feedback() {
		super();
	}

	public int getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getComment() {
		return comment;
	}

	public Client getClient() {
		return client;
	}

	public Result getResult() {
		return result;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
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
		Feedback other = (Feedback) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ReceivedFeedback [id=" + id + ", date=" + date + ", comment=" + comment + ", result=" + result
				+ ", client=" + client + ", service=" + service + "]";
	}

}
