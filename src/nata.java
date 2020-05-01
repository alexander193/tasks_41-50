public class nata {
    public static void main(String[] args) {
        int [] array = (encrypt("Hello"));
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        int[] array1 = { 72, 33, -73, 84, -12, -3, 13, -13, -68};
        System.out.println(decrypt(array1));
    }
    public static int[] encrypt (String A){
        int [] array = new int [A.length()];
        for (int i = 0; i < A.length(); i++) {
            if (i == 0)
                array[i] = A.charAt(i);
            else
                array[i] = A.charAt(i) - A.charAt(i-1);
        }
        return array;
    }
    public static String decrypt(int [] array) {
        String res ="";
        int m = array[0];
        for (int i = 0; i < array.length; i++){
            if (i == 0)
                res += (char) array[i];
            else {
                m += array[i];
                 res += (char) m;
            }
        }
        return res;
    }

}