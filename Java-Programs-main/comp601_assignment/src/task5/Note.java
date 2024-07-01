package task5;
import static java.lang.System.*;
public class Note {
	
	private String nid;
	private double seconds;
	
	public Note(String nid, double seconds) {
		this.setNid(nid);
		this.setSeconds(seconds);
	}
	public void playNote() {
		out.printf("\nThe note %s is played for %.0f seconds", nid, seconds);
	}
	
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public double getSeconds() {
		return seconds;
	}
	public void setSeconds(double seconds) {
		this.seconds = seconds;
	}

}
