package algorithm.tree;
/*二叉查找树(Binary Search Tree)，又被称为二叉搜索树。
        它是特殊的二叉树：对于二叉树，假设x为二叉树中的任意一个结点，
        x节点包含关键字key，节点x的key值记为key[x]。如果y是x的左子树中的一个结点，
        则key[y] <= key[x]；如果y是x的右子树的一个结点，则key[y] >= key[x]。

    http://www.cnblogs.com/skywang12345/p/3576452.html
        */
public class BSTree<T extends Comparable<T>> {

    private BSTNode<T> mRoot;    // 根结点

    public class BSTNode<T extends Comparable<T>> {
        T key;                // 关键字(键值)
        BSTNode<T> left;      // 左孩子
        BSTNode<T> right;     // 右孩子
        BSTNode<T> parent;    // 父结点

        public BSTNode(T key, BSTNode<T> parent, BSTNode<T> left, BSTNode<T> right) {
            this.key = key;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
    }

}