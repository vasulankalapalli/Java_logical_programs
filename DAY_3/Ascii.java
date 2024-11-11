//35. Write a JAVAprogram to print all ASCII character with their values.
class Ascii 
{
    public static void main(String[] args) 
    {
        int i;
        System.out.println("ASCII Table:");
        System.out.println("Value \t Character");
        for (i = 0; i <= 127; i++) 
        {
            System.out.println(i + "\t" + (char) i);
        }
    }
}