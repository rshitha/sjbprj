package sjb.timecomplexity;

public class main {
    public static void main(String[] args) {
        int[] data = {5, 12, 7, 9, 23, 15}; 
        int key = 9;  

        LinearSearch ls = new LinearSearch(); 
        int result = ls.search(data, key); 

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
