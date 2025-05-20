/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaplatformer.Physics;

import java.util.ArrayList;
import java.util.List;

import javaplatformer.DataTransferObjects.DEBUG.Debug;
import javaplatformer.Process.Moveable;
import javaplatformer.Process.Paintable;

public class Universe {

    private final float gravityAcceleration = (float) -9.8;

    private List<Paintable> participants;

    private static Universe universe;

    public static Universe getOrCreateUniverse() {
        if (universe != null) {
            return universe;
        }
        universe = new Universe();
        return universe;
    }

    private Universe() {
        participants = new ArrayList<>();
    }

    public void tick() {

        move();
    }

    public void move() {
        for (Paintable participant : participants) {
            if (participant instanceof Moveable obj) {
                boolean overlaps = false;
                obj.moveX(obj.getXVelocity());
                obj.moveY(obj.getYVelocity());

                for (Paintable participantCompare : participants) {
                    if (participantCompare != participant &&
                            participantCompare.occupies(participant)) {
                        overlaps = true;
                        break;
                    }
                }

                if (!overlaps) {
                    Debug.setFlag("Not overlapping.");
                } else {
                    obj.moveX((float) -1.0 * obj.getXVelocity());
                    obj.moveY((float) -1.0 * obj.getYVelocity());
                    Debug.setFlag("Overlapping.");
                }
            }
        }
    }

    public void participate(Paintable newPlayer) {
        participants.add(newPlayer);
    }

}
