public static void print(TreeNode nodeA) {
  
  System.out.print(nodeA);
    if (nodeA.left!= null) {
      System.out.print(nodeA.left);
      print(nodeA.left);
    }
  
    if (nodeA.right!= null) {
      System.out.print(nodeA.right);
      print(nodeA.right);
    }
}
