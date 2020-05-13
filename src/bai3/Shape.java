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
public abstract class Shape {
  
    private String  Brush;
    private String  Paper;
    private String  Frame;

    public Shape() {
    }
    
    public abstract String draw();

    public String getBrush() {
        return Brush;
    }

    public void setBrush(String Brush) {
        this.Brush = Brush;
    }

    public String getPaper() {
        return Paper;
    }

    public void setPaper(String Paper) {
        this.Paper = Paper;
    }

    public String getFrame() {
        return Frame;
    }

    public void setFrame(String Frame) {
        this.Frame = Frame;
    }
    
    
}
