package Labs;

import java.util.Iterator;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
	protected TreeNode<E> root;
	protected int size = 0;

	/** Create a default binary tree */
	public BST() {
	}

	/** Create a binary tree from an array of objects */
	public BST(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			insert(objects[i]);
	}

	@Override /** Returns true if the element is in the tree */
	public boolean search(E e) {
		TreeNode<E> current = root; // Start from the root
		while (current != null) {
			if (e.compareTo(current.element) < 0) {
				current = current.left;
			} else if (e.compareTo(current.element) > 0) {
				current = current.right;
			} else // element matches current.element
				return true; // Element is found
		}
		return false;
	}

	@Override /**
				 * Insert element o into the binary tree Return true if the element is inserted
				 * successfully
				 */
	public boolean insert(E e) {
		if (root == null)
			root = createNewNode(e); // Create a new root
		else {
			// Locate the parent node
			TreeNode<E> parent = null;
			TreeNode<E> current = root;
			while (current != null)
				if (e.compareTo(current.element) < 0) {
					parent = current;
					current = current.left;
				} else if (e.compareTo(current.element) > 0) {
					parent = current;
					current = current.right;
				} else
					return false; // Duplicate node not inserted
			// Create the new node and attach it to the parent node
			if (e.compareTo(parent.element) < 0)
				parent.left = createNewNode(e);
			else
				parent.right = createNewNode(e);
		}
		size++;
		return true; // Element inserted successfully
	}

	@Override /** Preorder traversal from the root */
	public void preorder() {
		preorder(root);
	}

	/** Preorder traversal from a subtree */
	protected void preorder(TreeNode<E> root) {
		if (root == null)
			return;
		System.out.print(root.element + " ");
		preorder(root.left);
		preorder(root.right);
	}

	/**
	 * This inner class is static, because it does not access any instance members
	 * defined in its outer class
	 */
	public static class TreeNode<E extends Comparable<E>> {
		protected E element;
		protected TreeNode<E> left;
		protected TreeNode<E> right;

		public TreeNode(E e) {
			element = e;
		}
	}

	protected TreeNode<E> createNewNode(E e) {
		return new TreeNode<>(e);
	}

	@Override /** Inorder traversal from the root */
	public void inorder() {
		inorder(root);
	}

	/** Inorder traversal from a subtree */
	protected void inorder(TreeNode<E> root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.element + " ");
		inorder(root.right);
	}

	@Override /** Postorder traversal from the root */
	public void postorder() {
		postorder(root);
	}

	/** Postorder traversal from a subtree */
	protected void postorder(TreeNode<E> root) {
		if (root == null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.element + " ");
	}

	@Override /** Get the number of nodes in the tree */
	public int getSize() {
		return size;
	}

	/** Returns the root of the tree */
	public TreeNode<E> getRoot() {
		return root;
	}

	/** Returns a path from the root leading to the specified element */
	public java.util.ArrayList<TreeNode<E>> path(E e) {
		java.util.ArrayList<TreeNode<E>> list = new java.util.ArrayList<>();
		TreeNode<E> current = root; // Start from the root
		while (current != null) {
			list.add(current); // Add the node to the list
			if (e.compareTo(current.element) < 0) {
				current = current.left;
			} else if (e.compareTo(current.element) > 0) {
				current = current.right;
			} else
				break;
		}
		return list; // Return an array list of nodes
	}

	@Override /**
				 * Delete an element from the binary tree. Return true if the element is deleted
				 * successfully Return false if the element is not in the tree
				 */
	public boolean delete(E e) {
		// Locate the node to be deleted and also locate its parent node
		TreeNode<E> parent = null;
		TreeNode<E> current = root;
		while (current != null) {
			if (e.compareTo(current.element) < 0) {
				parent = current;
				current = current.left;
			} else if (e.compareTo(current.element) > 0) {
				parent = current;
				current = current.right;
			} else
				break; // Element is in the tree pointed at by current
		}
		if (current == null)
			return false; // Element is not in the tree
		// Case 1: current has no left child
		if (current.left == null) {
			// Connect the parent with the right child of the current node
			if (parent == null) {
				root = current.right;
			} else {
				if (e.compareTo(parent.element) < 0)

					parent.left = current.right;
				else
					parent.right = current.right;
			}
		} else {
			// Case 2: The current node has a left child
			// Locate the rightmost node in the left subtree of
			// the current node and also its parent
			TreeNode<E> parentOfRightMost = current;
			TreeNode<E> rightMost = current.left;
			while (rightMost.right != null) {
				parentOfRightMost = rightMost;
				rightMost = rightMost.right; // Keep going to the right
			}
			// Replace the element in current by the element in rightMost
			current.element = rightMost.element;
			// Eliminate rightmost node
			if (parentOfRightMost.right == rightMost)
				parentOfRightMost.right = rightMost.left;
			else
				// Special case: parentOfRightMost == current
				parentOfRightMost.left = rightMost.left;
		}
		size--;
		return true; // Element deleted successfully
	}

	/** Obtain an iterator. Use inorder. */
	public java.util.ListIterator<E> bidirectionalIterator() {
		return new BidirectionalIterator();
	}

	// Inner class InorderIterator
	private class BidirectionalIterator implements java.util.ListIterator<E> {
		// Store the elements in a list
		private java.util.ArrayList<E> list = new java.util.ArrayList<>();
		private int current = 0; // Point to the current element in list

		public BidirectionalIterator() {
			inorder(); // Traverse binary tree and store elements in list
		}

		/** Inorder traversal from the root */
		private void inorder() {
			inorder(root);
		}

		/** Inorder traversal from a subtree */
		private void inorder(TreeNode<E> root) {
			if (root == null)
				return;
			inorder(root.left);
			list.add(root.element);
			inorder(root.right);
		}

		@Override /** More elements for traversing? */
		public boolean hasNext() {
			if (current < list.size())
				return true;
			return false;
		}

		@Override /** Get the current element and move to the next */
		public E next() {
			return list.get(current++);
		}

		@Override /** Remove the current element */
		public void remove() {
			delete(list.get(current)); // Delete the current element
			list.clear(); // Clear the list
			inorder(); // Rebuild the list
		}
		
		@Override
		public boolean hasPrevious() {
			if(current >0) return true;
			return false;
		}
		
		@Override
		public E previous() {
			return list.get(current--);
		}
		
		@Override
		public int nextIndex() {
			return (current +1);
		}
		
		@Override
		public int previousIndex() {
			return (current -1);
		}
		
		@Override
		public void set (E e) {
			
		}
		
		@Override
		public void add(E e) {
			insert(e);
			list.clear();
			inorder();
		}
	}

	/** Remove all elements from the tree */
	public void clear() {
		root = null;
		size = 0;
	}
	
	/** Displays the nodes in a breadth-first traversal */

	public void breadthFirstTraversal() {
		java.util.List<TreeNode<E>> list = new jaa.util.ArrayList<TreeNode<E>>();
		TreeNode<E> temp;
		if(root !=null) {
			list.add(root);
		}
		while(!list.isEmpty()) {
			temp = list.remove(0);
			System.out.print(temp.element + " ");
			if(temp.left !=null) {
				list.add(temp.left);
			}
			if(temp.right !=null) {
				list.add(temp.right);
			}
		}
	}

	/** Returns the height of this binary tree */

	public int height() {
		return height(root);
	}
	
	protected int height(TreeNode<E> root) {
		return(root == null)? 0:(1+Math.max(height(root.left), height(root.right)));
	}

	/** Returns the number of leaf nodes */

	public int getNumberOfLeaves() {
		return getNumberOfLeaves(root);
	}
	
	protected int getNumberOfLeaves(TreeNode<E> root) {
		if (root == null) {
			return 0;
		}
		else if ((root.left == null) && (root.right == null)) {
			return 1;
		}
		else return (getNumberOfLeaves(root.left) + getNumberOfLeaves(root.right));
	}

	/** Returns the number of nonleaf nodes */

	public int getNumberofNonLeaves() {
		return size - getNumberOfLeaves();
	}

	//A full binary tree is a binary tree with the leaves on the same level. Add a method in the BST class to return true if the tree is a full binary tree. (Hint: The number of nodes in a full binary tree is 2^depth - 1.)

	/** Returns true if the tree is a full binary tree */

	boolean isFullBST() {
		return (size == (Math.pow(2,height())-1)) ? true : false;
	}

	//Implement the clone and equals methods in the BST class. Two BST trees are equal if they contain the same elements. The clone method returns an identical copy of a BST


	@Override 
	public BST<E> clone()  {
		BST<E> newBST = new BST<>();
		clone(newBST, root);
		return newBST;
	}

	/** Clone helper */
	protected void clone(BST<E> clone, TreeNode<E> root) {
		if (root == null) return;
		newBST.insert(root.element);
		clone(newBST, root.left);
		clone(newBST, root.right);
	}
	
	public boolean equals(BST<E> tree) {
		return(tree.size != size) ? false: equals(root, tree.root);
	}

	
	protected boolean equals(TreeNode<E> root1, TreeNode<E> root2) {
		if (root1 == root2) {
			return true;
		}
		else if (root1 == null || root2 == null) {
			return false;
		}
		
		return(root1.element.equals(root2.element) 
				&& equals(root1.left, root2.left) 
				&& equals(root1.right, root2.right);
			}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}
