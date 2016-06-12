package sorting.ue.carts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CartDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Cart> cartlist = new ArrayList<>();
		
		cartlist.add(new Cart("stevemoser",330,3,900));
		cartlist.add(new Cart("melaniemoser",60,5,300));
		cartlist.add(new Cart("user123",10,10,100));
		
		Collections.sort(cartlist);
		System.out.println("Sorty by total Amount (Absteigend)");
		System.out.println("");
		for (Cart c : cartlist) {
			System.out.println(c);
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Sort by Username (Aufsteigend)");
		System.out.println("");
		
		Collections.sort(cartlist, new CartUsernameComparator());
		
		for (Cart c : cartlist) {
			System.out.println(c);
		}
		
		System.out.println("------------------------------------------");
		System.out.println("Sort by TotalItems (Absteigend)");
		System.out.println("");
		
		Collections.sort(cartlist, new CartTotalItemsComparator());
		
		for (Cart c : cartlist) {
			System.out.println(c);
		}
		
		
		System.out.println("------------------------------------------");
		System.out.println("Sort by Amount per Item (Aufsteigend)");
		
		Collections.sort(cartlist, new Comparator<Cart>(){

			@Override
			public int compare(Cart o1, Cart o2) {
				// TODO Auto-generated method stub
			if((int) (o1.getTotalAmount()/o1.getTotalItems()) < (o2.getTotalAmount()/o2.getTotalItems())) return -1;
			if((int) (o1.getTotalAmount()/o1.getTotalItems()) > (o2.getTotalAmount()/o2.getTotalItems())) return 1;
			return 0;
			
			}
		});
		
		for (Cart c : cartlist) {
			System.out.println(c);
		}
		
	}

}
