
public class BinaryTreeArray {
  String[] arr;
  int lastUsedIndex;

  public BinaryTreeArray(int size) {
    arr = new String[size+1];
    this.lastUsedIndex=0;
    System.out.println("A Tree was defined of size " +size);
  }

  // is the tree full?
  public boolean isFull() {
    if (arr.length-1 == lastUsedIndex) {
      return true;
    } else {
      return false;
    }
  }

  // insert method
  public void insert( String value) {
    if (!isFull()) {
      arr[lastUsedIndex+1] =value;
      lastUsedIndex++;
      System.out.println("Inserted value of "+value);
    } else {
      System.out.println("The BinaryTree is full");
    }
  }

  // PreOrder Traversal
  public void preOrder(int index) {
    if (index > lastUsedIndex) {
      return;
    }
    System.out.print(arr[index]+ " ");
    preOrder(index * 2);
    preOrder(index * 2 + 1);
  }

  //InOrder Traversal
  public void inOrder(int index) {
     if (index > lastUsedIndex) {
      return;
    }
    inOrder(index * 2);
    System.out.print(arr[index] + " ");
    inOrder(index * 2 + 1);

  }

  // Post Order Traversal
  public void postOrder(int index) {
    if (index > lastUsedIndex) {
      return;
    }
    postOrder(2 * index);
    postOrder(2 * index + 1);
    System.out.print(arr[index] + " ");
  }

  // Level Order Traversal
  public void levelOrder() {
    for (int i = 1; i<=lastUsedIndex; i++) {
      System.out.print(arr[i]+ " ");
    }
  }

  // Search 
  public int search(String value) {
    for (int i = 1; i<=lastUsedIndex; i++) {
      if (arr[i] == value) {
        System.out.println(value+" exists at the location: " + i);
        return i;
      }
    }
    System.out.println("The value does not exist in this BinaryTree");
    return -1;
  }

  // Delete 
  public void delete(String value) {
    int location = search(value);
    if (location == -1) {
      return;
    } else {
      arr[location] = arr[lastUsedIndex];
      lastUsedIndex--;
      System.out.println("The node was deleted successfully");
    }
  }

  // Delete BT
  public void deleteBT() {
    try {
      arr = null;
      System.out.println("The BinaryTree was deleted successfully");

    } catch (Exception e){
      System.out.println("There was an error deleting the tree");
    }
  }

}
