import java.util.Scanner;

public class compeletetask extends deleteTask {
Scanner sc = new Scanner(System.in);
public int n =1 ; 
public String[] donetask_list = new String[n];  ; 


//display pervious task in Todolist.task
void display(){
 System.out.println("Number of Tasks: "+ Todolist.n );
 System.out.println("Here is your Task: ");
 for(int i = 0; i < Todolist.task.length; i++){
System.out.println("Task Number "+i +"# "+task[i]);
 }                                                                                                   
}   


public void done(){
//number of done task and done task list variable declration                                                                                                    
int donetask_number;  
 String[] donetasklist = new String [n];
 
 //input from user tha how many tasks are done
// System.out.println("How many task do you commpleted: ");
// n= sc.nextInt();
// System.out.println(n);  


//outer variable



//getting input from user that which number of task is done     
                                                                                            
System.out.println("Which number of task is Done");
 donetask_number = sc.nextInt();
sc.nextLine();

//size for the arrays
//iner vaiable

//put done task number from todolist and put in donetasklist

for(int i = donetask_number; i <= donetask_number; i++){
for(int j = 0; j < Todolist.task.length -1 ; j++ ){
donetasklist[j] = Todolist.task[i];  

   if(donetask_number < Todolist.task.length - 1){
    Todolist.task[j] = Todolist.task[j+1];
   }
Todolist.task[i] = null;
 Todolist.n--;

                                                                                               



} }
//TODO: the uper n value is 1 now i start from increase n value

for(int i = 0 ;i < Todolist.n; i++){
System.out.println(Todolist.task[i]);                                                                                                    
}








System.out.println("Here is your done task");  
for(int i = 0 ; i < n; i++){                                                                                               
 System.out.println(donetasklist[i]);
}
 
                                                                                                   
}                                                                                 
}
