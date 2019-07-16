public class Rectangle {
    public double side1;
    public double side2;
    public double obw;
    public double pp;
    public double across;

    public Rectangle () {

    }

    public Rectangle (double initSide1, double initSide2){
        side1 = initSide1;
        side2 = initSide2;
    }

    public double howLong () {
        obw = 2*side1+2*side2;
        return obw;
    }

    public double howBig () {
        pp = side1*side2;
        return pp;
    }

    public double across () {
        across = Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2));
        return across;
    }

    public void results () {
        System.out.println("Prostokąt ma wymiary "+side1+" oraz "+side2+" .");
        System.out.println("Jego obwód to "+obw+" .");
        System.out.println("Jego pole to "+pp+" .");
        System.out.println("Natomiast jego przekątna wynosi "+across+" .");
    }



}
