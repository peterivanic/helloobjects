package Obchod;

public class Gateway {

    public void processOrder(OrderInterface order) {
        System.out.println("Order no. " + order.getNumber());
        System.out.println("=============");
        System.out.println("Name:    " + order.getFirstName() + " " + order.getLastName());
        System.out.println("Address: " + order.getStreet() + " "
                + order.getHouseNumber() + "/" + order.getRegistryNumber());
        System.out.println("         " + order.getCity() + " " + order.getZipCode());
        System.out.println("         " + order.getCountry());
        System.out.println();

        int sum = 0;
        for (int i = 0; i < order.getProducts().size(); i++) {
            System.out.println(order.getProducts().get(i) + " " +  order.getProductQuantities().get(i)
                    + "pcs per " + order.getProductPrices().get(i) + ",-");
            sum += order.getProductPrices().get(i);
        }
        System.out.println();
        System.out.println("Total price: " + sum + ",-");
    }

}
