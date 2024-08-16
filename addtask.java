
import java.util.Arrays;
import java.util.Scanner;

public class addtask {

    
    public int n ;
    Scanner obj = new Scanner(System.in);
    public void firstdisplay(){
        System.out.println("Here is your Pervious task: ");
        for(int i = 0; i < Todolist.n; i++){
        System.out.println("Task Number "+i +"# "+Todolist.task[i]);
        }
    }   
  //public String[] addtask = new String[n];
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
        System.out.println(Todolist.n);
        } 
       
   //for addtask to string
    public void additiontask(){
         String[] task =  new String [Todolist.n];
      
        System.out.println("Write "+ Todolist.n + " Number of Tasks");
       //TODO:     
       for(int i= Todolist.n - n ; i < Todolist.n;  i++){
             
    System.out.println("Enter " + i +  "# task: " );
    task[i] = obj.nextLine();   
}
    Todolist.task =  task;
 
 
}

    // for display task
    void display(){
    System.out.println("Here is your task: ");
    for(int i = 0; i < Todolist.n; i++){
    System.out.println("Task Number "+i +"# "+Todolist.task[i]);
    }
    }
   
     void  copyElement(){
        String[] copyelement = new String[Todolist.task.length];
        // if(Todolist.task.length > 0){
    //   if(copyelement.length > 0){
        System.arraycopy(Todolist.task, 0, copyelement, 0, Todolist.task.length);
        for(int i = 0; i < Todolist.task.length; i++){
          System.out.println(copyelement[i]);

        //  }
        // System.arraycopy(copyelement, 0, task,0, task.length);
        // for(int i = 0; i < n; i++){
        //   System.out.println(task[i]);
        // }
        
        }
      }
    


}
