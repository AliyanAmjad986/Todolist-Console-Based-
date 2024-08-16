import java.util.Scanner;

public class compeletetask extends deleteTask {
Scanner sc = new Scanner(System.in);                                                                                                    
void display(){
 System.out.println("Number of Tasks: "+ Todolist.n );
 System.out.println("Here is your Task: ");
 for(int i = 0; i < Todolist.n; i++){
System.out.println("Task Number "+i +"# "+task[i]);
 }                                                                                                   
}                                                                                          
void done(){
System.out.println("Which number of task is Done");
int n = sc.nextInt();
sc.nextLine();                                                                                                   
}                                                                                 
}
