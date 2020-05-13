/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author ngoc
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeRectangle = shapeFactory.createShape(ShapeType.Rectangle);
        shapeRectangle.setBrush("trải");
        shapeRectangle.setPaper(" giấy");
        shapeRectangle.setFrame(" gắn vô khung vẽ");
        
        Shape shape2 = shapeFactory.createShape(ShapeType.Rectangle);
        shape2.setBrush("xếp");
        shape2.setPaper(" giấy");

        System.out.println(shapeRectangle.draw());
        System.out.println(shape2.draw());
        
        Shape shapeCircle = shapeFactory.createShape(ShapeType.Circle);
        shapeCircle.setBrush("trải");
        shapeCircle.setPaper(" giấy");
        shapeCircle.setFrame(" gắn vào khung vẽ");
        
        Shape shape2Circle = shapeFactory.createShape(ShapeType.Circle);
        shape2Circle.setBrush("xếp");
        shape2Circle.setPaper(" giấy");

        System.out.println(shapeCircle.draw());
        System.out.println(shape2Circle.draw());
        
    }
    
}
