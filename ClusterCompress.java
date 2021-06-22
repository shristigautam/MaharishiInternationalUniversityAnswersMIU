/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIU;

/**
 *
 * @author Shristi
 */
public class ClusterCompress {
    	public static void main(String[] args) {
	    int [] a = {1,-1,1,1};
	    int [] result = clusterCompression(a);
	    for(int k=0; k< result.length; k++){
	      	System.out.println(result[k]);  
	    }
	
	}
	
	static int[ ] clusterCompression(int[ ] a) {
	    if (a.length ==0 || a.length ==1){
	        return a;
	    }
	    
	    else{
	    int temp = a[0];
	    int numClusters =1;
	    for (int i =0;  i<a.length; i++){
	        if (temp!=a[i]){
	            numClusters++;
	            temp = a[i];
	        }
	    }
    	int[ ] result = new int[numClusters];
    	temp = a[0];
    	result[0]=a[0];
    	int j =1;
        for (int i =0;  i<a.length; i++){
	        if (temp!=a[i]){
	            result[j++]= a[i];
	            temp=a[i];
//	            j++; mathi result ma j++ garesi yaha j++ garda double hunxa
	        }
	    }
        return result;
    }
	}
}
