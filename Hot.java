class Hot extends menu
{
    public Hot()
    {
        super();
    }
    
    public String setHotOptions()
    {
        int x;
        System.out.println("Here are our options for Hot drinks");
        for(x=0; x < HotOptions.length; x++)
        {
            System.out.println(HotOptions[x]);
        }
        System.out.println("Enter the number by the item you want: ");
        choice = kb.nextInt();
        ItemChoice = HotOptions[choice];
        return ItemChoice;
    }
    
}
