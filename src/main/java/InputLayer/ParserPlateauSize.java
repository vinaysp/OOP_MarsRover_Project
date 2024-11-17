package InputLayer;

import static java.lang.Integer.parseInt;

class PlateauSizeParser {


    int[] parsedPlateauSize(String input) throws Exception {

        if(input == null || input.isEmpty()){
            throw new IllegalArgumentException("Invalid input, input cannot be empty or null");
        }

        int[] parsedPlateauSizeArray = new int[2];

        if (input.matches("[0-9]+") && input.length() < 3){
            for (int i = 0; i < input.length(); i++){
                parsedPlateauSizeArray[i] = Character.getNumericValue(input.charAt(i));
            }
        } else {
            throw new IllegalArgumentException("Invalid input, please provide only two numbers between 1 and 9");
        }


        return parsedPlateauSizeArray;
    }
}
