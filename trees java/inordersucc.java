import org.w3c.dom.Node;

class node {
    int data;
    node left, right, parent;

    node(int key) {
        data = key;
        left = right = parent = null;
    }
}

public class inordersucc {
    node root;

    inordersucc() {
        root = null;
    }

    node minval(node root) {
        node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    void inorder(node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    node insert(node root, int key) {
        if (root == null) {
            return new node(key);
        }

        node temp = null;
        if (key < root.data) {
            temp = insert(root.left, key);
            root.left = temp;
            temp.parent = root;
        } else if (key > root.data) {
            temp = insert(root.right, key);
            root.right = temp;
            temp.parent = root;
        }
        return root;
    }

    node insucc(node root, node n) {
        if (n.right != null)
            return minval(n.right);
        node p = n.parent;

        while (p != null && n == p.right) {
            n = p;
            p = p.parent;
        }
        return p;
    }

    public static void main(String[] args) {
        inordersucc tree = new inordersucc();
        node temp = null, suc = null, min = null;
        tree.root = tree.insert(tree.root, 20);
        tree.insert(tree.root, 8);
        tree.insert(tree.root, 22);
        tree.insert(tree.root, 4);
        tree.insert(tree.root, 12);
        tree.insert(tree.root, 10);
        tree.insert(tree.root, 14);
        temp = tree.root.left.right.right;
        suc = tree.insucc(tree.root, temp);
        tree.inorder(tree.root);
        if (suc != null) {
            System.out.println(
                    "Inorder successor of "
                            + temp.data + " is " + suc.data);
        } else {
            System.out.println(
                    "Inorder successor does not exist");
        }
    }
}
