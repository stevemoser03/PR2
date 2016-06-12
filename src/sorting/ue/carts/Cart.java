package sorting.ue.carts;

public class Cart implements Comparable<Cart>{

	private String username;
	private int numArticles;
	private int totalItems;
	private double totalAmount;
	public Cart(String username, int numArticles, int otalItems, double totalAmount) {
		super();
		this.username = username;
		this.numArticles = numArticles;
		this.totalItems = otalItems;
		this.totalAmount = totalAmount;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getNumArticles() {
		return numArticles;
	}
	public void setNumArticles(int numArticles) {
		this.numArticles = numArticles;
	}
	public int getTotalItems() {
		return totalItems;
	}
	public void setOtalItems(int otalItems) {
		this.totalItems = otalItems;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numArticles;
		result = prime * result + totalItems;
		long temp;
		temp = Double.doubleToLongBits(totalAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		if (numArticles != other.numArticles)
			return false;
		if (totalItems != other.totalItems)
			return false;
		if (Double.doubleToLongBits(totalAmount) != Double.doubleToLongBits(other.totalAmount))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cart [username=" + username + ", numArticles=" + numArticles + ", totalItems=" + totalItems
				+ ", totalAmount=" + totalAmount + "]";
	}

	@Override
	public int compareTo(Cart o) {
		// TODO Auto-generated method stub
		if(this.totalAmount < o.totalAmount) return 1;
		if(this.totalAmount > o.totalAmount) return -1;
		return 0;
	}
	
	
	
}
