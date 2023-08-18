package states_and_behaviours;

public class Stationary {
	int id;
	String category;
	double price;
	void manufactured() {
		System.out.println("manufacturing by the industry");
	}
	void sold() {
		System.out.println("sold to the bookstall");
	}
	void shipped() {
		System.out.println("shipped to the customer");
	}
}
class StationaryProduct{
	public static void main(String[] args) {
		Stationary s=new Stationary();
		s.id=12493206;
		s.category="book";
		s.price=72.34;
		s.manufactured();
		s.sold();
		s.shipped();
		System.out.println("Id="+s.id+", category="+s.category+", price="+s.price);
	}
}
