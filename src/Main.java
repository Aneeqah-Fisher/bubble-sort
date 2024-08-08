import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

                int[] someNums ={10,5,20,25,29,27,22,12,8}; // Declare array

                for(int a=0; a < someNums.length - 1; a++) //nested for loop
                {
                    for(int b = 0 ;b <someNums.length -1 -a ; ++b){
                        if (someNums[b]> someNums[b+1])
                        {
                            int temp = someNums[b]; // use bubble sort to sort from assending order to decending order
                            someNums[b] = someNums [b+1];
                            someNums[b+1] = temp;

                            System.out.println(Arrays.toString(someNums)); //display
                        }


                }
            }

        }
}