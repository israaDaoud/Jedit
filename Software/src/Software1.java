import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;
public class Software1 {
public static long Fibonacci(int n){

	int a=0; 
	int b=1;
	for (int i=0; i<n; i++){
		int temp =a; 
		a=b; 
		b= temp+b;
		
	}
	return a;
}
public static long Recursive(int n)
{
    if (n == 0 || n == 1)
        return n;
    else
        return Recursive(n - 1) + Recursive(n - 2);
}

public static void main(String args[]){
	int start= 1;
	Stopwatch data =Stopwatch.createStarted();
	while(start<=10){
		System.out.println(Recursive(start));
		start++;
		
	}
	data.stop();
	System.out.println(data.elapsed(TimeUnit.MICROSECONDS) + " ms");
}
}
