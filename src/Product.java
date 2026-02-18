public class Product {

    String productName;
    double price;
    String[] tags;


    Product(String name, double price, String[] tags) {
        this.productName = name;
        this.price = price;
        this.tags = tags;

    }

    void printInfoProduct() {
        System.out.println(productName + " - " + price + " kr. ");
        System.out.println(" Tags: ");
        for (int i = 0; i < tags.length; i++) {
            System.out.println(tags[i]);
            if (i < tags.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println();
    }

    boolean hasTag(String tag) {
        for (String t : tags) {
            if (t.equals(tag)) {
                return true;
            }
        }
        return false;
    }
}







