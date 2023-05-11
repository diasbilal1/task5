public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

        // Testing put method
        bst.put(1, "one");
        bst.put(29, "twenty nine");
        bst.put(3, "three");
        bst.put(45, "forty five");
        bst.put(51, "fifty one");
        bst.put(6, "six");
        bst.put(78, "seventy eight");
        bst.put(84, "eighty four");
        bst.put(20, "twenty");
        bst.put(10, "ten");
        bst.put(20, "shantaram");

        System.out.println("Size of BST: " + bst.size());

        System.out.println("Value of key 4: " + bst.get(10));

        bst.delete(10);
        System.out.println("Size of BST after deleting key 10: " + bst.size());

        System.out.println("Keys in BST:");
        for (Integer key : bst) {
            System.out.println(key);
        }

        bst.deleteMin();
        System.out.println("Size of BST after deleting minimum key: " + bst.size()); // Output: Size of BST after deleting minimum key: 8

        System.out.println("Keys in BST after deleting minimum key:");
        for (Integer key : bst) {
            System.out.println(key);
        }
    }
}
