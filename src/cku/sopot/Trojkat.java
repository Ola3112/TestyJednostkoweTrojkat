package cku.sopot;

public class Trojkat {
    private float podstawa;
    private float wysokosc;

    public Trojkat (float podstawa, float wysokosc){
        setPodstawa(podstawa);
        setWysokosc(wysokosc);

    }
    public float getPodstawa(){
        return podstawa;
    }
    public void setPodstawa(float podstawa){
        if (podstawa >=0) this.podstawa = podstawa;
        else this.podstawa = - podstawa;
    }
    public float getWysokosc(){
        return wysokosc;
    }
    public void setWysokosc(float wysokosc){
        if (wysokosc >= 0 ) this.wysokosc = wysokosc;
        else this.wysokosc = - wysokosc;
    }
    public float obliczPole(){
        return podstawa * wysokosc /2;
    }
}


