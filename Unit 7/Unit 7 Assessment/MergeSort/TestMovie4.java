
/**
 * Write a description of class TestMovie4 here.
 * 
 * Develop a Java method for merge sort. (I wrote my own version). And modify it 
 * for three different sorting keys. (title, year, studio)
 *
 * @author (Eric S. Chou, Jr.) 
 * @version (03/28/2016)
 */
public class TestMovie4
{
    
    /**
     * Print the movie list
     * 
     * @param myMovies Movie4[] movie list
     */
    public static void printMovies(Movie4[] m){
        for(int i = 0; i<m.length; i++){
            System.out.println(m[i]);
        }
    }
    
     public static void mergeTitles( Movie4[] m, int low, int mid, int high )
    {
        Movie4[] temp = new Movie4[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while ( i <= mid || j <= high )
        {
            if ( i > mid )
            {
                temp[ n ] = m[ j ];
                j++;
            }
            else if ( j > high )
            {
                temp[ n ] = m[ i ];
                i++;
            }
            else if ( m[i].getTitle().compareTo(m[j].getTitle())<0 )
            {
                temp[ n ] = m[ i ];
                i++;
            }
            else
            {
                temp[ n ] = m[ j ];
                j++;
            }
            n++;
        }

        for ( int k = low ; k <= high ; k++ )
            m[ k ] = temp[ k - low ];

    } // end of merge    
    
 
    public static void sortTitles(Movie4[] m, int low, int high){
        if ( low == high ) 
        return;  

        int mid = ( low + high ) / 2; 

        sortTitles( m, low, mid );  
        sortTitles( m, mid + 1, high );  

        mergeTitles( m, low, mid, high );
    }


         public static void mergeYears( Movie4[] m, int low, int mid, int high )
    {
        Movie4[] temp = new Movie4[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while ( i <= mid || j <= high )
        {
            if ( i > mid )
            {
                temp[ n ] = m[ j ];
                j++;
            }
            else if ( j > high )
            {
                temp[ n ] = m[ i ];
                i++;
            }
            else if ( m[i].getYear() > m[j].getYear())
            {
                temp[ n ] = m[ i ];
                i++;
            }
            else
            {
                temp[ n ] = m[ j ];
                j++;
            }
            n++;
        }

        for ( int k = low ; k <= high ; k++ )
            m[ k ] = temp[ k - low ];

    }
    public static void sortYears(Movie4[] m, int low, int high){
        if ( low == high ) 
        return;  

        int mid = ( low + high ) / 2; 

        sortYears( m, low, mid );  
        sortYears( m, mid + 1, high );  

        mergeYears( m, low, mid, high );
    }
    
         public static void mergeStudios( Movie4[] m, int low, int mid, int high )
    {
        Movie4[] temp = new Movie4[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while ( i <= mid || j <= high )
        {
            if ( i > mid )
            {
                temp[ n ] = m[ j ];
                j++;
            }
            else if ( j > high )
            {
                temp[ n ] = m[ i ];
                i++;
            }
            else if ( m[i].getStudio().compareTo(m[j].getStudio())<0 )
            {
                temp[ n ] = m[ i ];
                i++;
            }
            else
            {
                temp[ n ] = m[ j ];
                j++;
            }
            n++;
        }

        for ( int k = low ; k <= high ; k++ )
            m[ k ] = temp[ k - low ];

    }
    public static void sortStudios(Movie4[] m, int low, int high){
        if ( low == high ) 
        return;  

        int mid = ( low + high ) / 2; 

        sortStudios( m, low, mid );  
        sortStudios( m, mid + 1, high );  

        mergeStudios( m, low, mid, high );
    }
    
    public static void main(String[] args){
        Movie4[] myMovies = new Movie4[10];
        myMovies[0] = new Movie4("The Muppets Take Manhattan", 2001, "Columbida Tristar");
        myMovies[1] = new Movie4("Mulan Special Edition", 2004, "Disney");
        myMovies[2] = new Movie4("Shrek 2", 2004, "Dreamworks");
        myMovies[3] = new Movie4("The Incredibles", 2004, "Pixar");
        myMovies[4] = new Movie4("Nanny McPhee", 2006, "Universal");
        myMovies[5] = new Movie4("The Curse of the Were-Rabbit", 2006, "Aardman");
        myMovies[6] = new Movie4("Ice Age", 2002, "20th Century Fox");
        myMovies[7] = new Movie4("Lilo & Stitch", 2002, "Disney");
        myMovies[8] = new Movie4("Robots", 2005, "20th Century Fox");
        myMovies[9] = new Movie4("Monsters Inc.", 2001, "Pixar");
        
        System.out.println("Before Sorting: ");
        printMovies(myMovies);
        sortTitles(myMovies, 0, myMovies.length-1);
        System.out.println();
        System.out.println("Sorted by Title - ascending: ");
        printMovies(myMovies);
        System.out.println();
        sortYears(myMovies, 0, myMovies.length-1);
        System.out.println();
        System.out.println("Sorted by Year - descending: ");
        printMovies(myMovies);
        System.out.println();
        sortStudios(myMovies, 0, myMovies.length-1);
        System.out.println();
        System.out.println("Sorted by Studio - ascending: ");
        printMovies(myMovies);
        System.out.println();
    }
}
