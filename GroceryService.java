package MyPack.GroceryDeliveryApplication.Services;

import java.util.List;

import MyPack.GroceryDeliveryApplication.Entities.Grocery;

public interface GroceryService {
	 public List<Grocery> getGrocery();
		
		public Grocery getGrocery(long groceryId);
		
		public Grocery addGrocery(Grocery grocery);
		
		public Grocery updateGrocery(Grocery grocery);

		public void deleteGrocery(long parseLong);

}
