namespace Lab2_4;

public interface IChangingString
{
    int Length { get; }
    void Change(char c);
    string ToString();
}