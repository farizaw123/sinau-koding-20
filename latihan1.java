public class latihan1{
    public static void main(String args[]){


        for (int n = 1; n <= 50; n++){
            if(n % 3 == 0){
              System.out.println(n + " habis dibagi 3");
            }
            else if(n % 5 == 0){
              System.out.println (n + " habis dibagi 5");
            } else {
              System.out.println(n);
            }  
        }
    
    }
}

