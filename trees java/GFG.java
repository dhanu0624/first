import java.util.Stack;

import org.w3c.dom.Node;

class node
    {
        int key;
        node left,right;
        node(int item)
        {
          key=item;
          left=null;
          right=null;
        }
    }
     class iterator {
    Stack<node> st=new Stack<node>();

    public iterator (node root)
    {
        pushall(root);
        pushAll(root);
    }
   
    int next()
    {
    node temp=st.pop();
    pushall(temp.right);
    return temp.key;
    }
     private void pushall(node Node)
    {
        while(Node!=null)
        {
            st.push(Node);
            Node=Node.left;
        }
    }

   
    int before()
    {
    node temp=st.pop();
    pushAll(temp.left);
    return temp.key;
    }
     private void pushAll(node Node)
    {
        for(;Node!= null;st.push(Node),Node=Node.right);
    }
}
 class GFG
{
    node root;
    GFG()
    {
        root=null;
    }

   void inorder(node root)
    {
        if (root!=null)
        {
            inorder(root.left);
            System.out.println(root.key);
            inorder(root.right);
        }
    }
    node insertkey(node root,int key)
    {
       if (root==null)
       {
        return new node(key);
       } 
        if(key<root.key)
       {
        root.left=insertkey(root.left,key);
       }
       else if(key>root.key)
       {
        root.right=insertkey(root.right,key);
       }
       return root;
    }
    node deletNode(node root,int key)
    {
        if (root==null)
         return null;
        if(key<root.key)
       {
        root.left=deletNode(root.left,key);
         return root;
       }
       else if(key>root.key)
       {
        root.right=deletNode(root.right,key);
         return root;
       }
       if (root.left==null)
          return root.right;
       else if (root.right==null)
          return root.left;
       else
       {
       node  succpar=root;
       node  succ=root.right;
        while(succ.left!=null)
        {
            succpar=succ;
            succ=succ.left;
        }
        if (succpar!=root)
        {
            succpar.left=succ.right;
        }
        else{
            succpar.right=succ.right;

        }
        root.key=succ.key;
        return root;
       }
      
    }
  public static void main(String[] args) {
        GFG tree= new GFG();
        tree.root=tree.insertkey(tree.root,20);
        tree.insertkey(tree.root,8);
        tree.insertkey(tree.root,22);
        tree.insertkey(tree.root,4);
        tree.insertkey(tree.root,12);
        tree.insertkey(tree.root,10);
        tree.insertkey(tree.root,14);        

    /*
     * root = tree.insert(root, 20);
        root = tree.insert(root, 8);
        root = tree.insert(root, 22);
        root = tree.insert(root, 4);
        root = tree.insert(root, 12);
        root = tree.insert(root, 10);
        root = tree.insert(root, 14);
     */
        //tree.root=tree.deletNode(tree.root,50);
       // tree.inorder(tree.root);
        //tree.insertkey(tree.root, 20);
      iterator l=new iterator(tree.root);
       //iterator b=new iterator(tree.root);
        int p=l.before();
        
        int r=l.before();
        System.out.println(p+"  "+r);

    }
}
   


