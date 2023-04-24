package OneToMany.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Branch1
{
	@Id
	private int id;
	private String address;
	private long phone;
	
	@ManyToOne
	@JoinColumn
	private Hospital1 hospital;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Hospital1 getHospital() {
		return hospital;
	}

	public void setHospital(Hospital1 hospital) {
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return "Branch1 [id=" + id + ", address=" + address + ", phone=" + phone + "]";
	}

	
	
}
