import processing.core.PApplet;
import processing.core.PFont;

    public class Test extends PApplet {
        private Campi c;

        public static void main(String[] args) {
            PApplet.main("Test");
        }

        public void settings() {
            fullScreen();  //dimensione finestra
        }

        public void setup() {
            c = new Campi(this);
        }

        public void draw() {
            background(255);
            c.show();
        }
    }