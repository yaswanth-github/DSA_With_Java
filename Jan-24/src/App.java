public class App {
    int i = 10;
    
    public String  toString(){
        return "Hello Form Class App";
    }
    
    public static void main(String[] args) throws Exception {
        App obj = new App();
        
        System.out.println(obj.toString());
    }
}
