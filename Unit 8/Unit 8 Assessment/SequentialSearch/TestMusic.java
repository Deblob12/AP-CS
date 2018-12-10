/**
 * Write a description of class TestMusic here.
 * 
 * Sequential search through music class
 * 
 * @author (Jeffrey Chiu) 
 * @version (06/07/18)
 */
public class TestMusic
{  
   public static void printMusic(Music[] m){
      for(int i = 0; i< m.length; i++){
          System.out.println(m[i].toString());
        }
    }

   public static Music searchTitle(Music[] m, String title){
       if(m.length == 0 || m == null)return null;
       int index = -1;
       for(int i=0; i < m.length; i++){
           if(m[i].getTitle().equals(title)){
               index = i;
               break;
            }
        }
       if(index >= 0){  
          return m[index];
        }
       else{
           return null;
        }
    }
    
    public static Music[] searchYear(Music[] m, int year){
       if(m.length == 0 || m == null)return null;
       int count = 0;
       for(int i = 0; i< m.length; i++){
           if(m[i].getYear()==year){
               count++;
            }
        }
       Music[] m2 = new Music[count];
       int index = 0;
       for(int i = 0; i < m.length; i++){
           if(m[i].getYear()==year){
               m2[index] = m[i];
               index++;
            }
        }
        return m2;
    } 
       
   public static Music[] searchSinger(Music[] m, String singer){
       if(m.length == 0 || m == null)return null;
       int count = 0;
       for(int i = 0; i< m.length; i++){
           if(m[i].getSinger().equals(singer)){
               count++;
            }
        }
       Music[] m2 = new Music[count];
       int index = 0;
       for(int i = 0; i < m.length; i++){
           if(m[i].getSinger().equals(singer)){
               m2[index] = m[i];
               index++;
            }
        }
        return m2;
    } 
    
   /**
    * main method
    * 
    * @paran args String[] array of string as input from console. 
    */    
   public static void main(String[] args){
     Music[] myMusic = new Music[10];
     myMusic[0] = new Music("Pieces of You", 1994, "Jewel");
     myMusic[1] = new Music("Jagged Little Pill", 1995, "Alanis Morissette");
     myMusic[2] = new Music("What If It's You", 1995, "Reba McEntire");
     myMusic[3] = new Music("Misunderstood", 2001, "Pink");
     myMusic[4] = new Music("Laundry Service", 2001, "Shakira");
     myMusic[5] = new Music("Taking the Long Way", 2006, "Dixie Chicks");
     myMusic[6] = new Music("Under My Skin", 2004, "Avril Lavigne");
     myMusic[7] = new Music("Let Go", 2002, "Avril Lavigne");
     myMusic[8] = new Music("Let It Go", 2007, "Tim McGraw");
     myMusic[9] = new Music("White Flag", 2004, "Dido");
     
     System.out.println("\fMusic Library: ");
     System.out.println("----------------");
     printMusic(myMusic);
     System.out.println();
     System.out.println();
     String title = "Let Go";
     System.out.println("Search - Title - " + title);
     Music m = searchTitle(myMusic, title);
     if(m == null){
         System.out.println(title + "is not in the library" );
        }
     else{
        System.out.println("We found " + title + " in the library:");
        System.out.println(m.toString());
        }
        
     System.out.println();
     System.out.println();
     String title1 = "Some Day";
     System.out.println("Search - Title - " + title1);
     Music m1 = searchTitle(myMusic, title1);
     if(m1 == null){
         System.out.println(title1 + " is not in the library" );
        }
     else{
        System.out.println("We found " + title1 + " in the library:");
        System.out.println(m1.toString());
        }
     //=============================================================
     System.out.println();
     System.out.println();
     int year = 2001;
     System.out.println("Search - Year - " + year);
     Music[] m2 = searchYear(myMusic, year);
     System.out.println("Find results");
     if(m2 == null){
         System.out.println("There are no listings for " + year);
        }
     else{
           for(Music mm : m2)
           System.out.println(mm.toString());
           System.out.println("There are " + m2.length + " listings for " + year);
        }
     //=====================================================================  
      System.out.println();
     System.out.println();
     int year1 = 2003;
     System.out.println("Search - Year - " + year1);
     Music[] m3 = searchYear(myMusic, year1);
     System.out.println("Find results");
     if(m3 == null){
         System.out.println("There are no listings for " + year1);
        }
     else{
           for(Music mm : m3)
           System.out.println(mm.toString());
           System.out.println("There are " + m3.length + " listings for " + year1);
        }
     //===================================================================================
     System.out.println();
     System.out.println();
     String singer = "Avril Lavigne";
     System.out.println("Search - Singer - " + singer);
     Music[] m4 = searchSinger(myMusic, singer);
     System.out.println("Find results");
     if(m4 == null){
         System.out.println(singer + " is not in the library" );
        }
     else{
           for(Music mm : m4)
           System.out.println(mm.toString());
           System.out.println("There are " + m4.length + " listings for " + singer);
        }
        
    System.out.println();
     System.out.println();
     String singer1 = "Tony Curtis";
     System.out.println("Search - Singer - " + singer1);
     Music[] m5 = searchSinger(myMusic, singer1);
     System.out.println("Find results");
     if(m5 == null){
         System.out.println("There are no listings for " + singer1);
        }
     else{
           for(Music mm : m5)
           System.out.println(mm.toString());
           System.out.println("There are " + m5.length + " listings for " + singer1);
        }
    }
}
