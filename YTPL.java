public class YTPl {
  
    // Main driver method
    public static void main(String args[])
    {
        // Custom input string
        String str = "Yash@Technology@Private@Limited";
        String[] arrOfStr = str.split("@", 4);
  
        for (String a : arrOfStr)
            System.out.println(a);
    }
}