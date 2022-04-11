/**
 * 
 */
package com.greatlearning.lab2.question1;

import java.util.Scanner;

/**
 * @author AshishSinha
 *
 */
public class Transaction {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Transaction Array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter the Values of Array : ");
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter the Total no. of Targets that needs to be achieved : ");
		int targetNo = sc.nextInt();

		while (targetNo-- != 0) {
			int flag = 0;
			long target;

			System.out.println("Enter the Value of Target : ");
			target = sc.nextInt();

			long sum = 0;

			for (int i = 0; i < size; i++) {
				sum += arr[i];

				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions.");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achieved.");
			}
			
			sc.close();
		}
	}
}
