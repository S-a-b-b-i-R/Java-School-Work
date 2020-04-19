public class ForSwitch {
    public static void main(String[] args)
    {
        int i;
        String Letter = "";
        for ( i = 0; i <= 5; i++)
        {
            switch(i)
            {
                case 1:
                    Letter = "A";
                    break;
                case 2:
                    Letter = "B";
                    break;
                case 3:
                    Letter = "C";
                    break;
                case 4:
                    Letter = "D";
                    break;
                case 5:
                    Letter = "E";
                    break;
            }
            System.out.println(Letter);
        }
    }
}
