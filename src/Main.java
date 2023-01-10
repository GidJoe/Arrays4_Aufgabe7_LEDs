public class Main {
    public static void main(String[] args) {
        boolean[] leds = {false, false, false, false, false, false, false, false};
        for (int i=0; i<256; i++) {
            int x = i;
            if (x >= 128) {
                leds[0] = true;
                x -= 128;
            }
            if (x >= 64) {
                leds[1] = true;
                x -= 64;
            }
            if (x >= 32) {
                leds[2] = true;
                x -= 32;
            }
            if (x >= 16) {
                leds[3] = true;
                x -= 16;
            }
            if (x >= 8) {
                leds[4] = true;
                x -= 8;
            }
            if (x >= 4) {
                leds[5] = true;
                x -= 4;
            }
            if (x >= 2) {
                leds[6] = true;
                x -= 2;
            }
            if (x >= 1) {
                leds[7] = true;
                x -= 1;
            }
            for (int j=0; j<leds.length; j++) {
                if(!leds[j]) {
                    System.out.print("o");
                } else {
                    System.out.print("*");
                    leds[j] = false;
                }
            }
            System.out.print(" "+ i + "\n ");
        }

    }
}