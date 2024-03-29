/*Left View of Binary Tree
EasyAccuracy: 33.74%Submissions: 457K+Points: 2
Share your experience with the world! Submit your admission, interview, campus or any other experience and reach an audience of millions today!

banner
Given a Binary Tree, return Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument. If no left view is possible, return an empty tree.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8   

Example 1:

Input:
   1
 /  \
3    2
Output: 1 3

Example 2:

Input:

Output: 10 20 40
Your Task:
You just have to complete the function leftView() that returns an array containing the nodes that are in the left view. The newline is automatically appended by the driver code.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
0 <= Number of nodes <= 100
0 <= Data of a node <= 1000 */



//{ Driver Code Starts
    import java.util.LinkedList; 
    import java.util.Queue; 
    import java.io.*;
    import java.util.*;
    
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    
    class GfG {
        
        static Node buildTree(String str){
            
            if(str.length()==0 || str.charAt(0)=='N'){
                return null;
            }
            
            String ip[] = str.split(" ");
            // Create the root of the tree
            Node root = new Node(Integer.parseInt(ip[0]));
            // Push the root to the queue
            
            Queue<Node> queue = new LinkedList<>(); 
            
            queue.add(root);
            // Starting from the second element
            
            int i = 1;
            while(queue.size()>0 && i < ip.length) {
                
                // Get and remove the front of the queue
                Node currNode = queue.peek();
                queue.remove();
                    
                // Get the current node's value from the string
                String currVal = ip[i];
                    
                // If the left child is not null
                if(!currVal.equals("N")) {
                        
                    // Create the left child for the current node
                    currNode.left = new Node(Integer.parseInt(currVal));
                    // Push it to the queue
                    queue.add(currNode.left);
                }
                    
                // For the right child
                i++;
                if(i >= ip.length)
                    break;
                    
                currVal = ip[i];
                    
                // If the right child is not null
                if(!currVal.equals("N")) {
                        
                    // Create the right child for the current node
                    currNode.right = new Node(Integer.parseInt(currVal));
                        
                    // Push it to the queue
                    queue.add(currNode.right);
                }
                i++;
            }
            
            return root;
        }
        static void printInorder(Node root)
        {
            if(root == null)
                return;
                
            printInorder(root.left);
            System.out.print(root.data+" ");
            
            printInorder(root.right);
        }
        
        public static void main (String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
                int t=Integer.parseInt(br.readLine());
        
                while(t > 0){
                    String s = br.readLine();
                    Node root = buildTree(s);
                    Tree g = new Tree();
                    ArrayList<Integer> result = g.leftView(root);
                    for(int value : result){
                        System.out.print(value + " ");
                    }
                    System.out.println();
                    t--;
            }
        }
    }
    
    // } Driver Code Ends
    
    
    //User function Template for Java
    
    /* A Binary Tree node
    class Node
    {
        int data;
        Node left, right;
    
        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }*/
    class Tree
    {
        
        static class pair{
            int hd;
            Node node;
            
            pair(int hd, Node node){
                this.hd=hd;
                this.node=node;
            }
            
        }
        //Function to return list containing elements of left view of binary tree.
        ArrayList<Integer> leftView(Node root)
        {
            Queue<pair> q =new LinkedList<>();
             ArrayList<Integer>an=new ArrayList<>();
    
            Map<Integer,Integer>hm=new TreeMap<>();
            
            if(root == null){
                return an;
            }
            q.add(new pair(0,root));
            
            
            while(!q.isEmpty()){
                pair curr = q.poll();
                
                
                if(!hm.containsKey(curr.hd)){
                    hm.put(curr.hd,curr.node.data);
                }
                
                if(curr.node.left!=null){
                    q.add(new pair(curr.hd+1,curr.node.left));
                }
                
                 if(curr.node.right!=null){
                    q.add(new pair(curr.hd+1,curr.node.right));
                }
                
                
                
            }
            
           
            
            for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
                an.add(entry.getValue());
            }
            
            return an;
          // Your code here
        }
    }