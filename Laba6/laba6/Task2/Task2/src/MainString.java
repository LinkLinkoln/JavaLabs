public class MainString implements StringOperations
{
    private char[] characters;
    private int length;

    public MainString()
    {
        characters = new char[0];
        length = 0;
    }

    public MainString(String literal)
    {
        characters = literal.toCharArray();
        length = characters.length;
    }

    public MainString(char character)
    {
        characters = new char[]{character};
        length = 1;
    }

    @Override
    public int getLength()
    {
        return length;
    }

    @Override
    public void clear()
    {
        characters = new char[0];
        length = 0;
    }

    @Override
    public boolean contains(char character)
    {
        for (char c : characters)
        {
            if (c == character)
            {
                return true;
            }
        }
        return false;
    }
}
