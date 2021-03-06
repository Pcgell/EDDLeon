package edu.ujcv.progra1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class BinTree {

   private BinTreeNode root;


   void add(int dato){

       if(root == null){
           root = new BinTreeNode(dato);
       }
       else{
           root.add(dato);
       }

   }


   void imprimirInOrder(){
       root.imprimirInOrder();
   }



    private class BinTreeNode {
       int dato;
       BinTreeNode HijoIz;
       BinTreeNode HijoDer;

       BinTreeNode(int dato){
           this.dato = dato;
       }

        public void add(int dato) {
           if(HijoIz == null && dato < this.dato){
               HijoIz = new BinTreeNode(dato);
           }
           else if(HijoDer == null && dato >= this.dato){
               HijoDer = new BinTreeNode(dato);
           }
            else if(dato < this.dato){
                HijoIz.add(dato);
            }
            else {
                HijoDer.add(dato);
            }
        }

        public void imprimirInOrder() {

            if(HijoIz != null) HijoIz.imprimirInOrder();
            System.out.println(dato);
            if(HijoDer != null) HijoDer.imprimirInOrder();
        }

        public void imprimirPreOrder() {


        }

        public void imprimirPostOrder() {


        }

        public void imprimirporNivel() {

           // crear cola
            Queue<BinTreeNode> cola = new ArrayDeque<BinTreeNode>();

            // aggregar a la cola la raiz del arbol
            cola.add(root);

            // mientras la cola no este vacia
            while(!cola.isEmpty()) {

                // procesar los nodos.

            }

        }


    }

}
