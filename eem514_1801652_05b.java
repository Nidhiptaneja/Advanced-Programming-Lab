import java.util.*;

public class eem514_1801652_05b
{
    
  static int threads = 20;

    
    static void multiply(int[][] A, int[][] B, int[][] R) 
    {
    int N = A.length; 
    
    for(int i = 0;i<N;i++)
        for(int j=0;j<N;j++)
        {
            R[i][j] = 0;
            for(int k=0;k<N;k++)
            R[i][j] += A[i][k] * B[k][j];
        }
    }

    public static void fill(int[][] A, int N) 
    {
        Random rand = new Random();
    for(int i = 0;i<N;i++)
        for(int j=0;j<N;j++)
        { A[i][j]=rand.nextInt(101); }
    }

    public static void main(String[] args) 
    {
        int N;
        
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the dimensions of array");
    N=sc.nextInt();
    sc.close();
    
    
    int[][] A = new int[N][N];
    int[][] B = new int[N][N];
    int[][] R = new int[N][N];
    fill(A,N); 
    fill(B,N);

    // testing conventional solution
    long t1 = System.currentTimeMillis(); // record time    
    multiply(A,B,R);
    long t2 = System.currentTimeMillis(); // record time
    System.out.println("time taken for multiplication "+(t2-t1)+"ms");

    
    System.out.flush();
    t1 = System.currentTimeMillis(); // record time for threaded solution
    
    try {
    // create worker threads
    Thread[] Ts = new Thread[threads]; // keep track of threads created.
    int Rs = N/threads; // number of rows to assign to each thread
    for(int w=0;w<threads;w++)
        {
        int Ra = Rs; // rows assigned 
        if (w==threads-1) // last thread may get more rows
            Ra += N%threads;
        threadmultiplication wc = new threadmultiplication(A,B,R,Rs*w,Ra);
        Ts[w] = new Thread(wc);
        Ts[w].start(); // start right away
        }
    for(int w=0;w<threads;w++) 
        Ts[w].join(); // wait for each to finish
    } 
    catch (InterruptedException ie) 
    {
        System.out.println(ie); 
        System.exit(1);
    }
    
    t2 = System.currentTimeMillis(); // record time
    System.out.println("time for multi-threaded solution: "+(t2-t1)+"ms");
    }

}

class threadmultiplication implements Runnable
{
    int[][] A;  
    int[][] B;
    int[][] R;
    int start, N; 
    public threadmultiplication(int[][] a, int[][] b, int[][] c, int s, int n)
    {
        A=a; 
        B=b; 
        R=c; 
        start=s; 
        N=n;}

    public void run()
    {
    int Cols = A[0].length;
    for(int i = start;i<N+start && i<Cols;i++)
        for(int j=0;j<Cols;j++)
        {
            R[i][j] = 0;
            for(int k=0;k<Cols;k++)
            R[i][j] += A[i][k] * B[k][j];
        }   
    }
}