
import java.util.*;
class reverse
{
public static void main(String[] args)
{
	String s = "TUF is great      for interview    preparation";
	System.out.println("After reversing words: ");
	System.out.println(s);
	s += " ";
	Stack<String> st = new Stack<String>();
	int i;
	String str = "";
	for (i = 0;i < s.length();i++)
	{
		if (s.charAt(i) == ' ' & str!="")
		{
			st.push(str);
			str = ""; 
		}else if (s.charAt(i)==' '){
            continue;
		}
		else
		{
			str += s.charAt(i);
		}
	}
	String ans = "";
	int k=0;
	while (st.size() != 1)
	{   
        System.out.println(k+st.peek());
		ans += st.peek() + " ";
		st.pop();
		k++;
	}
	System.out.println(k+st.peek());
	ans += st.peek(); // The last word should'nt have a space after it
	System.out.println("After reversing words: ");
	System.out.print(ans);
}
}