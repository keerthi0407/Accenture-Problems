import java.util.*;
public class infixpost 
{

    static int preced(char a)
    {
        if(a=='+' || a=='-') return 1;
        if(a=='*' || a=='/' || a=='%') return 2;
        if(a=='^') return 3;
        return -1;
    }
    public static String postfix(String s)
    {
        if(s.length()==0) return " ";
        Stack<Character> stk=new Stack<>();
        String exp="";
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==' ') continue;
            if(c=='(') stk.push(c);
            if(c==')')
            {
                while(!stk.isEmpty() && stk.peek()!='(')
                {
                    exp+=stk.pop();
                }

            }
            if(c>='0' && c<='9') exp+=c;
            //operator
            else{
                exp+=':';
                while(!stk.isEmpty() && preced(c)<=preced(stk.peek()))
                {
                   // exp+=':';
                    exp+=stk.pop();
                }
                stk.push(c);
            }
            

        }
        while(!stk.isEmpty())
        {
            if(stk.peek()=='(') return "Invaid";
            exp+=stk.pop();
        }
        return exp;

    }
    static int evalu(String post)
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<post.length();i++)
        {
            char ch=post.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%' || ch=='^')
            {
                int a=st.pop();
                int b=st.pop();
                switch(ch) {
                    
                    case '+':
                      // code block
                      
                      st.push(b+a);
                      break;
                    case '-':
                    
                    st.push(b-a);
                      break;
                      case '/':
                      // code block
                      
                      st.push(b/a);
                      break;
                      case '*':
                      
                      st.push(b*a);
                      break;
                    
                  }
            }
            else if(ch>='0' && ch<='9') {
                int temp=0;
               
             
        } 
    }
        public static void main(String[] args) {
        String infix="12*6/3";
        System.out.println(postfix(infix));

    }
}
