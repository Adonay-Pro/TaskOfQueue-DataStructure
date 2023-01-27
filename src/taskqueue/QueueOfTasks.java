package taskqueue;
public class QueueOfTasks {
    
   class Node{
       Task task;
       Node next;
   }
 private Node head, tail;

 public QueueOfTasks(){
     head = null;
     tail = null;
 }
 
 public void enqueue(Task t) {
     Node nuevo = new Node();
              nuevo.task = t;
  
    if (head == null){
           tail = nuevo;
           head = nuevo;
    }  else {
        tail = tail.next = nuevo;
    }
 }
 
 public boolean empty() {
 if(head == null){
  return true;   
 }else{
     return false;
 }
  }
 
 public Task dequeue(){
   if(!empty()){
       Task task = head.task;
       
       if(head == tail){
           head = null;
           tail = null;
       }else{
           head = head.next;
       }
       return task;
   }else{
       return null;
   }
 }
 
}
