import java.util.Scanner;
public class SJF {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of process");
    int process=sc.nextInt();
    int pid[]=new int[process];
    int arrival_time[]=new int [process];
    int burst_time[]=new int [process];
    int b[]=new int[process];
    int complete_time[]=new int [process];
    int turnaround_time[]=new int [process];
    int waiting_time[]=new int [process];
    int f[]=new int[process];  
    int i;
    int st=0;
    int tot=0;
    float avgwt=0;
    float avgta=0;
    for( i=0;i<process;i++)
    {
      pid[i] = i+1;
      System.out.println ("enter process " + (i+1) + " arrival time:");
   arrival_time[i] = sc.nextInt();
   System.out.println ("enter process " + (i+1) + " burst time:");
   burst_time[i] = sc.nextInt();
    b[i]= burst_time[i];
   f[i] = 0;
    }
    boolean a=true;
    while(true)
    {
      int c=process;
      int min=999;
      if(tot==process) {
        break;
      } 
      for( i=0;i<process;i++) 
      {
         if ((arrival_time[i] <= st) && (f[i] == 0) && (burst_time[i]<min))
    {
     min=burst_time[i];
     c=i;
    }
   }
      if(c==process) 
      {
        st++;
      }
      else 
      {
        burst_time[c]--;
        st++;
        if(burst_time[c]==0) 
        {
        complete_time[c]=st;
        f[c]=1;
        tot++;
      }
    }
    }
    for(i=0;i<process;i++)
  {
      turnaround_time[i]=complete_time[i]-arrival_time[i];
      waiting_time[i]=turnaround_time[i]-b[i];
      avgwt+=waiting_time[i];
      avgta+= turnaround_time[i];
    }
    for(i=0;i<process;i++)
  {  
   System.out.println("Process id: "+pid[i]);
   System.out.println("Completion time: "+complete_time[i]);
   System.out.println("Turnaround time: "+turnaround_time[i]);
   System.out.println("Waiting time: "+waiting_time[i]);
   System.out.println("    ");
   
  }
    System.out.println ("\nAverage Turnaround Time: "+ (float)(avgta/process));
    System.out.println ("Average Waiting Time: "+ (float)(avgwt/process));
    sc.close();
  }
}

    
    
    
    
    
    
    
    