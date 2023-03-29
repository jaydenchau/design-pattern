package com.nature.design.pattern.factory.method;

/**
 * @author nature
 * @date 2020/10/23 10:45
 */
public class ProductFactory {

    public Product getProduct(String productType) {
        switch (productType) {
            case "clothes":
                return new ClothesProduct();
            case "shoes":
                return new ShoesProduct();
            default:
                return null;
        }
    }
}
