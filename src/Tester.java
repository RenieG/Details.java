public class Tester {

    public static void main(String[]args){
        Audi a1 = new Audi();
        a1.setModel("Audi R8");
        a1.setYear(2018);
        a1.setSpeed(240);
        System.out.println(a1); //watch out for the toString



        Volkswagen v1 = new Volkswagen();
        v1.setModel("VW Jetta");
        v1.setYear(2012);
        v1.setSpeed(200);
        System.out.println(v1);
    }
}



