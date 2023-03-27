import GLOOP.*;

public class Ufospiel {
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private GLHimmel himmel;

    private Ufo dasUfo;
    private Asteroid asteroid1, asteroid2, asteroid3, asteroid4, asteroid5, asteroid6, asteroid7, asteroid8, asteroid9, asteroid10;
    //[...]

    public Ufospiel() {
        kamera = new GLKamera (1400, 850);
        kamera.verschiebe(0, dasUfo.gibY()-500, -300);
        kamera.setzeBlickpunkt(0,500,0);
        licht = new GLLicht();
        tastatur = new GLTastatur();
        himmel = new GLHimmel("src/img/Sterne.jpg");
        dasUfo = new Ufo();
        asteroid1 = new Asteroid(dasUfo);
        asteroid2 = new Asteroid(dasUfo);
        asteroid3 = new Asteroid(dasUfo);
        asteroid4 = new Asteroid(dasUfo);
        asteroid5 = new Asteroid(dasUfo);
        asteroid6 = new Asteroid(dasUfo);
        asteroid7 = new Asteroid(dasUfo);
        asteroid8 = new Asteroid(dasUfo);
        asteroid9 = new Asteroid(dasUfo);
        asteroid10 = new Asteroid(dasUfo);



    }

    public void fuehreaus() {

        while (!tastatur.esc()) {
            if ((tastatur.istGedrueckt('a'))&& (dasUfo.gibX()>-450)) {
                dasUfo.bewegelinks();
            }
            if ((tastatur.istGedrueckt('d'))&& (dasUfo.gibX()<450)) {
                dasUfo.bewegerechts();
            }
            if ((tastatur.istGedrueckt('w'))&& (dasUfo.gibZ()<350)) {
                dasUfo.bewegeoben();
            }

            if ((tastatur.istGedrueckt('s'))&& (dasUfo.gibZ()>-200)) {
                dasUfo.bewegeunten();
            }

            asteroid1.bewegeDich();
            asteroid2.bewegeDich();
            asteroid3.bewegeDich();
            asteroid4.bewegeDich();
            asteroid5.bewegeDich();
            asteroid6.bewegeDich();
            asteroid7.bewegeDich();
            asteroid8.bewegeDich();
            asteroid9.bewegeDich();
            asteroid10.bewegeDich();
            dasUfo.bewegevorne();

                System.out.println(dasUfo.gibY());

            Sys.warte();


        }
        
    }
}

