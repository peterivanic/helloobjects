package Obchod;

import java.util.ArrayList;

/**
 * Rozhraní, které jsme dostali od vývojářů platební brány.
 * Implement this interface to use our payment gateway
 */
public interface OrderInterface {

    int getNumber();

    /**
     * Customer's first name
     */
    String getFirstName();

    /**
     * Customer's last name
     */
    String getLastName();

    /**
     * Street
     */
    String getStreet();

    /**
     * House number
     */
    int getHouseNumber();

    /**
     * Registry number
     */
    int getRegistryNumber();

    /**
     * City
     */
    String getCity();

    /**
     * Zip code
     */
    String getZipCode();

    /**
     * Country
     */
    String getCountry();

    /**
     * Product names
     */
    ArrayList<String> getProducts();

    /**
     * Product quantities
     */
    ArrayList<Integer> getProductQuantities();

    /**
     * Product prices
     */
    ArrayList<Double> getProductPrices();

}
