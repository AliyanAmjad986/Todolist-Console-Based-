public class deleteTask extends Edittask {
void display(){
 System.out.println("Number of Tasks: "+ Todolist.n );
 System.out.println("Here is your Task: ");
 for(int i = 0; i < Todolist.n; i++){
System.out.println("Task Number "+i +"# "+task[i]);
 }                                                                                                   
}
void delete(){
  int indexNumber ;
  String new_Words;
 System.out.println("Which Task Number you want to Delete");
 indexNumber = sc.nextInt();
 sc.nextLine();

 
 if(indexNumber > Todolist.n || indexNumber < 0){
System.out.println("Invalid Task Number");                                                                                               
}
 System.out.println("Task Has Been Deleted: ");
 //for going to the index number       
    for(int i = indexNumber; i < Todolist.n -1; i++){
task[i] = task[i + 1];                                                                       
     }
     //index is remove
     task[Todolist.n -1] = null;
     Todolist.n--;
     display();


       }

}
                                                                                                    

