package OneToMany.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital1 
{
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "hospital")
	private List<Branch1> branches;

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

	public List<Branch1> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch1> branches) {
		this.branches = branches;
	}

	@Override
	public String toString() {
		return "Hospital1 [id=" + id + ", name=" + name + "]";
	}

	
}
