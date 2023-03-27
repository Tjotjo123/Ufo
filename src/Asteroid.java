import GLOOP.*;
public class Asteroid {
    private GLKugel kugel;
    public double pX, pY;
    Ufo UFO;

    public Asteroid(Ufo pufo) {
        UFO = pufo;
        kugel = new GLKugel((Math.random()) * 1401 - 700, Math.random() * 1000 + 700, Math.random() * 500 , 50);
        kugel.setzeSkalierung(1, Math.random() + 0.3, Math.random() + 0.3);

    }

    public void bewegeDich() {
        kugel.verschiebe(0, Math.random()*-4, 0);
        if (kugel.gibY() < -700) {
            kugel.setzePosition((Math.random()) * 1000-500, UFO.gibY()+3500, Math.random() * 1000-500);
        }
        if (hit()) {
            UFO.bewegestartpunkt();

        }

    }



    public boolean hit() {
        double distance = Math.sqrt(Math.pow(kugel.gibX() - UFO.gibX(), 2) + Math.pow(kugel.gibY() - UFO.gibY(), 2));
        if (distance<35){
            return true;
        }else {
            return false;
        }
        }


    }


