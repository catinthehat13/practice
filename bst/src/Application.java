
package trees;

public class Application {

  public static void main(String[] args) {

      BinarySearchTree bst = new BinarySearchTree();

      Scanner in = new Scanner(System.in);
      String s = in.nextLine();
      int numNodes = Integer.parseInt(s);
      s = in.nextLine();
      String[] values = s.split(" ");

      Node root = null;
      for (int i = 0; i < numNodes; i++) {
        int value = Integer.parseInt(values[i]);
        root = bst.insert(value, root);
        bst.printTree(root);
      }
  }
}
