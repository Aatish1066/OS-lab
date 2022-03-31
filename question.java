public class question {
   /*the question no 5.5 of page 319 of os book by peter galvin*/
   public static void main(String[] args) {
       int i;
       int time;
       int sum_wt=0;
       int sum_tat=0;
       int smallest;

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

       int[] pt =new int[4];//declaration of priority
       pt[0]=1;
       pt[1]=4;
       pt[2]=2;
       pt[3]=3;
       
       int[] at =new int[4];//declaration of arrival time
        at[0]=0;
        at[1]=3;
        at[2]=2;
        at[3]=1;

       int rt[] =new int[15];
       int n=4;
       int remain=n;
       for(i=0;i<n;i++){
         rt[i]=bt[i];
       }
   
     
   //times
   for(time=0;remain!=0;time++){
   smallest=0;
   for ( i = 0; i < n; i++) {
     if(at[i]<=time && pt[i]<pt[smallest] && rt[i]>0){
       smallest=i;
     }
     
     rt[smallest]--;
     if(rt[smallest]==0){
      //  System.out.print("fhw9 vhu8dytb");
       remain--;
       System.out.println((smallest+1)+" "+((time+1)-at[smallest])+" "+((time+1)-at[smallest]-bt[smallest]));
       sum_wt+=time+1-at[smallest];
       sum_tat=time+1-at[smallest]-bt[smallest];
     }
   }
    System.out.print(sum_wt/n);
    System.out.print(sum_tat/n);
    }

}}
