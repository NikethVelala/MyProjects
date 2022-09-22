import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UPIPayment {

    String doPayment(String source, String dest); // by default public and abstract

    default double getScratchCard(){
        return new Random().nextDouble();
    }


    //Static methods are similar to utility methods
    static String datePatterns(String patterns){
        SimpleDateFormat dateFormat = new SimpleDateFormat(patterns);
        return  dateFormat.format(new Date());
    }

}
