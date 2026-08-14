package BookManagement_Java;
import java.util.Scanner;

public class BookManagement {
    static Scanner myScanner=new Scanner(System.in); 
    static String[] books={"Java","C","Python"};
    static final double studentDiscout=.3;
    static final double teacherDiscout=.5;
    static final double alienDiscout=0;
    static  double[] bookPrice={200,150,500};
   
        public static void main(String[] args) {
            prln("================================\n\tBOOKSHOP MANAGEMENT\n================================");
            while(true){
            prln("Which book do you want?\nAns: ");
            String userChoice= userChoice();
            if(books[0].toLowerCase().equals(userChoice.toLowerCase())){
                prln("You opted for "+books[0]+"Book.");
                javacalculatePrice(books[0]);
                break;

            }
            else  if(books[1].toLowerCase().equals(userChoice.toLowerCase())){
                prln("You opted for "+books[1]+"Book.");
                c_calculatePrice(books[1]);
                break;
            }
            else if(books[2].toLowerCase().equals(userChoice.toLowerCase())){
                prln("You opted for "+books[2]+"Book.");
                pythoncalculatePrice(books[2]);
                break;
            }
            else {
                prln("Sorry ! we haven't that book . try again");
                
            }
        }
        
        
    }
    //java calculator
    static void javacalculatePrice(String books){
        prln("Are you Student ,teacher or alien?\nAns: ");
        
        String Mychoice=userChoice();
        if(Mychoice.toLowerCase().equals("student")){
            bookPrice[0]= bookPrice[0]- bookPrice[0]*studentDiscout;
            ShowPrice(bookPrice[0]);
            
        }
        else if(Mychoice.toLowerCase().equals("teacher")){
            bookPrice[0]= bookPrice[0]- bookPrice[0]*teacherDiscout;
            ShowPrice(bookPrice[0]);
        }
        else if (Mychoice.toLowerCase().equals("alien")){
            bookPrice[0]= bookPrice[0]- bookPrice[0]*alienDiscout;
            ShowPrice(bookPrice[0]);
        }
        else{
            prln("Sorry !! you are not eligible this shop !!! ");
        }

        
    }
    // c calculator
    static void c_calculatePrice(String books){
        prln("Are you Student ,teacher or alien?\nAns: ");
        
        String Mychoice=userChoice();
        if(Mychoice.toLowerCase().equals("student")){
            bookPrice[1]= bookPrice[1]- bookPrice[1]*studentDiscout;
            ShowPrice(bookPrice[1]);
            
        }
        else if(Mychoice.toLowerCase().equals("teacher")){
            bookPrice[1]= bookPrice[1]- bookPrice[1]*teacherDiscout;
            ShowPrice(bookPrice[1]);
        }
        else if (Mychoice.toLowerCase().equals("alien")){
            bookPrice[1]= bookPrice[1]- bookPrice[1]*alienDiscout;
            ShowPrice(bookPrice[1]);
        }
        else{
            prln("Sorry !! you are not eligible this shop !!! ");
        }

        
    }

    //python calculate..
   static void pythoncalculatePrice(String books){
        prln("Are you Student ,teacher or alien?\nAns: ");
        
        String Mychoice=userChoice();
        if(Mychoice.toLowerCase().equals("student")){
            bookPrice[2]= bookPrice[2]- bookPrice[2]*studentDiscout;
            ShowPrice(bookPrice[2]);
            
        }
        else if(Mychoice.toLowerCase().equals("teacher")){
            bookPrice[2]= bookPrice[2]- bookPrice[2]*teacherDiscout;
            ShowPrice(bookPrice[2]);
        }
        else if (Mychoice.toLowerCase().equals("alien")){
            bookPrice[2]= bookPrice[2]- bookPrice[2]*alienDiscout;
            ShowPrice(bookPrice[2]);
        }
        else{
            prln("Sorry !! you are not eligible this shop !!! ");
        }

        
    }

    static void ShowPrice(double price){
        prln("Your Total payable amount: "+price);
        prln("\n========THANK YOU FOR SHOPPING FROM OUR BOOKSTORE===========");
    }

    static String userChoice()
    {
      String  user=myScanner.nextLine();
        return user.trim();    /// .trim() ata use korle space remove hoye jai

    }
    static void prln(Object anyObject){
        System.out.println(anyObject);
    }
     static void pr(Object anyObject){
        System.out.print(anyObject);
    }
}