package model;

import sound.MidiSynth;

import java.awt.*;

public class Rectangle extends Shape{

    public Rectangle(Point topLeft, MidiSynth midiSynth) {
        super(topLeft, midiSynth);
        instrument = 0;
        PLAYING_COLOR = new Color(0x000064);
    }

    @Override
    protected void drawGraphics(Graphics g){
        g.drawRect(x, y, width, height);
    }

    @Override
    protected void fillGraphics(Graphics g) {
        g.fillRect(x, y, width, height);
    }


}
