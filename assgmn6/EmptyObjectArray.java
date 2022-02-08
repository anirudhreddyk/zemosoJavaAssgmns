package assgmn6;

class EmptyObjectArray{
   public String name;
   EmptyObjectArray(String name){
       this.name=name;
       System.out.println("the name is "+name);
   }
    public static void main(String [] args){

        EmptyObjectArray[] testObjects = new EmptyObjectArray[5];
       /* testObjects[0]= new EmptyObjectArray("anirudh1");
        testObjects[1]= new EmptyObjectArray("anirudh2");
        testObjects[2]= new EmptyObjectArray("anirudh3");
        testObjects[3]= new EmptyObjectArray("anirudh4");
        testObjects[4]= new EmptyObjectArray("anirudh5");*/
    }
}
