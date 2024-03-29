import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
	private String name;
	private int hitPoints;
	private int health;
	private String weapon;
	
	
	public Player(String name, int hitPoints, int health) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.health = health;
		this.weapon = "Sword";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHitPoints() {
		return hitPoints;
	}


	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public String getWeapon() {
		return weapon;
	}


	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}


	@Override
	public String toString() {
		return "Player [name=" + name + ", hitPoints=" + hitPoints + ", health=" + health + ", weapon=" + weapon + "]";
	}


	@Override
	public List<String> write() {
		List<String> values = new ArrayList<>();
		values.add(0, this.name);
		values.add(1, String.valueOf(this.hitPoints));
		values.add(2, String.valueOf(this.health));
		values.add(3, this.weapon);
		
		return values;
	}


	@Override
	public void read(List<String> savedValues) {
		this.name = savedValues.get(0);
		this.hitPoints = Integer.parseInt(savedValues.get(1));
		this.health = Integer.parseInt(savedValues.get(2));
		this.weapon = savedValues.get(3);
		
	}
	
	
	
	
}
