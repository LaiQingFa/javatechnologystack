package algorithm.tree;

public class RBTree<T extends Comparable<T>> {


    /*
    红黑树(Red-Black Tree，简称R-B Tree)，它一种特殊的二叉查找树。
    红黑树是特殊的二叉查找树，意味着它满足二叉查找树的特征：任意一个节点所包含的键值，大于等于左孩子的键值，小于等于右孩子的键值。
    除了具备该特性之外，红黑树还包括许多额外的信息。

    红黑树的每个节点上都有存储位表示节点的颜色，颜色是红(Red)或黑(Black)。
    红黑树的特性:
    (1) 每个节点或者是黑色，或者是红色。
    (2) 根节点是黑色。
    (3) 每个叶子节点是黑色。 [注意：这里叶子节点，是指为空的叶子节点！]
    (4) 如果一个节点是红色的，则它的子节点必须是黑色的。
    (5) 从一个节点到该节点的子孙节点的所有路径上包含相同数目的黑节点。

      http://www.cnblogs.com/skywang12345/p/3624343.html

    */
    private RBTNode<T> mRoot;    // 根结点

    private static final boolean RED   = false;
    private static final boolean BLACK = true;

    public class RBTNode<T extends Comparable<T>> {
        boolean color;        // 颜色
        T key;                // 关键字(键值)
        RBTNode<T> left;    // 左孩子
        RBTNode<T> right;    // 右孩子
        RBTNode<T> parent;    // 父结点

        public RBTNode(T key, boolean color, RBTNode<T> parent, RBTNode<T> left, RBTNode<T> right) {
            this.key = key;
            this.color = color;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

    }


}