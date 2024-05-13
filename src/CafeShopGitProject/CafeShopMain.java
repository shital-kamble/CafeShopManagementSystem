package CafeShopGitProject;
/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

	class Order {
		private List<MenuItem> items;
   // int quantity;
		private List<Integer> quantities;
    
			public Order() {
					this.items = new ArrayList<>();
        //
					this.quantities = new ArrayList<>();
			}

			public void addItem(MenuItem item, int quantity) {
				this.items.add(item);
   //     this.quantity = quantity;
				this.quantities.add(quantity);
			}

     double calculateTotal() {
        double total = 0;
   //     for (MenuItem item : items) {
   //         total += item.getPrice() * quantity;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPrice() * quantities.get(i);
        }
   // }
        return total;
    }

    public List<MenuItem> getItems() {
        return items;
    }
    
    public List<Integer> getQuantities() {
        return quantities;
    }

    class DisplayReceipt {
        public void displayReceipt(Order order) {
        	System.out.println("\n");
            System.out.println(" Receipt:");
     /*
            for (MenuItem item : order.getItems()) {
                System.out.println(item.getName() + " x " + order.quantity + " = $" + item.getPrice() * order.quantity);
            }
       */     
 /*           for (int i = 0; i < order.getItems().size(); i++) {
                System.out.println(order.getItems().get(i).getName() + " x " + order.getQuantities().get(i) + " = $" + order.getItems().get(i).getPrice() * order.getQuantities().get(i));
            }
            System.out.println("Total: $" + order.calculateTotal());
            if (order.calculateTotal() > 50) {
                System.out.println("Discount (10%): -$" + (order.calculateTotal() * 0.1));
                System.out.println("Total with Discount: $" + (order.calculateTotal() - (order.calculateTotal() * 0.1)));
            }
        }
    }
    public class Discount {
        public double applyDiscount(double total) {
            if (total > 50) {
                return total - (total * 0.1);
            }
            return total;
        }
    }

public class CafeShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.out.println("*******MENUITEM********");
        MenuItem[] menuItems = {
                new MenuItem("Coffee", 50.5),
                new MenuItem("Tea", 10.5),
                new MenuItem("Craxx", 15.0),
                new MenuItem("Pizza", 117.0),
                new MenuItem("Icecream", 60.0)
        };
        
     // Print out the menu items
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem.getName() + " - $" + menuItem.getPrice());
        }
        
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();
        System.out.println("*****ORDER******");
        System.out.print("Enter the number of items to order: ");
        int numItems = scanner.nextInt();

        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter the item name: ");
            String itemName = scanner.next();
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();

            MenuItem item = findMenuItem(menuItems, itemName);
            if (item!= null) {
                order.addItem(item, quantity);
            } else {
                System.out.println("Invalid item name. Please try again.");
                i--;
            }
            
        }

        DisplayReceipt displayReceipt = new DisplayReceipt();
       displayReceipt.displayReceipt(order);
        
     /*   Discount discount = new Discount();
        discount.applyDiscount(numItems);
    *//*
    }
/*
    private static MenuItem findMenuItem(MenuItem[] menuItems, String name) {
        for (MenuItem item : menuItems) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
	}

}

	}
*/
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    class MenuItem {
        private String name;
        private double price;

        public MenuItem(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    class Order {
        private List<MenuItem> items;
        private List<Integer> quantities;

        public Order() {
            this.items = new ArrayList<>();
            this.quantities = new ArrayList<>();
        }

        public void addItem(MenuItem item, int quantity) {
            this.items.add(item);
            this.quantities.add(quantity);
        }

        public double calculateTotal() {
            double total = 0;
            for (int i = 0; i < items.size(); i++) {
                total += items.get(i).getPrice() * quantities.get(i);
            }
            return total;
        }

        public List<MenuItem> getItems() {
            return items;
        }

        public List<Integer> getQuantities() {
            return quantities;
        }
    }

    class DisplayReceipt {
        public void displayReceipt(Order order) {
        	System.out.println("\n");
            System.out.println("Itemized Receipt:");
            for (int i = 0; i < order.getItems().size(); i++) {
                System.out.println(order.getItems().get(i).getName() + " x " + order.getQuantities().get(i) + " = $" + order.getItems().get(i).getPrice() * order.getQuantities().get(i));
            }
            System.out.println("Total: $" + order.calculateTotal());
            if (order.calculateTotal() > 50) {
                System.out.println("Discount (10%): -$" + (order.calculateTotal() * 0.1));
                System.out.println("Total with Discount: $" + (order.calculateTotal() - (order.calculateTotal() * 0.1)));
            }
        }
    }

    public class CafeShopMain {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            MenuItem[] menuItems = {
                    new MenuItem("Coffee", 2.5),
                    new MenuItem("Tea", 1.5),
                    new MenuItem("Sandwich", 5.0),
                    new MenuItem("Salad", 7.0),
                    new MenuItem("Dessert", 3.0)
            };

            Order order = new Order();
            System.out.print("Enter the number of items to order: ");
            int numItems = scanner.nextInt();

            for (int i = 0; i < numItems; i++) {
                System.out.print("Enter the item name: ");
                String itemName = scanner.next();
                System.out.print("Enter the quantity: ");
                int quantity = scanner.nextInt();

                MenuItem item = findMenuItem(menuItems, itemName);
                if (item!= null) {
                    order.addItem(item, quantity);
                } else {
                    System.out.println("Invalid item name. Please try again.");
                    i--;
                }
            }

            DisplayReceipt displayReceipt = new DisplayReceipt();
            displayReceipt.displayReceipt(order);
   /*         
            Discount discount= new Discount();
            discount.applyDiscount(numItems);
*/            }

        private static MenuItem findMenuItem(MenuItem[] menuItems, String name) {
            for (MenuItem item : menuItems) {
                if (item.getName().equals(name)) {
                    return item;
                }
            }
            return null;
        }
    }