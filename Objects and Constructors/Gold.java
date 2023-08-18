package states_and_behaviours;

public class Gold {
		int id;
		String category;
		double price;
		void manufactured() {
			System.out.println("manufacturing done at banglore");
		}
		void sold() {
			System.out.println("sold by the manufacturer");
		}
		void shipped() {
			System.out.println("shipped to the customer");
		}
}
class GoldProduct{
		public static void main(String[] args) {
			Gold g=new Gold();
			g.id=2431;
			g.category="bracelet";
			g.price=50000;
			g.manufactured();
			g.sold();
			g.shipped();
			System.out.println("Id="+g.id+", category="+g.category+", price="+g.price);
		}
	
}
