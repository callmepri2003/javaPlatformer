/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaplatformer.GameLogic;

import java.util.ArrayList;
import java.util.List;

import javaplatformer.Process.ProneToPhysics;

public class Physics {

    private List<ProneToPhysics> universe;

    public Physics() {
        universe = new ArrayList<>();
    }

    public void tick() {
    }

    public void addObjectToUniverse(ProneToPhysics obj) {
        universe.add(obj);
    }

}
