package javaplatformer.Process;

import javaplatformer.DataTransferObjects.PaintInformation;

public interface Paintable {
  public PaintInformation getPaintInformation();

  public float getCurrentX();

  public float getCurrentY();

  public boolean occupies(Paintable obj);

  public float getWidth();

  public float getHeight();
}
