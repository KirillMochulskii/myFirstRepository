import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        System.out.println("Branch KIRILL");
        List<String> str = new ArrayList<>();
        for( int i=0;i<10;i++){
            String value =i+"";
            str.add(value);
        }
        for(String values:str){
            System.out.print(values+" ");
        }



















    }
}