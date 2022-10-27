

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class AverageList {

    //Properties
    private static final Logger LOGGER = Logger.getLogger(AverageList.class);
    private List<Integer> integerList = new ArrayList<>();

    //Constructor
    public AverageList(List<Integer> integerList) throws Exception{

        this.integerList = integerList;

        if(integerList.size()>5 && integerList.size()<10){
            LOGGER.info("La lista tiene mas de 5 y menos de 10 elementos");
        }
        if(integerList.size()>10){
            LOGGER.info("La lista tiene mas de 10 elementos");
        }
        if(integerList.size()==0) {
            throw new Exception();
        }
    }

    public int average() {
        int sum = 0;
        int average;
        for (Integer integer : integerList) {
            sum += integer;
        }
        average = sum / integerList.size();
        return average;
    }
}
