    
import java.util.Scanner;
public class Todolist {

  public static int n = 0 ;
public static String[] task = new String [0];

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
      if(menu == 1){
        addtask addtask = new addtask(); 
        addtask.firstdisplay();
        //  Edittask edittask = new Edittask();
        addtask.numberofTask();
       addtask.additiontask();
        addtask.display();
        addtask.copyElement();
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
      else if(menu == 5){
        compeletetask compeletetask = new compeletetask();
        compeletetask.display();

      }
    }
      }}
