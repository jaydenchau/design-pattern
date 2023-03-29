package com.nature.design.pattern.factory;

import com.nature.design.pattern.factory.abs.CourseFactory;
import com.nature.design.pattern.factory.abs.JavaFactory;
import com.nature.design.pattern.factory.abs.PythonFactory;
import com.nature.design.pattern.factory.method.Product;
import com.nature.design.pattern.factory.method.ProductFactory;
import org.junit.Test;


/**
 * @author nature
 * @date 2020/10/16 16:09
 */
public class FactoryTest {

    /**
     * 工厂方法
     */
    @Test
    public void testFactory() {
        ProductFactory productFactory = new ProductFactory();
        Product product = productFactory.getProduct("shoes");
        product.buildProduct();
        Product product1 = productFactory.getProduct("clothes");
        product1.buildProduct();
    }

    /**
     * 抽象工厂
     */
    @Test
    public void testAbsFactory() {
        // 获取java工厂
        CourseFactory javaFactory = new JavaFactory();
        javaFactory.getNotes();
        javaFactory.getVideo();
        // 获取python工厂
        CourseFactory pythonFactory = new PythonFactory();
        pythonFactory.getVideo();
        pythonFactory.getNotes();
    }

}
