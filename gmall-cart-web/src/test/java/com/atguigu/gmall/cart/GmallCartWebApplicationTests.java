package com.atguigu.gmall.cart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallCartWebApplicationTests {

	@Test
	public void contextLoads() {

			int[] arr ={3,5,9,7,4,13,15,0,2,20};
			for( int i=0; i<arr.length-1; i++ ) {
				for( int j=i+1; j>0; j-- ) {
					if( arr[j-1] <= arr[j] )
						break;
					int temp = arr[j];      //交换操作
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					System.out.println("Sorting:  " + Arrays.toString(arr));
				}
			}

	}

}
