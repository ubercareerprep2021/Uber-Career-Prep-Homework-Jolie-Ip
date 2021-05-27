class Trees {
  
    public static class Tree {
      public TreeNode root;
      public Tree(TreeNode root) {
        this.root = root;
      }
    }
  
    public static class TreeNode {
      public int data;
      public TreeNode left = null;
      public TreeNode right = null;
      public TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
      }
    }
  
    public static void print(Tree nodeA) {

        System.out.print(nodeA.data);

        if (nodeA.left != null) {
            print(nodeA.left);
        }

        if (nodeA.right != null) {
            print(nodeA.right);
        }
        
    }
  
    public static void main(String[] args) {
      
      TreeNode leftChild = new TreeNode(6, null, null);
      TreeNode rightChild = new TreeNode(3, null, null);
      TreeNode left = new TreeNode(7, null, null);
      TreeNode right = new TreeNode(17, leftChild, rightChild);
      TreeNode root = new TreeNode(1, left, right);
      Tree tree = new Tree(root);
      print(tree); 
  
    }
  }
