package javaplatformer.DataTransferObjects;

import java.awt.*;

public class PaintInformation {
  private Color color;
  private float xPos;
  private float yPos;
  private float width;
  private float height;

  public float getxPos() {
    return xPos;
  }

  public void setxPos(int xPos) {
    this.xPos = xPos;
  }

  public float getyPos() {
    return yPos;
  }

  public void setyPos(int yPos) {
    this.yPos = yPos;
  }

  public float getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public float getHeight() {
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

  public PaintInformation(Color color, float xPos, float yPos, float width, float height) {
    this.color = color;
    this.xPos = xPos;
    this.yPos = yPos;
    this.width = width;
    this.height = height;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((color == null) ? 0 : color.hashCode());
    result = prime * result + Float.floatToIntBits(xPos);
    result = prime * result + Float.floatToIntBits(yPos);
    result = prime * result + Float.floatToIntBits(width);
    result = prime * result + Float.floatToIntBits(height);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    PaintInformation other = (PaintInformation) obj;
    if (color == null) {
      if (other.color != null)
        return false;
    } else if (!color.equals(other.color))
      return false;
    if (Float.floatToIntBits(xPos) != Float.floatToIntBits(other.xPos))
      return false;
    if (Float.floatToIntBits(yPos) != Float.floatToIntBits(other.yPos))
      return false;
    if (width != other.width)
      return false;
    if (height != other.height)
      return false;
    return true;
  }

}
