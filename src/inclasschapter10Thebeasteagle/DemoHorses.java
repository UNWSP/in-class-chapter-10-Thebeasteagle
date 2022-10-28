package inclasschapter10Thebeasteagle;

public class DemoHorses {

	public static void main(String[] args) {
	
		Horse horse1 = new Horse();
		RaceHorse horse2 = new RaceHorse();
		horse1.setName("IShowSpeed");
		horse1.setColor("magenta");
		horse1.setBirthYear(2000);
		horse2.setName("SlimShady");
		horse2.setColor("green");
		horse2.setBirthYear(2005);
		horse2.setRaces(10);
		System.out.println(horse1.getName() + " is "
		+ horse1.getColor() + " in color " + "and was born in the year " + horse1.getBirthYear() + ".");
		System.out.println(horse2.getName() + " is "
				+ horse2.getColor() + " in color " + "and was born in the year " + horse2.getBirthYear() + ".");
		System.out.println(horse2.getName() +  " has been in " + horse2.getRaces() + " races.");
}
}
