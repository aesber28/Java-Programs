package Test1;
import static java.lang.System.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class TeamApp {
	Scanner input = new Scanner(in);
	private List<Team> teams;

	public TeamApp(String filename) throws IOException {

		teams = new LinkedList<Team>();

		readTeamData(filename);

	}

	public void readTeamData(String filename) throws IOException {

		teams = new LinkedList<>();
		Path path = Paths.get(filename);
		List<String> lines = Files.readAllLines(path);
		for(String line : lines) {
			String[] items = line.split(",");
			String name = items[0];
			int groupSize = Integer.parseInt(items[1]);
			String ID = items[2];
			double score = Double.parseDouble(items[3]);
			Team a = new Team(name, groupSize, ID, score);
			teams.add(a);
		}
	}

	public double countTeams() {
		double count = 0, score = 0;
		if(teams != null && teams.size() > 0) {
			for(Team a : teams) {
				score = a.getScore();
				if(score >= 0 && score <= 100)
					count ++;
			}
		}
		return count;
	}

	public void searchTeam() {
		if(teams == null || teams.size() == 0) {
			out.println("No team found");
			return;
		}
		out.print("Enter team id: ");
		String ID = input.nextLine();
		Team team = null;//flag variable
		for(Team t : teams) {
			if(t.getID().equalsIgnoreCase(ID)) {
				team = t;
				break;
			}
		}
		if(team == null)
			out.printf("No result found for id: %s \n", ID);
		else
			team.displayInfo();
	}

	public double getAverageScore() {
		
		double count = 0, score = 0;
		if(teams != null && teams.size() > 0) {
			for(Team t : teams) {
				score = t.getScore();
				if(score >= 50 && score >=100)
					count++;
			}
		}
		return count;

	}

}
