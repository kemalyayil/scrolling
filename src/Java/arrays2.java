package Java;

import java.util.Arrays;

public class arrays2 {
    public static void main(String[] args) {
        int [] nums = {1, 2, 2, 1, 13};  // 13 varsa rakamlar arasinda 13 u 0 yap
        int count= 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 13){
                nums[i]=0;
            }
            count = count + nums[i];
        }

        System.out.println(count);

        Arrays.sort(nums);                          // buyukten kucuge siralama
        System.out.println(Arrays.toString(nums));
    }
}
