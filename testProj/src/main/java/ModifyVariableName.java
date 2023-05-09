/**
 * Rajyalaxmi_Thumarada on 18-03-2023
 */
public class ModifyVariableName {

    public static void main(String args[]) {
        //String varName = "modify_varName";
        //String varName = "this_is_a_variable";
        String varName = "thisIsAVariable";
        System.out.println("in main of ModifyVariableName "+changeVarName(varName));
    }

    private static String changeVarName(String varName) {
        String result = "";
        if(varName.contains("_")) {

            String[] arr = varName.split("_");
            result = result + arr[0];
            for(int i = 1; i < arr.length; i++) {

                result = result + Character.toString(arr[i].charAt(0)).toUpperCase();

                for (int j=1; j< arr[i].length();j++ ) {

                    result = result + arr[i].charAt(j);

                }

            }

        } else {
            result = result + Character.toString(varName.charAt(0)).toLowerCase();
            for (int i=1;i<varName.length();i++) {
                if(Character.isUpperCase(varName.charAt(i))) {
                    result = result + "_";
                    result = result + Character.toString(varName.charAt(i)).toLowerCase();
                } else {
                    result = result + varName.charAt(i);
                }
            }

        }
        return result;
    }

}
