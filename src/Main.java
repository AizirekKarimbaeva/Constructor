public class Main {
    public static void main(String[] args) {
        Class class1 = new Class(99853129,"Aizirek",new int[]{20,14,12,02});
        System.out.println("Number: "+class1.getNumber());
        System.out.println("Word: "+class1.getWord());
        System.out.println("Array: "+class1.getArray());
        for (int arr:class1.getArray()) {
            System.out.println(arr);
        }
    }
}