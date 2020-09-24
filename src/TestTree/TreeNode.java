package TestTree;

public class TreeNode<E> {
    protected E elementl;
    protected TreeNode left;
    protected TreeNode right;

    public TreeNode(E elementl) {
        this.elementl = elementl;
    }

    //    tìm kiếm trên TRee:
//    public boolean search(E element) {
//        TreeNode<E> current = ;
//
//        while (current != null) {
//            if (element < current.element) {
//                current = current.left;
//            } else if (element > current.element) {
//                current = current.right;
//            } else
//                return true;
//        }
//        return false;
//    }

    public static void main(String[] args) {
        TreeNode<Integer> treeNode = new TreeNode<>(60);
        treeNode.left = new TreeNode<>(55);
        treeNode.right = new TreeNode<>(100);


    }


}
