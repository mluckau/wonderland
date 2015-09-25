/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mluckau.wonderland.entity;

import java.awt.Point;

/**
 *
 * @author michael
 */
public class Human {
    
    private int hp = 0;
    private int mana = 0;
    private int lvl = 1;
    
    private Point location = new Point();
    
    /*  Getter and Setter */
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    
    public Point getLocation() {
        return this.location;
    }
    
    public void setLocation(Point location){
        this.location = location;
    }
    
    /* Functions */
    
    public void sentTo(Point location){
        
    }
    
    public void sentChatMsg(String msg){
        
    }
    
    
}
