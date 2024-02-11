package p2;

import p1.*;
import java.util.*;

public class TaskManagerMainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try (s) {
			ArrayList<Task> ob = new ArrayList<>();
			while (true) {
				System.out.println("\n*****Choice*****");
				System.out.println("\t1.add(E)" + "\n\t2.Display" + "\n\t3.remove(Object)" + "\n\t4.exit");
				System.out.println("Enter choice");
				switch (Integer.parseInt(s.nextLine())) {
				case 1:
					System.out.println("Enter details to add");

					System.out.println("Enter taskId");
					int id = Integer.parseInt(s.nextLine());
					System.out.println("Enter taskName");
					String name = s.nextLine();

					System.out.println("Enter taskDesc");
					String desc = s.nextLine();

					System.out.println("Enter  taskduedate");
					String dt = s.nextLine();
					boolean x = ob.add(new Task(name, desc, dt, id));
					if (x) {
						System.out.println("Task added successfuully................");
					}
					break;
				case 2:
					if (ob.isEmpty()) {
						System.out.println("There is no task info to display ");
					} else {
						System.out.println("DISPLAYING TASKS");
						ob.forEach(f -> {
							System.out.println(f.toString());
						});
					}
					break;

				case 3:
					if (ob.isEmpty()) {
						System.out.println("There is no element to be removed");
					} else {
						System.out.println("Enter details to remove");
						System.out.println("Enter taskId");
						int id2 = Integer.parseInt(s.nextLine());
						Iterator<Task> it = ob.iterator();
						while (it.hasNext()) {
							Task task = it.next();
							if (task.taskId == id2) {
								it.remove();
								System.out.println("Element removed successfully.........");
							}
						}

					}

					break;
				case 4:
					System.out.println("Operation stopped");
					System.exit(0);
					break;
					default:
						System.out.println("Invalid choice");
				}
			}

		} catch (NumberFormatException e) {
			System.out.println("Enter numbers only");
			;

		} catch (InputMismatchException e) {
			System.out.println("Enter proper data");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
