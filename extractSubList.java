import java.util.*;

class extractSubList {
    public static <T> List<T> extractSubList(List<T> list) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Original List: " + list);
        
        System.out.print("Enter starting index of the sublist: ");
        int start = input.nextInt();
        
        System.out.print("Enter size of the sublist: ");
        int size = input.nextInt();

        int end = start + size;

        // Validate input
        if (start < 0 || end > list.size() || size < 0) {
            System.out.println("Invalid sublist range.");
            return new ArrayList<>(); // return empty list
        }

        return new ArrayList<>(list.subList(start, end));
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(9);

        List<Integer> sublist = extractSubList(list);
        System.out.println("Extracted Sublist: " + sublist);
    }
}
