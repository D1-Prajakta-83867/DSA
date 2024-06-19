import java.util.Arrays;
public class Assign1Que9 {
		
		public static void selectionSort(int arr[], int N) {
			int comp=0;
			for(int i = 0 ; i< N-1 ; i++) {
				for(int j = i + 1 ; j < N ; j++) {
					if(arr[i] > arr[j]) {
						comp++;
					
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("Number of Comparisons : "+comp);
		}

		public static void main(String[] args) {
			int arr[] = {11,88,44,66,33,99};

			System.out.println("Array before sort : " + Arrays.toString(arr));
			
			selectionSort(arr, arr.length);
			
			System.out.println("Array after sort : " + Arrays.toString(arr));
		}

	}


