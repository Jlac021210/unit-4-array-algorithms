public class ArrayAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private int[] intArray;

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */

   public ArrayAlgorithms(int arraySize) {
      // REQUIRED: initialize intArray to be of size arraySize
      intArray = new int[arraySize];
   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      for(int i=0;i<intArray.length;i++){
         int random = (int)((Math.random()*99));
         intArray[i]=random;
   }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      for(int i=startNum;i<startNum+intArray.length;i++){
         intArray[i-startNum]=i;
   }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int largestInt = 0;
      for(int i=0;i<intArray.length;i++){
      if(intArray[i]>largestInt){
         largestInt=intArray[i];
      }
      
   }
   return largestInt;
}
   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      for(int i=0;i<intArray.length;i++){
         int temp = intArray[i];
         for(int j=0;j<intArray.length;j++){
            if(temp==intArray[j]&&j!=i){
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
      ArrayAlgorithms jackArray = new ArrayAlgorithms(100);
      // 2) Populate the array with random numbers
      jackArray.populateArrayWithSequential(0);
      // 3) Call and print the result of EACH REQUIRED method
      System.out.println(jackArray.findMax());
      System.out.println(jackArray.hasDuplicates());
      System.out.println(jackArray.isInArray(85));
      //test
      // 4) If you are UWHS, also test the UWHS methods
   }
}
