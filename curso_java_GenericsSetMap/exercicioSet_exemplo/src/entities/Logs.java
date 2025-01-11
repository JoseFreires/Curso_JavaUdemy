package entities;

import java.util.Date;
import java.util.Objects;

public class Logs {
	private String name;
	private Date date;
	
	public Logs(String name, Date date) {
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Logs other = (Logs) obj;
		return Objects.equals(name, other.name);
	}

	
	
}
