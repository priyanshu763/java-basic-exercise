package Binary_Trees.BFS;



import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BFS_Algorithm {   // Breadth First Search
    public static void main(String[] args) {

    }
    public BFS_Algorithm() {


    }

    private static class Node {
        int value;
        TreeNode left;
        TreeNode right;

        public Node(int value) {
            this.value = value;
        }
    }


//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//
//        if (root == null) {
//            return result;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            int levelSize = queue.size();
//            List<Integer> currentLevel = new ArrayList<>(levelSize);
//
//            for (int i = 0; i < levelSize; i++) {
//                TreeNode currentNode = queue.poll();
//                currentLevel.add(currentNode.val);
//                if (currentNode.left != null) {
//                    queue.offer(currentNode.left);
//                }
//                if (currentNode.right != null) {
//                    queue.offer(currentNode.right);
//                }
//
//            }
//            result.add(currentLevel);
//
//        }
//        return result;
//
//
//
//
//    }

}

