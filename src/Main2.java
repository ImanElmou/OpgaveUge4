
Product findMostExpensive(Product[] products) {
    Product mostExpensive = products[0];
    for (Product p : products) {
        if (p.price > mostExpensive.price) {
            mostExpensive = p;
        }
    }
    return mostExpensive;
}

    void main (){
        Product p1 = new Product("Ipad",3699, new String[]{"electronics", "new"});
        Product p2 = new Product("Iphone", 8999, new String[]{"electronics"});
        Product p3 = new Product("Airpods", 1200, new String[]{"electronics"});
        Product p4 = new Product("Headsets", 600, new String[]{"electronics"});

        Product [] products = {p1,p2,p3,p4};


        System.out.println("Products on sale:");
        for (Product p : products){
            if (p.hasTag("sale")){
                p.printInfoProduct();
            }
        }

        System.out.println("\nExpensive product:" );
        Product expensive = findMostExpensive(products);
        expensive.printInfoProduct();

    }

