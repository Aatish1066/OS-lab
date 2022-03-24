class PNPT{
    public static void main(String[] args) {
        int[] pid =new int[4];//declaration and allotment of process id's
        pid[0]=0;
        pid[1]=1;
        pid[2]=2;
        pid[3]=3;
        int[] bt =new int[4];//declaration and allotment of burst time array 
        bt[0]=5;
        bt[1]=3;
        bt[2]=2;
        bt[3]=2;

        int[] pt =new int[4];//declaration and allotment of burst time array 
        pt[0]=4;
        pt[1]=3;
        pt[2]=2;
        pt[3]=1;
      
      
      priority_swap(pt,pid,2);

        int at=0;//declaration of arrival time
        //Can be changed with a array logic is made
        int[] comp =new int[5];//completion time declaration
        int[] tat =new int[5]; //TAT declaration array
        //Need of a sorting algorithm on the the arrival
        // time if hte array of arrival time is required 
        
        for(int i=0;i<4;i++){
            comp[i+1]=comp[i]+bt[i];//makinng array of individual completion time 
            //this starts fom 1 just for coding simplicity
        }
        
     
    
    for (int i = 0; i < 4; i++) {
        tat[i]=comp[i+1]-at; //TAT calculation as the formula suggest

    }
    int[] wt =new int[5];
    for (int i = 0; i < 4; i++) {
        wt[i]=tat[i]-bt[i]; //Wait time of the respective process

    }

    for(int i=0;i<4;i++){
        System.out.println("the turn around time is :"+tat[i]);
        //printing individual TAT time of the process

    }
    for(int i=0;i<4;i++){
        System.out.println("the wating time is :"+wt[i]);
        //printing individual wait time

    }
  float  sum_wait_time=0;
  float  sum_TA_time=0;
    for (int i = 0; i < 4; i++) { //adding the TAT and wait
        sum_wait_time=sum_wait_time+wt[i];
        sum_TA_time=sum_TA_time+tat[i];
    }
  System.out.println("the average TAT is :"+sum_TA_time/4);
    //avg TAT time
  System.out.println("the average Wait Time is :"+sum_wait_time/4);
  //avg wait time
}

    private static void priority_swap(int[] pt, int[] pid, int n) {
        for( int i=0;i<=n;i++){
            if(pt[i]>pt[i+1]){
                int tempbt,tempid;
                tempbt=pt[i+1];
                tempid=pid[i+1];
                pt[i+1]=pt[i];
                pid[i+1]=pid[i];
                pid[i]=tempid;
                pt[i]=tempbt;
                
            }

      }
    }
}