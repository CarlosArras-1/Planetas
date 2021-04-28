public class Planet {
    private String name;
    private double sun_distance;
    private String composition;
    private int orbit_days;
    public double mass;

//CONSTRUCTOR
    public Planet(String nom, double d, String c,int orbit_d,double mass){
this.name=nom;
this.sun_distance=d;
this.composition=c;
this.orbit_days=orbit_d;
this.mass=mass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSun_distance(double sun_distance) {
        this.sun_distance = sun_distance;
    }

    public double getSun_Distance() {
        return sun_distance;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getComposition() {
        return composition;
    }

    public void setOrbit_days(int orbit_days) {
        this.orbit_days = orbit_days;
    }

    public int getOrbit_days() {
        return orbit_days;
    }
}
