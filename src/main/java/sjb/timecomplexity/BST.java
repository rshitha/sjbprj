package sjb.timecomplexity;

public class BST 
{

	TreeNode root;

    void insert(int value) {
        root = insertNode(root, value);
    }

    TreeNode insertNode(TreeNode node, int value) {
        if (node == null) {
            node = new TreeNode(value);
            return node;
        }
        if (value < node.data) {
            node.left = insertNode(node.left, value);
        } else if (value > node.data) {
            node.right = insertNode(node.right, value);
        }
        return node;
    }
    void inorder() {
        inorderNode(root);
    }

	private void inorderNode(TreeNode node) 
	{
		 if (node != null) {
	            inorderNode(node.left);
	            System.out.println(node.data);
	            inorderNode(node.right);
	        }
	
		
	}
	
	public static void main(String[] args)
	{
		 BST tree = new BST();
	        tree.insert(10);
	        tree.insert(45);
	        tree.insert(30);
	        tree.insert(60);
	        tree.inorder();
	       
	
		
	}

		
		
	}



