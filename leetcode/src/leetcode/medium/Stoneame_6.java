package leetcode.medium;

public class Stoneame_6 {
    public static void main(String[] args) {

        int[] arr={5,3,1,4,2};
        int[] arr1={7,90,5,1,100,10,10,2};
        int res= stoneGameVII(arr);
        System.out.println(res);
    }


    public static int stoneGameVII(int[] stones) {
        int sum = 0;
        for (int num : stones) {
            sum += num;
        }
        System.out.println(sum);
        int alice = 0, bob = 0;
        int left = 0;
        int right = stones.length - 1;
        while (left < right) {
                // Alice's turn
                alice += Math.max(stones[left], stones[right]);
                if (stones[left] > stones[right]) {
                    sum -= stones[left];
                    left++;
                } else {
                    sum -= stones[right];
                    right--;
                }

                // Bob's turn
                bob += Math.max(stones[left], stones[right]);
                if (stones[left] > stones[right]) {
                    sum -= stones[left];
                    left++;
                } else {
                    sum -= stones[right];
                    right--;
                }
            }

            // If there is an odd number of stones, Alice takes the remaining one
            if (left == right) {
                alice += stones[left];
            }

            return alice - bob;
        }

    }