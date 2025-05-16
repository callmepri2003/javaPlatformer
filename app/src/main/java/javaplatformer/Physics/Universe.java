/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaplatformer.Physics;

import java.util.ArrayList;
import java.util.List;

import javaplatformer.GameLogic.Player;
import javaplatformer.Process.ProneToPhysics;

public class Universe {

    private final float gravityAcceleration = (float) -9.8;

    private List<ProneToPhysics> participants;

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
        for (ProneToPhysics participant : participants) {
            participant.move();
        }
    }

    public void participate(ProneToPhysics newPlayer) {
        participants.add(newPlayer);
    }

}
