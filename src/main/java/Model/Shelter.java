import java.util.List;

public class Shelter {

	private List<Adopter> adopters = new ArrayList<>();

	private List<Staff> staff = new ArrayList<>();

	private List<Animal> animals = new ArrayList<>();

	public void addAnimal(Animal animal){
		animals.add(animal);
	}

	public void addStaff(Staff member){
		staff.add(member);
	}

	public void addAdopter(Adopter adopter){
		adopter.add(adopter);
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public List<Staff> getStaff() {
		return staff;
	}

	public List<Adopter> getAdopters() {
		return adopters;
	}



}
