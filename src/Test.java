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
            int pos[][]={{15,10},{15,11},{15,12},{15,13},{15,14},{15,15},{15,16},{15,17},{15,18},{15,17},{14,18},{14,19},{13,19},{13,20},{12,20},{12,21},{11,21},{11,21},{5,10},{5,11},{15,1},{15,2},{15,2}};
            c = new Campo(this, pos);
        }

        public void draw() {
            background(255);
            c.show();
        }
    }