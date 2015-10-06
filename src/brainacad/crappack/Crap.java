package brainacad.crappack;

/**
 * Created by vitaliy.vorona on 10/6/2015.
 */
public class Crap {
    double weight;

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    @Override
    public String toString(){
        return Double.toString(weight);
    }
}
