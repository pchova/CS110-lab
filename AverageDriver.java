package Java110Lab;
/** Create an AverageDriver class. This class only contains the main method. The main method should
    declare and instantiate an Average object. Call the getUserData and calculateMean methods,
    in that order. The Average object information should then be printed to the console
 */
public class AverageDriver {
    public static void main(String[] args){
        Average a1 = new Average();
        a1.getUserData();
        a1.calculateMean();



    }
}
