/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.


*/import java.util.Scanner;

public class MergeSortedArray {
	public void merge(int[] nums1,int[] nums2,int m,int n){
		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		
		while(i>=0 && j>=0){
			if(nums1[i]>nums2[j]){
				nums1[k--]=nums1[i--];
			}
			else{
				nums1[k--]=nums2[j--];
			}
		}
		while(j>=0){
			nums1[k--]=nums2[j--];
		}
	}
	
	public static void main(String[] args) {
		MergeSortedArray obj=new MergeSortedArray();
		Scanner input=new Scanner(System.in);
//		System.out.println("Enter m and n : ");
//		int m=input.nextInt();
//		int n=input.nextInt();
		
		System.out.println("Enter Arrays : ");
		int[] array1={1,3,5,7,9};
		int[] array2={6,10};
		int n=array2.length;
		int m=array1.length-n;
//		int[] array1=new int[m];
//		int[] array2=new int[n];
//		for(int i=0;i<m;i++){
//			array1[i]=input.nextInt();
//		}
//		
//		int m1=m-n;
//		System.out.println("Enter Array 2 : ");
//		for(int i=0;i<n;i++){
//			array2[i]=input.nextInt();
//		}
		obj.merge(array1, array1, m, n);
		for(int i=0;i<array1.length;i++){
			System.out.println(array1[i]);
	}
}
