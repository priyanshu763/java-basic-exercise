package Binary_Trees;

public class binarytreesNotes {
    public static void main(String[] args) {


        // types of binary trees

        // 1. complete binary tree :
        // * all levels must be full
        // * last level may or may not be and filling is from  left to right

        // 2. full binary tree or strict binary tree
        // * each and everyone will have either 0 or 2 children

        // 3. Proper binary trees
        // * all levels are full  [height = max. number of edges from the node and the leaf node]
        // [leaf node = bottom most nodes]

        // 4. height balance binary tree
        // * avg. height = O(log(N))

        // 5. skewed binary tree
        // * each and everyone will have one child

        // 6. ordered binary tree
        // * every node has some property eg. - Binary Search Tree(BST) [left node is smaller and right node is larger]

        //Proterties

        // 1. for a perfect binary tree if its height is 'h' : total number of nodes = [math.pow(2,h+1) - 1]

        // 2. leaf nodes in perfect binary tree = math.pow(2, h)
        // * total number of internal nodes = [math.pow(2, h) - 1]

        // 3. if N = number of leaves => log(N + 1) levels atleast it have

        // 4. in a Strict binary tree if N -> leaf nodes and (N-1) -> internal nodes
        // * number of leaf nodes = number of internal nodes + 1

        // 5. number of leaf nodes = 1 + (number of internal nodes with 2 children , not including root(top) node



        // TRAVERSAL METHODS

        // 1. Pre-order traversal : N--->L--->R
        // * used for evaluating the Math expressions and in making a copy of binary tree

        // 2. inorder traversal :  L--->N--->R
        // * In BST , this method helps to print the nodes in a sorted manner

        // 3. post-order traversal : L--->R--->N
        // * used to delete the binary tree and also used in bottom - up calculation


        // BALANCE TREE
        // for every node in the tree , the difference in height of left and right subtree of that node
        // must be less than or equal to 1 (<=1)

        // solution of a unbalanced binary tree => self - balancing binary tree (eg. - AVL tree [Adelson Velskii and Landis)



    }
}
