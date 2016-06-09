package MagicSquare;

import java.util.Scanner;
public class MagicSquare {
	public static void moving(int n){
	int [][]arr = new int[n][n];
	int x = n/2;//x축  
	int y = 0;//y축  
	int count =1;//count
	arr[x][y] = count++;
	
	if(n%2==1)
		while(true){
			if(y-1 < 0 && x+1>=n && arr[n-1][0]==0){
				arr[n-1][0]=count++;
				x=n-1; y=0;// 현재 위치를 바꿈.
			}	
			else if(x+1>=n && y-1<0 && arr[n-1][0]!=0){
				arr[x][y+1]=count++;
				y = y+1;// 현재 위치 바꿈. 
			}
			else if(x+1 >= n && arr[0][y-1]==0){
				arr[0][y-1]=count++;
				x=0; y=y-1;// 현재 위치 바꿈. 
			}
			else if(x+1>=n && arr[0][y-1]!=0){
				arr[x][y+1]=count++;
				y=y+1;
			}
			else if(y-1<0 && arr[x+1][n-1]==0){
				arr[x+1][n-1]=count++;
				x=x+1; y=n-1;
			}
			else if(y-1<0 && arr[x+1][n-1]!=0){
				arr[x][y+1]=count++;
				y=y+1;
			}
			else if(arr[x+1][y-1]==0)
				arr[++x][--y]=count++;
			else if(arr[x+1][y-1]!=0){
				arr[x][y+1]=count++;
				y=y+1;
			}
			if(count == n*n+1)
				break;
		}	
		else if(n%2==0)
			System.out.println("error");
	
	for(int i=0; i<n; i++){
		for(int j=0; j<n; j++)
			System.out.print(arr[j][i] + " ");
		System.out.println("");
	}
	System.out.println("");
	}
	public static void main(String[] args) {
		System.out.print("input the count : ");
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		moving(n);
	}
}