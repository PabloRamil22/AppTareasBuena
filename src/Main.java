import controller.TaskController;
import models.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskController taskController=new TaskController();
        taskController.login("pepe", "1234");
        System.out.println(taskController.getAllTaskByUser());

    }
}