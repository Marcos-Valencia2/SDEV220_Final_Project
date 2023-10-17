
class muffin extends menu
{
    
    public muffin()
    {
        super();
    }
    public String setMuffin() 
    {
        int x;
        System.out.println("Here are our options for muffins");
        for(x=0; x < muffin.length; x++)
        {
            System.out.println(muffin[x]);
        }
        System.out.println("Enter the number by the item you want: ");
        choice = kb.nextInt();
        ItemChoice = muffin[choice];
        return ItemChoice;
    }
}
