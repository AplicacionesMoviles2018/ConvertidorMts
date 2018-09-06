package mx.itesm.a01373111.convertidormts;

// Logic
public class MtsConverter {
    private double m;

    public MtsConverter(){
        m = 0;
    }

    public double ConvertToFt(double m){
        return m / 0.3048;
    }

    public double ConvertToYd(double m){
        return m / 0.9144;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double getM() {
        return m;
    }
}
