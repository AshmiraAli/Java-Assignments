class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListStack<T> 
{
    private Node<T> top;

    public LinkedListStack() 
	{
        top = null;
    }

    public boolean isEmpty() 
	{
        return top == null;
    }

    public void push(T data) 
	{
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop() 
	{
        if (isEmpty()) 
		{
            return null;
        }
        T value = top.data;
        top = top.next;
        return value;
    }

    public T peek() 
	{
        if (isEmpty()) 
		{
            return null;
        }
        return top.data;
    }
}

public class PalindromeChecker 
{
    public static boolean isPalindrome(String str) 
	{
        // Clean string (keep only letters and digits, ignore case)
        String cleaned = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        LinkedListStack<Object> stack = new LinkedListStack<>();

        int len = cleaned.length();
        int mid = len / 2;

        //Push first half onto stack
        for (int i = 0; i < mid; i++) {
            stack.push(cleaned.charAt(i));
        }

        //If odd length, skip middle character
        if (len % 2 != 0) {
            mid++;
        }

        //Compare second half with stack pops
        for (int i = mid; i < len; i++) {
            if (!stack.pop().equals(cleaned.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "Race a car";

        System.out.println("\"" + test1 + "\" is palindrome? " + isPalindrome(test1));
        System.out.println("\"" + test2 + "\" is palindrome? " + isPalindrome(test2));
    }
}
