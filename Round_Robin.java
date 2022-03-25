class RoundRobin{
    public static void main(String[] args) {//main function 
        int[] pid =new int[4];//declaration and allotment of process id's
        pid[0]=0;
        pid[1]=1;
        pid[2]=2;
        pid[3]=3;
        int[] bt =new int[4];//declaration and allotment of burst time array 
        bt[0]=2;
        bt[1]=2;
        bt[2]=3;
        bt[3]=5;
        int[] at =new int[4];//declaration and allotment of arrival  time array 
        at[0]=0;
        at[1]=1;
        at[2]=3;
        at[3]=7;
        
        ts=2;

        private static void arrival_time_swap(int[] at, int[] pid, int n) {
            for( int i=0;i<=n;i++){
                if(at[i]>at[i+1]){
                    int tempbt,tempid;
                    tempat=at[i+1];
                    tempid=pid[i+1];
                    at[i+1]=at[i];
                    pid[i+1]=pid[i];
                    pid[i]=tempid;
                    at[i]=tempat;
                    
                }
    
          }
        }

        int[] ct =new int[4];//declaration complition time
        ct[0]=0;
        ct[1]=0;
        ct[2]=0;
        ct[3]=0;

        int[] et =new int[4];//declaration execution time time
        et[0]=0;
        et[1]=0;
        et[2]=0;
        et[3]=0;  

        int counter=0;
for(int i=0;i<4:i++){
    if(at[i]<=counter ){
       if(bt[i]>ts){

           et[i]=bt[i]-ts;
           
           counter=counter+2;

           
        }
        else{
            et[i] =bt[i];
            ct[i]=;
            counter=counter+counter+bt[i];
            ct[i]=counter-at[i];
            
        }}
       else{
           if(et[i-1]!=0 && at[i]!=0){
            if(bt[i-1]>ts){

                et[i-1]=bt[i-1]-ts;
                
                counter=counter+2;
     
                
             }
             else{
                 et[i-1] =bt[i-1];
                 ct[i-1]=;
                 counter=counter+bt[i-1];
                 ct[i-1]=counter-at[i-1];
                 
             }   
           }
       }
       
        
    }
    
    int[] tat =new int[5];
    for (int i = 0; i < 4; i++) {
        tat[i]=ct[i]-at[i]; //TAT calculation as the formula suggest

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

}     
}
