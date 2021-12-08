# Week 13
# Given an array of integers {4,1,2,3,5}
# How can you sort this array?
# Bubble Sort
# Time complexity (testing efficiency of the code): O(n^2) is the worst case
//int temp=arr[j];
arr[j]=arr[j]+arr[j+1];
arr[j+1]=arr[j]-arr[j+1];
arr[j]=arr[j]-arr[j+1];

## Example of the + and - way of swapping integers in an array
a=5;
b=7;
a=a+b; 5+7=12
b=a-b; 12-7=5
a=a-b; 12-5=7

## Exclusive OR example
# Exclusive OR is true if only one of the values is true (aka a 1 and a 0 yields 1) and false if both values are true (aka 1 and 1 yields 0)
arr[j]=arr[j] ^ arr[j+1]; //^ is the exclusive OR
arr[j+1]=arr[j] ^ arr[j+1];
arr[j]=arr[j] ^ arr[j+1];

a=7; binary: 111
b=5; binary: 101
a=a^b; 111 ^ 101 => 010 => 2
b=a^b; 010 ^ 101 => 111 => 7
a=a^b; 010 ^ 111 => 101 => 5

## mergeSort breaks array into smaller pieces to improve efficiency

## Recursion: a method calling itself
# Base Case: ends recursion
# Recursive Call
...
public static int sum(int target) {
		if (target<=0) {
			return 0;
		}
		else {
			return target + sum(target-1);
		}
	}
...
if n=5: (5+(4+(3+(2+(1+(0)))))) --> (15)
## If there is a method within a method, the outer method has to wait for the inner method to end before it could start/end

## Fibonacci-recursion
f(1)=1
f(n)=f(n-1)+f(n-2)

0 1 1 2 3 5 8 13 21...