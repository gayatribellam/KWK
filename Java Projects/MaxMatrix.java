package HW1;

public class MaxMatrix {
	
	public static void main(String[] args) {

        Integer[][] list = new Integer[5][5];
        int n = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = i*2;
            }
        }

        System.out.println("The max element in this two dimensional array is:" + max(list));
    }

    public static <E extends Comparable<E>> E max(E[][] list) {

        E max = list[0][0];
        for (E[] elements : list) {
            for (E element : elements) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
        }

        return max;
    }

}
