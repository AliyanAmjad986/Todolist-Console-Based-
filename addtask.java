
import java.util.Arrays;
import java.util.Scanner;

public class addtask {

  public String[] pasted = new String[Todolist.task.length];
    public int n ;
  
  Scanner obj = new Scanner(System.in);
   void firstsdisplay(){
        System.out.println("Here is your Pervious task: ");
        for(int i = 0; i < Todolist.n; i++){
        System.out.println("Task Number "+i +"# "+Todolist.task[i]);
        }
    }  
    
    
    void  copyElement(){
      if(Todolist.task.length > 0){
 //   if(copyelement.length > 0){
     System.arraycopy(Todolist.task, 0, pasted, 0, Todolist.task.length);
     for(int i = 0; i < Todolist.task.length; i++){;
       }}}

//add input that how many task user add
    void numberofTask(){
        System.out.println(Todolist.n);
        System.out.println("How many Task do you add: ");
        if(Todolist.task.length > 0 ){
        n = obj.nextInt();
        obj.nextLine();
           // Todolist.task = addtask;
        Todolist.n = Todolist.n + n  ;
        } else{
        n = obj.nextInt();
         obj.nextLine();
         Todolist.n = n;
        }
        System.out.println(Todolist.task.length);
        } 
      
       
   //for addtask to string
    public void additiontask(){
         String[] task =  new String [Todolist.n];
         System.out.println("Write "+ Todolist.n + " Number of Tasks");
         if(Todolist.task.length > 0){
        for(int i= Todolist.n - n ; i < Todolist.n;  i++){
             
          System.out.println("Enter " + i +  "# task: " );
          task[i] = obj.nextLine();   
      }
      
    }else {
       //TODO:     
       for(int i= 0 ; i < Todolist.n;  i++){
             
    System.out.println("Enter " + i +  "# task: " );
    task[i] = obj.nextLine();   
}}
    Todolist.task =  task;
    for(int i = 0; i < Todolist.n; i++){
      System.out.println(Todolist.task[i]);
    }
  
 
 
}
void pasteelement(){
  if(pasted.length > 0){
    System.arraycopy(pasted, 0, Todolist.task, 0, Todolist.task.length - n);
    for(int i = 0; i < Todolist.task.length; i++){
      System.out.println(Todolist.task[i]);
      }
  }
 } 

    // for display task
    void display(){
    System.out.println("Here is your task: ");
    for(int i = 0; i < Todolist.n; i++){
    System.out.println("Task Number "+i +"# "+Todolist.task[i]);
    }
    }
   
   
   
}



