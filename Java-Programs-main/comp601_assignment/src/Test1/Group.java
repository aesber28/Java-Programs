package Test1;

public class Group {
	private String name;
	private int groupSize;
	
	public Group (String name, int groupSize) {
		this.setName(name);
		this.setGroupSize(groupSize);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGroupSize() {
		return groupSize;
	}
	public void setGroupSize(int groupSize) {
		this.groupSize = groupSize;
	}
	
	
}
