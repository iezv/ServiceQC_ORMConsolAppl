package tel_ran.quality.entities;


import java.util.*;
import javax.persistence.*;

@Entity
public class Service {
	@Id
	@Column(name = "name", nullable = false, insertable = true, updatable = true)
	String name;
	
	String ques1;
	String ques2;
	String ques3;
	String ques4;
	String ques5;
			
	@ManyToOne
	Company company;
	
	@OneToOne
    Manager manager;
	
	@ManyToMany
	List<Question>questions;
	
	public Service(String name) {
		super();
		this.name = name;
	}

	public Service() {
		super();
	}

	public String getName() {
		return name;
	}

	public String getQues1() {
		return ques1;
	}

	public String getQues2() {
		return ques2;
	}

	public String getQues3() {
		return ques3;
	}

	public String getQues4() {
		return ques4;
	}

	public String getQues5() {
		return ques5;
	}

	public Company getCompany() {
		return company;
	}

	public Manager getManager() {
		return manager;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQues1(String ques1) {
		this.ques1 = ques1;
	}

	public void setQues2(String ques2) {
		this.ques2 = ques2;
	}

	public void setQues3(String ques3) {
		this.ques3 = ques3;
	}

	public void setQues4(String ques4) {
		this.ques4 = ques4;
	}

	public void setQues5(String ques5) {
		this.ques5 = ques5;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Service [name=" + name + ", ques1=" + ques1 + ", ques2=" + ques2 + ", ques3=" + ques3 + ", ques4="
				+ ques4 + ", ques5=" + ques5 + ", company=" + company + ", manager=" + manager + "]";
	}

	
}
