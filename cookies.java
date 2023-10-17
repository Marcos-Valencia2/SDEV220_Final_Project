class cookies extends menu
{
    public cookies()
    {
        super();
    }
    public String setCookies()
    {
        int x;
        System.out.println("Here are our options for Cookies");
        for(x=0; x < Cookies.length; x++)
        {
            System.out.println(Cookies[x]);
        }
        System.out.println("Enter the number by the item you want: ");
        choice = kb.nextInt();
        ItemChoice = Cookies[choice];
        return ItemChoice;
    }
    
}
