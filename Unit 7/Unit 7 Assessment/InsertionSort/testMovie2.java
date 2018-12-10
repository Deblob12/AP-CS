
/**
 * Write a description of class testMovie2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testMovie2
{
    public static void printMovies(Movie2[] m){
        for(int i = 0; i < m.length; i++){
            System.out.println(m[i]);
        }
    }
    public static Movie2[] sortTitles(Movie2[] m, int code){
       Movie2[] dest = new Movie2[m.length]; 
       for ( int i = 0 ; i < m.length ; i++ )
       {
           Movie2 next = m[ i ];
           int insertindex = 0;
           int k = i;
           while ( k > 0 && insertindex == 0 )
           {
              if(code == 1){
              if ( next.getTitle().compareTo( dest[k-1].getTitle()) >= 0)
              {
                  insertindex = k;
              }
              else 
              {
                 dest[ k ] = dest[ k - 1 ];
              }
             }
             else if(code == 2){
              if ( next.getTitle().compareTo( dest[k-1].getTitle()) < 0)
              {
                  insertindex = k;
              }
              else
              {
                 dest[ k ] = dest[ k - 1 ];
              }
                }
               k--;
           }

           dest[ insertindex ] = next;
       } // end of for 
       return dest; 
    }
     public static Movie2[] sortYears(Movie2[] m, int code){
       Movie2[] dest = new Movie2[m.length]; 
       for ( int i = 0 ; i < m.length ; i++ )
       {
           Movie2 next = m[ i ];
           int insertindex = 0;
           int k = i;
           while ( k > 0 && insertindex == 0 )
           {
              if(code == 1){
              if ( next.getYear()>=( dest[k-1].getYear()))
              {
                  insertindex = k;
              }
              else
              {
                 dest[ k ] = dest[ k - 1 ];
              }
             }
             else if(code == 2){
              if ( next.getYear()<( dest[k-1].getYear()))
              {
                  insertindex = k;
              }
              else
              {
                 dest[ k ] = dest[ k - 1 ];
              }
                }
               k--;
           }

           dest[ insertindex ] = next;
       } // end of for    
       return dest; 
    }
    public static Movie2[] sortStudios(Movie2[] m, int code){
       Movie2[] dest = new Movie2[m.length]; 
       for ( int i = 0 ; i < m.length ; i++ )
       {
           Movie2 next = m[ i ];
           int insertindex = 0;
           int k = i;
           while ( k > 0 && insertindex == 0 )
           {
              if(code == 1){
              if ( next.getStudio().compareTo( dest[k-1].getStudio()) >= 0)
              {
                  insertindex = k;
              }
              else
              {
                 dest[ k ] = dest[ k - 1 ];
              }
             }
             else if(code == 2){
              if ( next.getStudio().compareTo( dest[k-1].getStudio()) < 0)
              {
                  insertindex = k;
              }
              else
              {
                 dest[ k ] = dest[ k - 1 ];
              }
                }
               k--;
           }

           dest[ insertindex ] = next;
       } // end of for    
       return dest; 
    }
    public static void main(String[] args){
        Movie2[] myMovies = new Movie2[10];
        myMovies[0] = new Movie2("The Muppets Take ManHattan", 2001, "Columbida Tristar");
        myMovies[1] = new Movie2("Mulan Special Edition", 2004, "Disney");
        myMovies[2] = new Movie2("Shrek 2", 2004, "Dreamworks");
        myMovies[3] = new Movie2("The Incredibles", 2004, "Pixar");
        myMovies[4] = new Movie2("Nanny McPhee", 2006, "Universal");
        myMovies[5] = new Movie2("The Curse of the Were-Rabbit", 2006, "Aardman");
        myMovies[6] = new Movie2("Ice Age", 2002, "20th Century Fox");
        myMovies[7] = new Movie2("Lilo & Stitch", 2002, "Disney");
        myMovies[8] = new Movie2("Robots", 2005, "20th Century Fox");
        myMovies[9] = new Movie2("Monsters Inc.", 2001, "Pixar");
        
        System.out.println("Before Sorting: ");
        printMovies(myMovies);
        Movie2[]  myMovies1 = sortTitles(myMovies, 1);
        System.out.println();
        System.out.println("Sorted by Title - ascending: ");
        printMovies(myMovies1);
        Movie2[]  myMovies4 = sortYears(myMovies, 2);
        System.out.println();
        System.out.println("Sorted by Year - descending: ");
        printMovies(myMovies4);
        System.out.println();
        Movie2[]  myMovies5 = sortStudios(myMovies, 1);
        System.out.println();
        System.out.println("Sorted by Studio - ascending: ");
        printMovies(myMovies5);
        System.out.println();
        
    }
}





