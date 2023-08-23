public class IsLowerUpperNumber
{
public static void main(String[] args) {

    char c='Z';
    if(c>='a' && c<='z')
    {
        System.out.println(c+" is LowerCase Letter");
    }
    
    else if(c>='A' && c<='Z')
    {
        System.out.println(c+" is UpperCase Letter");
    }
    else if(c>='0' && c<='9')
    {
        System.out.println(c+" is Number");
    }
    else if('c'==' ')
    {
        System.out.println("You have entered Space.");
    }
    else
    {
        System.out.println("Symbol");
    }
    
}
}