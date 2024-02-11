package p1;

import java.util.Comparator;
import java.util.Date;

@SuppressWarnings("rawtypes")
public class Task extends Object implements Comparable {
	public int taskId;
	public String tName,tDesc;
	public String dt;
	public  Task(String tName,String tDesc,String dt,int taskId){
		this.dt=dt;
		this.tName=tName;
		this.tDesc=tDesc;
		this.taskId=taskId;
	}
	  
	   public String toString() 
	   {
		   return taskId+"\t"+tName+"\t"+tDesc+"\t"+dt;
	   }

	@Override
	public int compareTo(Object o)
	   {
		Task c = (Task)o;
		   if(taskId==c.taskId) return 0;
		   else if(taskId>c.taskId) return 1;
		   else return -1;
	   }


	


	


}
