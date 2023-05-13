import java.util.Scanner;
public class roundrobin {
  public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of process");
    int process=sc.nextInt();
    int pid[]=new int[process];
    int burst_time[]=new int [process];
    int turnaround_time[]=new int [process];
    int complete_time[]=new int [process];
    int waiting_time[]=new int [process];
    System.out.println("Enter the quantam");
    int quantum=sc.nextInt();
    
    float avgwt=0;
    float avgta=0;
    int total_waiting_time=0;
    int total_turnaround_time=0;
    for(int i=0;i<process;i++)
   {
   pid[i] = i+1;
   System.out.println ("Enter process " + (i+1) + " burst time:");
   burst_time[i] = sc.nextInt();
    }
      int remaining_burst_time[] = new int[process];
        for (int i = 0 ; i < process ; i++)
           remaining_burst_time[i] =  burst_time[i];
       
        int t = 0;
        while(true)
        {
            boolean a = true;
            for (int i = 0 ; i < process; i++)
            {
                if (remaining_burst_time[i] > 0)
                {
                    a = false;        
                    if (remaining_burst_time[i] > quantum)
                    {                        
                        t += quantum;
                       remaining_burst_time[i] -= quantum;
                    }
                    else
                    {
                        t = t +remaining_burst_time[i];
                        waiting_time[i] = t - burst_time[i];
                       remaining_burst_time[i] = 0;
                    }
                }
            }
            if (a == true)
              break;
        }
     for (int i = 0; i < process ; i++)
     {
            turnaround_time[i] = burst_time[i] + waiting_time[i];
             avgwt+=waiting_time[i];
             avgta+= turnaround_time[i];
     }
     for(int i=0;i<process;i++)
     {  
   System.out.println("Process id: "+pid[i]);
   System.out.println("Completion time: "+turnaround_time[i]);
   System.out.println("Turnaround time: "+turnaround_time[i]);
   System.out.println("Waiting time: "+waiting_time[i]);
   System.out.println("    ");   
     }
   System.out.println ("\nAverage Turnaround Time: "+ (float)(avgta/process));
   System.out.println ("Average Waiting Time: "+ (float)(avgwt/process));
   sc.close();
  }
}

  

