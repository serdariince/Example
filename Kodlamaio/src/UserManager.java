
public class UserManager {

	public void add(User user) 
	{
		System.out.println(user.getId()+" "+ user.getUserName()+ " Kullan�c�s� olu�turuldu.");
	}
	public void addMultitaple(User[] users) 
	{
		for(User user:users) {
			this.add(user);
		}
	}
	public void update(User user) 
	{
		System.out.println(user.getId()+" "+ user.getUserName()+ " Kullan�c�s� g�ncellendi.");
	}
	public void delete(User user) 
	{
		System.out.println(user.getId()+" "+ user.getUserName()+ " Kullan�c�s� silindi.");
	}
}
