/*
 * Java Program to Implement Heap Sort
 */

import java.util.Scanner;

/* Class HeapSort */
public class HeapSort
{
    private static int N;
    /* Sort Function */
    public static void sort(int arr[])
    {
        heapify(arr);
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
    }
    /* Function to build a heap */
    public static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);
    }