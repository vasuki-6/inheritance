class Father{
void job()
{
System.out.println("retired professor");
}
void hobby()
{
System.out.println("news paper tv watching");
}
void property()
{
System.out.println("a house in native village");
}
}
class Daughter extends Father
{
void job()
{
System.out.println("no job -student");
}
void hobby()
{
System.out.println("playing games,social media");
}
void property()
{
System.out.println("nooo property");
}
public static void main(String[] args)
{
Father f1 = new Father();
f1.job();
f1.hobby();
f1.property();
Daughter d = new Daughter();
d.job();
d.hobby();
d.property();
Father f2= new Daughter();
f2.job();
f2.hobby();
f2.property();
}
}
