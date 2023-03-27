import GLOOP.*;
public class Ufo {
    public GLZylinder rumpf;

    //[...]

    public  Ufo() {
        rumpf = new GLZylinder(0, 0, 0, 50, 20);}
        public void bewegelinks() {
       rumpf.verschiebe(-2,0,0);
         }
        public void bewegerechts() {
            rumpf.verschiebe(2, 0, 0);
        }

            public void bewegeoben () {
                rumpf.verschiebe(0, 0, 2);
            }
            public void bewegeunten () {
                rumpf.verschiebe(0, 0, -2);
            }
             public void bewegestartpunkt () {
        rumpf.setzePosition(0, 0, 0);
    }
            public void bewegevorne () {
        rumpf.verschiebe(0, 1, 0);
    }

    public double gibX(){
        return rumpf.gibX();
    }
    public double gibY(){
        return rumpf.gibY();
    }
    public double gibZ(){
        return rumpf.gibZ();
    }

        }






