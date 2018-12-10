
/**
 * Write a description of class TestMovie3 here.
 * 
 * Use Movie3 class as an example to demostrate the selelction sort for 
 * Sort title, release year, studio by selection sort
 * @author (Jeffrey Chiu) 
 * @version (06/06/18)
 */
public class TestMovie3
{   
    /**
     * Print the movie lise
     * 
     * @param myMovies Movie3[] movie list
     */
    public static void printMovies(Movie3[] m){
        for(int i = 0; i<m.length; i++){
            System.out.println(m[i]);
        }
    
    }
    
  
    public static Movie3[] sortTitles(Movie3[] m, int code){
      int i;
      int k;
      int posmax;
      Movie3 temp;

      for ( i = m.length - 1 ; i >= 0 ; i-- )
      {
          // find largest element in the i elements
          posmax = 0;
          if(code == 1){
            for ( k = 0 ; k <= i ; k++ )
            {
              if ( m[ k ].getTitle().compareTo(m[ posmax ].getTitle())>=0 )
                 posmax = k;
            }
          // swap the largest with the position i
          // now the item is in its proper location 
           temp = m[ i ];
           m[ i ] = m[posmax ];
           m[ posmax ] = temp;
           }
          else if(code == 2){
              for ( k = 0 ; k <=i ; k++ )
          {
              if ( m[ k ].getTitle().compareTo(m[ posmax ].getTitle())<0 )
                 posmax = k;
          }
           temp = m[ i ];
           m[ i ] = m[posmax ];
           m[ posmax ] = temp;
            }
     }
     return m;
    }
         
    public static Movie3[] sortYears(Movie3[] m, int code){
      int i;
      int k;
      int posmax;
      Movie3 temp;

      for ( i = m.length - 1 ; i >= 0 ; i-- )
      {
          // find largest element in the i elements
          posmax = 0;
          if(code == 1){
            for ( k = 0 ; k <= i ; k++ )
            {
              if ( m[ k ].getYear()>=(m[ posmax ].getYear()) )
                 posmax = k;
            }
          // swap the largest with the position i
          // now the item is in its proper location 
           temp = m[ i ];
           m[ i ] = m[posmax ];
           m[ posmax ] = temp;
           }
          else if(code == 2){
              for ( k = 0 ; k <=i ; k++ )
          {
              if ( m[ k ].getYear()<(m[ posmax ].getYear()) )
                 posmax = k;
          }
           temp = m[ i ];
           m[ i ] = m[posmax ];
           m[ posmax ] = temp;
            }
     }
     return m;
    }
    
   
    public static Movie3[] sortStudios(Movie3[] m, int code){
      int i;
      int k;
      int posmax;
      Movie3 temp;

      for ( i = m.length - 1 ; i >= 0 ; i-- )
      {
          // find largest element in the i elements
          posmax = 0;
          if(code == 1){
            for ( k = 0 ; k <= i ; k++ )
            {
              if ( m[ k ].getStudio().compareTo(m[ posmax ].getStudio())>0 )
                 posmax = k;
            }
          // swap the largest with the position i
          // now the item is in its proper location 
           temp = m[ i ];
           m[ i ] = m[posmax ];
           m[ posmax ] = temp;
           }
          else if(code == 2){
              for ( k = 0 ; k <=i ; k++ )
          {
              if ( m[ k ].getStudio().compareTo(m[ posmax ].getStudio())<=0 ) 
                 posmax = k;
          }
           temp = m[ i ];
           m[ i ] = m[posmax ];
           m[ posmax ] = temp;
            }
     }
     return m;
    }
    
    /**
     * main method
     * 
     * @param args String[] argument string array from console. 
     */    
    public static void main(String[] args){
        Movie3[] myMovies = new Movie3[10];
        myMovies[0] = new Movie3("The Muppets Take ManHattan", 2001, "Columbida Tristar");
        myMovies[1] = new Movie3("Mulan Special Edition", 2004, "Disney");
        myMovies[2] = new Movie3("Shrek 2", 2004, "Dreamworks");
        myMovies[3] = new Movie3("The Incredibles", 2004, "Pixar");
        myMovies[4] = new Movie3("Nanny McPhee", 2006, "Universal");
        myMovies[5] = new Movie3("The Curse of the Were-Rabbit", 2006, "Aardman");
        myMovies[6] = new Movie3("Ice Age", 2002, "20th Century Fox");
        myMovies[7] = new Movie3("Lilo & Stitch", 2002, "Disney");
        myMovies[8] = new Movie3("Robots", 2005, "20th Century Fox");
        myMovies[9] = new Movie3("Monsters Inc.", 2001, "Pixar");
        
        System.out.println("Before Sorting: ");
        printMovies(myMovies);
        Movie3[]  myMovies2 = sortTitles(myMovies, 2);
        System.out.println();
        System.out.println("Sorted by Title - descending: ");
        printMovies(myMovies2);
        System.out.println();
        Movie3[]  myMovies4 = sortYears(myMovies, 2);
        System.out.println();
        System.out.println("Sorted by Year - descending: ");
        printMovies(myMovies4);
        System.out.println();
        Movie3[]  myMovies5 = sortStudios(myMovies, 1);
        System.out.println();
        System.out.println("Sorted by Studio - ascending: ");
        printMovies(myMovies5);
        System.out.println();
    }
}
