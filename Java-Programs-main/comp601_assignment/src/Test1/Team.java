package Test1;

import static java.lang.System.out;

public class Team extends Group {

	private String ID;
	private double score;
	
	public Team (String name, int groupSize, String ID, double score) {
		super(name, groupSize);
		this.setID(ID);
		this.setScore(score);
	}
	
	public void displayInfo() {
		out.printf("%-20s %s\n","Name", super.getName());
		out.printf("%-20s %.2f\n", "ID", ID);
		out.printf("%-20s %d\n", "Score", score);
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
}
