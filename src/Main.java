import org.apache.log4j.Logger;

import java.util.Arrays;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        AverageList listSize5 = null;
        AverageList listSize10 = null;
        AverageList listSize0 = null;

        try{
            listSize5 = new AverageList(Arrays.asList(2,5,9,8,5,8));
            listSize10 = new AverageList(Arrays.asList(8,10,12,15,14,17,19,18,78,16,20));
            listSize0 = new AverageList(Arrays.asList());

        } catch (Exception e) {
            LOGGER.error("La lista esta vacia");
        }

        int average1 = listSize5.average();
        System.out.println(average1);
    }
}