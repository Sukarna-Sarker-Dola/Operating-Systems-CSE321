import java.util.Scanner;
public class priorityscheduling {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of process");
    int process=sc.nextInt();
    int procss[]=new int[process];
    int pid[]=new int[process];
    int burst_time[]=new int [process];
    int priority[]=new int[process];
    int completion_time[]=new int [process];
    int turnaround_time[]=new int [process];
    int waiting_time[]=new int [process];
    int i;
    int n;
    float avgwt=0;
    float avgta=0;
    for( i=0;i<process;i++)
   {
   pid[i] = i+1;
   System.out.println ("Enter process " + (i+1) + " burst time:");
   burst_time[i] = sc.nextInt();
   System.out.println ("Enter process " + (i+1) + "  priority:");
   priority[i] = sc.nextInt();
    }
    for(i=0;i<process-1;i++)
    {
      for(int j=i+1;j<process;j++)
      {
        if(priority[i]>priority[j])
       {
     n=priority[i];
     priority[i]=priority[j];
     priority[j]=n;
     n=burst_time[i];
     burst_time[i]=burst_time[j];
     burst_time[j]=n;
     n=procss[i];
     procss[i]=procss[j];
     procss[j]=n;
      }
   }
}
waiting_time[0]=0;
avgwt=0;
turnaround_time[0]=burst_time[0];
avgta=turnaround_time[0];
for(i=1;i<process;i++)
 {
   waiting_time[i]=turnaround_time[i-1];
   avgwt+=waiting_time[i];
   turnaround_time[i]=waiting_time[i]+burst_time[i];
   completion_time[i]= turnaround_time[i];
   avgta+=turnaround_time[i];
 }
 for(i=0;i<process;i++)
  {  
   System.out.println("Process id: "+pid[i]);
   System.out.println("Completion time: "+completion_time[i]);
   System.out.println("Turnaround time: "+turnaround_time[i]);
   System.out.println("Waiting time: "+waiting_time[i]);
   System.out.println("    ");
   
  }
    System.out.println ("\nAverage Turnaround Time: "+ (float)(avgta/process));
    System.out.println ("Average Waiting Time: "+ (float)(avgwt/process));
    sc.close();    
  }
}
    