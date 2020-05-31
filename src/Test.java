import processing.core.PApplet;

public class Test extends PApplet {
        private Campo c;

        public static void main(String[] args) {
            PApplet.main("Test");
        }

        public void settings() {
            fullScreen();  //dimensione finestra
        }

        public void setup() {
            int pos[][]={{4,7}, {15,15}};
            c = new Campo(this, pos);
        }

        public void draw() {
            background(255);
            c.show();
        }
    }