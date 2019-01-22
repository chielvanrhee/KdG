package OOTechnieken.Week3.SiteOpdrachten.Bord;

public class RondBord extends Bord {

    public RondBord(String materiaal, String kleur, double diameter) {
        super(materiaal, kleur);
        this.diameter = diameter;

    }

    private double diameter;

    @Override
    public double oppervlakte(){
        return ((diameter/2)*(diameter/2)*Math.PI);
    }

    @Override
    public String toString(){
        return String.format("Rond %s %f", super.toString(), oppervlakte());
    }


}
