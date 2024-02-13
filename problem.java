import java.util.Scanner;
import java.util.Random;
class game
{
    int number,input_no,noOfGuesses=0;
    game()
    {
        Random rand=new Random();
        this.number=rand.nextInt(100);
    }
    int get_noOfGuesses()
    {
        return noOfGuesses;
    }
    void user_input()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Guess The number: ");
        input_no=s.nextInt();
    }
    boolean is_correct()
    {   noOfGuesses++;
        if (input_no==number)
        {
            System.out.println("The number was "+this.number);
        return true;
        }

        else if(input_no<number)
        {
            System.out.println("Too low");
        }
        else if(input_no>number)
        {
            System.out.println("Too High");
        }
        return false;
        
    }
}

class problem
{
    public static void main(String[] args) 
    {

        game g=new game();
        boolean b=false;
        while(!b)
        {
        g.user_input();
        b=g.is_correct();
    }
    System.out.println("You got the answer in "+g.get_noOfGuesses()+" tries");
    }
}