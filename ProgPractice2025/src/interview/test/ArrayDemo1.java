package interview.test;

public class ArrayDemo1 {

    public static void main(String[] args) {
        int [] arr = {1, 3, 5, 1, 3, 7};

        // sort using merge sort
        int [] sortedArry = {1, 1, 3, 3, 5, 7};

        int k = removeDuplicate(sortedArry);

        for (int i = 0; i < k; i++) {
            System.out.println("Unique element: " + sortedArry[i]);

        }
    }

    private static int removeDuplicate(int[] sortedArry) {
        int index = 0;
        for (int i = 0; i < sortedArry.length; i++) {

                if(sortedArry[index] != sortedArry[i]) {
                    index++;
                    sortedArry[index] = sortedArry[i];
                }
            }
        return index + 1;
    }
}
