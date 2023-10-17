class Cold extends menu
{
    public Cold()
    {
        super();
    }

    public String setColdOptions()
    {
        int x;
        System.out.println("Here are our options for cold drinks");
        for(x=0; x < ColdOptions.length; x++)
        {
            System.out.println(ColdOptions[x]);
        }
        System.out.println("Enter the number by the item you want: ");
        choice = kb.nextInt();
        ItemChoice = ColdOptions[choice];
        return ItemChoice;
    }
}
