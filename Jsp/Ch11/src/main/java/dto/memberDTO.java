package dto;

public class memberDTO {
	private String uid;
	private String name;
	private String hp;
	private String pos;
	private int dep;
	private String date;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public int getDep() {
		return dep;
	}
	public void setDep(int dep) {
		this.dep = dep;
	}public void setDep(String dep) {
		this.dep = Integer.parseInt(dep);
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
