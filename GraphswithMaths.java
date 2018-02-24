package graphswithmaths;

/**
 * @author psittacus
 */
public class GraphswithMaths {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame frm = new Frame("GraphswithMaths");
        int[] dates = new int[200];
        for(int i = 0; i < dates.length; i++) {
            dates[i] = (int) (Math.random() * 100);
            System.out.println(i + ": " + dates[i]);
        }
        frm.makeGraph(dates.length, dates);
    }
    
}
