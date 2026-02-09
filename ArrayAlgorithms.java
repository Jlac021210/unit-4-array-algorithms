public class ArrayAlgorithms {

   // DO NOT CHANGE THE VARIABLE NAME
   private int[] intArray;
   public ArrayAlgorithms(int arraySize) {
      intArray = new int[arraySize];
   }

   public void populateArrayWithRandom() {
      for(int i=0;i<intArray.length;i++){
         int random = (int)((Math.random()*99));
         intArray[i]=random;
   }
   }

   public void populateArrayWithSequential(int startNum) {
      for(int i=startNum;i<startNum+intArray.length;i++){
         intArray[i-startNum]=i;
   }
   }

   public int findMax() {
      int largestInt = Integer.MAX_VALUE+1;
      for(int i=0;i<intArray.length;i++){
      if(intArray[i]>largestInt){
         largestInt=intArray[i];
      }
      
   }
   return largestInt;
}
   public boolean hasDuplicates() {
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

      for(int value : intArray){
         if(value==intToFind){
            return true;
         }
     }
     return false;
   }


   public static void main(String[] args) {
      ArrayAlgorithms jackArray = new ArrayAlgorithms(100);
      jackArray.populateArrayWithRandom()
      System.out.println(jackArray.findMax());
      System.out.println(jackArray.hasDuplicates());
      System.out.println(jackArray.isInArray(85));
   }
}
