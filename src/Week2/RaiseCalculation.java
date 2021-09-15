package Week2;

public class RaiseCalculation {

    public int year;

    public  double raiseCalculation() {
        if(year==1) {
            return (0.05);
        }
        else if(year==2) {
            return (0.10);
        }
        else if(year==3) {
            return (0.15);
        }
        else if(year==3) {
            return (0.20);
        }
        else if(year<1) {
            return (0);
        }
        else  {
            return (0.25);
        }
    }

}
