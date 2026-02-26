import java.util.ArrayList;
public class ArrayListAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private ArrayList<Integer> intArray;

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */

   public ArrayListAlgorithms(int arraySize) {
      // REQUIRED: initialize intArray to be of size arraySize
      intArray = new ArrayList<Integer>(arraySize);
      for (int i = 0; i < arraySize; i++) {
         intArray.add(null);
      }
   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      for(int i=0;i<intArray.size();i++){
         int random = (int)((Math.random()*99));
         intArray.set(i, random);
   }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      for(int i=startNum;i<startNum+intArray.size();i++){
         intArray.set(i-startNum, i);
   }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int largestInt = Integer.MAX_VALUE+1;
      for(int i=0;i<intArray.size();i++){
      if(intArray.get(i)>largestInt){
         largestInt=intArray.get(i);
      }
      
   }
   return largestInt;
}
   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      for(int i=0;i<intArray.size();i++){
         int temp = intArray.get(i);
         for(int j=0;j<intArray.size();j++){
            if(temp==intArray.get(j)&&j!=i){
               return true;
            }
        }
      }
      return false; 
   }

   public boolean isInArray(int intToFind) {
      // REQUIRED: return true if intToFind is in intArray.
      // NOTE: Use an enhanced for loop for this method
      for(int value : intArray){
         if(value==intToFind){
            return true;
         }
     }
     return false;
   }


   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      ArrayListAlgorithms jackArray = new ArrayListAlgorithms(100);
      // 2) Populate the array with random numbers
      jackArray.populateArrayWithRandom();
      // 3) Call and print the result of EACH REQUIRED method
      System.out.println(jackArray.findMax());
      System.out.println(jackArray.hasDuplicates());
      System.out.println(jackArray.isInArray(85));
      
      // 4) If you are UWHS, also test the UWHS methods
   }
}
