package javaplatformer.DataTransferObjects;

import java.awt.*;

public class PaintInformation {
  private Color color;
  private int xPos;
  private int yPos;
  private int width;
  private int height;

  public int getxPos() {
    return xPos;
  }

  public void setxPos(int xPos) {
    this.xPos = xPos;
  }

  public int getyPos() {
    return yPos;
  }

  public void setyPos(int yPos) {
    this.yPos = yPos;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public PaintInformation(Color color, int xPos, int yPos, int width, int height) {
    this.color = color;
    this.xPos = xPos;
    this.yPos = yPos;
    this.width = width;
    this.height = height;
  }

}
