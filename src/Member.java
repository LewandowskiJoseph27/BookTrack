public class Member
{
    private static int id = 5000;
    private int userID;
    private String name;

    public Member(String _name)
    {
        userID = id++;
        name = _name;
    }

    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return userID;
    }

}
