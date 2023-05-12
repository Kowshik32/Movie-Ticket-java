import java.util.Scanner;

public class Movie_List {
    Scanner scanner = new Scanner(System.in);
    String[] movie_genre={"Bangla","Hindi","English"};
    String[][] movie_name={{"Jibon Theke Neya","Muktir Gaan","Belaseshe"},
            {"Dangal","3 Idiots","777 Charlie"},{"Inception","The Dark Knight","Joker"}};
    void view(){
        for(int i=0; i<3; i++){
            System.out.printf("%d. %s\n",i+1,movie_genre[i]);
        }
        System.out.println("Choose a genre: ");
        int genre=scanner.nextInt();
        for(int i=genre-1; i<genre; i++){
            for(int j=0; j<3; j++){
                System.out.printf("%d. %s\n",j+1,movie_name[i][j]);
            }
        }
    }
}
