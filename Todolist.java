    
import java.util.Scanner;
public class Todolist {
//1
  public static int n = 0 ;
 //2 
public static String[] task = new String [n];
//3
// public static String [] pasteelement = new String[task.length];
// void pasteelement(){
//   task = pasteelement;
// }
//4
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
   

      
      boolean isrepeat = true;
      while(isrepeat){
    
    
      System.out.println("------------Menu-------------");
      System.out.println("Press 1 for Addtask");
      System.out.println("Press 2 for Edittask");
      System.out.println("Press 3 for Deletetask");
      System.out.println("press 4 for DoneTask");
      int menu = sc.nextInt();
     //5 
      if(menu == 1){
        addtask addtask = new addtask(); 
        //6
        addtask.firstsdisplay();
        //  Edittask edittask = new Edittask();
        //7 if  length > 0
        addtask.copyElement();
         //8                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        addtask.numberofTask();
        
       
       addtask.additiontask();
       addtask.pasteelement();
        addtask.display();
      
      }else  if (menu == 2){
        //TODO:
        Edittask edittask = new Edittask();
        edittask.display();
        edittask.edit(); 
        edittask.poordisplay(); 
      }
      else if(menu == 3){
      deleteTask deletetask = new deleteTask();
      deletetask.display();
      deletetask.delete();
      }
      else if(menu == 4){
        compeletetask compeletetask = new compeletetask();
        compeletetask.display();

      }
    }
      }}
