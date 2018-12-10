
/**
 * Write a description of class TestMusic2 here.
 * 
 * Look through array of Music2 objects using binary search
 * 
 * @author (Jeffrey Chiu) 
 * @version (06/07/17)
 */
public class TestMusic2
{

   public static void printMusic(Music2[] m){
      for(int i = 0; i< m.length; i++){
          System.out.println(m[i].toString());
        }
    }  
     
   public static Music2[] insertionSortTitle(Music2[] m){
      Music2[] m2 = new Music2[m.length];
      for (int i=0; i<m.length; i++) {
          m2[i] = m[i]; 
        }
      int k = m2.length;
      for(int i = 1; i< k; i++){
          Music2 temp = m2[i]; 
          int j;
          for(j = i-1; j>=0 && m2[j].getTitle().compareTo(temp.getTitle())>=0; j--){
                  m2[j+1] = m2[j];
                }
             m2[j+1] = temp; 
        }
      return m2; 
    }  
       
   public static Music2[] insertionSortYear(Music2[] m){
      Music2[] m2 = new Music2[m.length];
      for (int i=0; i<m.length; i++) {
          m2[i] = m[i]; 
        }
      int k = m2.length;
      for(int i = 1; i< k; i++){
          Music2 temp = m2[i]; 
          int j;
          for(j = i-1; j>=0 && m2[j].getYear()>=temp.getYear(); j--){
                  m2[j+1] = m2[j];
                }
             m2[j+1] = temp; 
        }
      return m2; 
    }  
   

   public static Music2[] insertionSortSinger(Music2[] m){
      Music2[] m2 = new Music2[m.length];
      for (int i=0; i<m.length; i++) {
          m2[i] = m[i]; 
        }
      int k = m2.length;
      for(int i = 1; i< k; i++){
          Music2 temp = m2[i]; 
          int j;
          for(j = i-1; j>=0 && m2[j].getSinger().compareTo(temp.getSinger())>=0; j--){
                  m2[j+1] = m2[j];
                }
             m2[j+1] = temp; 
        }
      return m2; 
    }   
    

    public static Music2 searchTitle(Music2[] r, String toFind )
  {
    int high = r.length;
    int low = -1;
    int probe;

    while ( high - low > 1 )
    {
      probe = ( high + low ) / 2;

      if ( r[probe].getTitle().compareTo(toFind) > 0)
        high = probe;
      else
        {
            low = probe;
            if ( r[probe].getTitle().compareTo(toFind) == 0)
            {
                return r[probe];
            }
        }
    }
    return null;
  }  
 
  
    public static Music2[] searchYear(Music2[] m, int year){
       if(m.length == 0 || m == null)return null;
       int count = 0;
       for(int i = 0; i< m.length; i++){
           if(m[i].getYear()==year){
               count++;
            }
        }
       Music2[] m2 = new Music2[count];
       int index = 0;
       for(int i = 0; i < m.length; i++){
           if(m[i].getYear()==year){
               m2[index] = m[i];
               index++;
            }
        }
        if(m2.length == 0){
            return null;
        }
        return m2;
    } 
       
   public static Music2[] searchSinger(Music2[] m, String singer){
       if(m.length == 0 || m == null)return null;
       int count = 0;
       for(int i = 0; i< m.length; i++){
           if(m[i].getSinger().equals(singer)){
               count++;
            }
        }
       Music2[] m2 = new Music2[count];
       int index = 0;
       for(int i = 0; i < m.length; i++){
           if(m[i].getSinger().equals(singer)){
               m2[index] = m[i];
               index++;
            }
        }
        if(m2.length == 0){
            return null;
        }
        return m2;
    }   
    
   /**
    * main method
    * 
    * @paran args String[] array of string as input from console. 
    */
   public static void main(String[] args){
     Music2[] myMusic = new Music2[10];
     myMusic[0] = new Music2("Pieces of You", 1994, "Jewel");
     myMusic[1] = new Music2("Jagged Little Pill", 1995, "Alanis Morissette");
     myMusic[2] = new Music2("What If It's You", 1995, "Reba McEntire");
     myMusic[3] = new Music2("Misunderstood", 2001, "Pink");
     myMusic[4] = new Music2("Laundry Service", 2001, "Shakira");
     myMusic[5] = new Music2("Taking the Long Way", 2006, "Dixie Chicks");
     myMusic[6] = new Music2("Under My Skin", 2004, "Avril Lavigne");
     myMusic[7] = new Music2("Let Go", 2002, "Avril Lavigne");
     myMusic[8] = new Music2("Let It Go", 2007, "Tim McGraw");
     myMusic[9] = new Music2("White Flag", 2004, "Dido");

     Music2[] myMusicSorted1 = insertionSortTitle(myMusic);
     Music2[] myMusicSorted2 = insertionSortYear(myMusic);
     Music2[] myMusicSorted3 = insertionSortSinger(myMusic);
     
     
     System.out.println("\fMusic Library: ");
     System.out.println("-----------------");
     printMusic(myMusic);
     System.out.println(); 
     System.out.println(); 

     String title = "Misunderstood";
     System.out.println("Search - Title - " + title);
     Music2 m1 = searchTitle(myMusicSorted1, title);
     if(m1 == null){
         System.out.println("Not found");
        }
     else{
        System.out.print("Found: ");
        System.out.println(m1.toString());
        }
     System.out.println();
     System.out.println();
     String title1 = "Under Paid";
     System.out.println("Search - Title - " + title1);
     Music2 m2 = searchTitle(myMusicSorted1, title1);
     if(m2 == null){
         System.out.println("Not found");
        }
     else{
        System.out.print("Found: ");
        System.out.println(m2.toString());
        }
     System.out.println();

     int year = 2005;
     System.out.println("Search - Year - " + year);
     Music2[] m3 = searchYear(myMusicSorted2, year);
     if(m3 == null){
         System.out.println("Not found");
        }
     else{
           System.out.print("Found: ");
           for (Music2 mm : m3) System.out.println(mm.toString());
        }    
        
     System.out.println();
     System.out.println();
     
     int year1 = 2006;
     System.out.println("Search - Year - " + year1);
     Music2[] m4 = searchYear(myMusicSorted2, year1);
     if(m4 == null){
         System.out.println("Not found");
        }
     else{
            System.out.print("Found: ");
            for (Music2 mm: m4) System.out.println(mm.toString());
        }     
          
     System.out.println(); 

     String singer = "Darth Maul";
     System.out.println("Search - Singer - " + singer);
     Music2[] m5 = searchSinger(myMusicSorted3, singer);
     if(m5 == null){
         System.out.println("Not found");
        }
     else{
           System.out.print("Found: ");
           for (Music2 mm:m5) System.out.println(mm.toString());
        }    
     System.out.println();
     System.out.println();

     String singer1 = "Dido";
     System.out.println("Search - Singer - " + singer1);
     Music2[] m6 = searchSinger(myMusicSorted3, singer1);
     if(m6 == null){
         System.out.println("Not found");
        }
     else{
           System.out.print("Found: ");
           for (Music2 mm: m6) System.out.println(mm.toString());
        }    
   }
}