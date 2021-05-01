
public class UserManager {

	public void add(User user) 
	{
		System.out.println(user.getId()+" "+ user.getUserName()+ " Kullanýcýsý oluþturuldu.");
	}
	public void addMultitaple(User[] users) 
	{
		for(User user:users) {
			this.add(user);
		}
	}
	public void update(User user) 
	{
		System.out.println(user.getId()+" "+ user.getUserName()+ " Kullanýcýsý güncellendi.");
	}
	public void delete(User user) 
	{
		System.out.println(user.getId()+" "+ user.getUserName()+ " Kullanýcýsý silindi.");
	}
}
