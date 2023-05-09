/**
 * Rajyalaxmi_Thumarada on 03-04-2023
 */
public class AngryFrogsJump {

    public static void main(String args []) {
        int[] inp = {1,5,5,2,6};
       // int[] inp = {2,6,8,5};
        System.out.println("max jump distance :::" + solution(inp));


    }

    private static int solution(int[] blocks) {
        int n = blocks.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        for(int i=1; i < blocks.length; i++) {
            leftMax[i] = blocks[i-1] >= blocks[i] ? leftMax[i-1] + 1 : 0;
        }
        rightMax[n-1] = 0;
        for(int j = n-2; j >= 0; j--) {
            rightMax[j] = blocks[j] <= blocks[j+1] ? rightMax[j+1] + 1 : 0 ;
        }
        int maxDistance = 0;
        for(int k = 0; k < n; k++) {
            maxDistance = Math.max(maxDistance, leftMax[k] + rightMax[k] + 1);
        }
    return maxDistance;
    }

}
