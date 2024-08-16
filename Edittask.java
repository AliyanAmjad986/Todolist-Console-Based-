import java.util.Scanner;

public class Edittask extends addtask {
Scanner sc = new Scanner(System.in);
void display(){
    System.out.println("Number of Tasks: "+Todolist.n);
    System.out.println("Here is your Tasks:");
    for (int i = 0; i < Todolist.n; i++){
        System.out.println("Task Number "+i +"# "+Todolist.task[i]);
    }
}

public int n = Todolist.n;
public String[] task = Todolist.task;
//edit taskk 
//TODO:
void edit(){
int indexNumber ;
String new_Words;
System.out.println("Which Task Number you want to Edit");
indexNumber = sc.nextInt();
sc.nextLine();
System.out.println("Enter a new Edit Task: ");

for(int i = indexNumber; i < Todolist.n; i++){
    Todolist.task[i] = sc.nextLine();      
//System.out.println(Todolist.task[i]);
}
    }

void poordisplay(){
    System.out.println("Number of Tasks: "+Todolist.n);
    System.out.println("Here is your New Tasks:");
    for (int i = 0; i < Todolist.n; i++){
        System.out.println("Task Number "+i +"# "+Todolist.task[i]);
    }
}



}  










