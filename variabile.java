public class variabile {

    public static void main(String[] args) {
        
        String x= "watter";
        String y= "colorant";
        String temp=null;

        temp = x; 
        x=y;
        y=temp;
            System.out.println("x: "+x);
            System.out.println("y: "+y);

    }
}