import processing.core.PApplet;
import processing.core.PImage;

import java.util.Random;

public class Monete {
    private float posx;
    private float posy;
    private PApplet processing;
    private Random rnd = new Random();
    private PImage imgCoins;


    public Monete (PApplet prc) {
        this.processing = prc;
        imgCoins = processing.loadImage("coins.png");
        posx = (int)(Math.random() * ((processing.width - 0)+1)) + 0;
        posy = (int)(Math.random() * ((processing.height - 0)+1)) + 0;
    }

    void show() {
        processing.image(imgCoins, posx, posy, 60, 60);
    }
}
