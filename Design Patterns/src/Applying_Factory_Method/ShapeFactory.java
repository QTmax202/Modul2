package Applying_Factory_Method;

import Factory_Method.Cat;
import Factory_Method.Dog;

public class ShapeFactory {
    public Shape getShape(String type) {
        if ("circle".equals(type)) {
            return new Circle();
        } else if ("square".equals(type)){
            return new Square();
        }else if ("rectangle".equals(type)){
            return new Rectangle();
        } else {
            return null;
        }
    }
}
