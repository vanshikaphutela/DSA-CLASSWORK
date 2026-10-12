
import java.util.*;

class Main {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Construct tree from array using level order
    static Node buildTree(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;

        while (i < arr.length) {
            Node curr = q.poll();

            // Left child
            if (i < arr.length) {
                curr.left = new Node(arr[i++]);
                q.add(curr.left);
            }

            // Right child
            if (i < arr.length) {
                curr.right = new Node(arr[i++]);
                q.add(curr.right);
            }
        }

        return root;
    }

    // Inorder: Left, Root, Right
    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder: Root, Left, Right
    static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder: Left, Right, Root
    static void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Level order: Level by level
    static void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node root = buildTree(arr);

        System.out.print("Inorder: ");
        inorder(root);

        System.out.print("\nPreorder: ");
        preorder(root);

        System.out.print("\nPostorder: ");
        postorder(root);

        System.out.print("\nLevel order: ");
        levelOrder(root);

        sc.close();
    }
}
