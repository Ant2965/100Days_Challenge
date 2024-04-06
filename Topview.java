import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Topview {
    public class node{
        node left;
        node right;
        int data;




        node(int data,node left,node right){
            this.data=data;
            this.right=null;
            this.left=null;


        }

    }
    static class info{
        node node;
        int hd;

        info(node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }

    public static void topview(node root){
        Queue<info>q=new LinkedList<>();

        HashMap<Integer , node>mao =new HashMap<>();

        int min=0,max=0;
        q.add(new info(root,0));
        q.add(null);



        while(!q.isEmpty()){
            Inf curr =q.remove();

            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
        }


    }

    public static void main(string args[]){

        node root =new root(1);
        root.left =new node(2);
        root.right=new node(3);
        root.left.left =new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);



    }
    
}
