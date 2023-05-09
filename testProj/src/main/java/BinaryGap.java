/**
 * Rajyalaxmi_Thumarada on 13-03-2023
 */
public class BinaryGap {

    public static void main(String args []) {
        String binNum = "0010001100001";
        System.out.println("Binary gap for the given string is :::: " + findBinaryGap(binNum));

    }

    private static int findBinaryGap(String binNum) {
        char[] binCharArr = binNum.toCharArray();
        int binGap = 0;
        for(int i = 0; i < binCharArr.length; i++) {
            int temp = 0;
            if(binCharArr[i] == '0') {
                temp++;
                for (int j = i + 1; j < binCharArr.length; j++) {
                    if (binCharArr[j] == '0') {
                        temp++;
                        continue;
                    } else {
                        if(temp > binGap){
                            binGap = temp;
                        }
                        break;
                    }

                }
              //  break;
            }
            continue;
        }

        return binGap;
    }


}
