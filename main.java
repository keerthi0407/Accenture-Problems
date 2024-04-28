//mail: aravindvamsee106@gmail.com

//aravind.harinath@faceacademy.in

 

import java.util.*;

public class main
{
  static int precedence(char ch){
    
    if(ch=='+' || ch=='-')
      return 1;
    if(ch=='*' || ch=='/' || ch=='%')
      return 2;
    if(ch=='^')
      return 3;
    
    return -1;
  }
  static boolean isoperator(char ch)
  {
    return ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%' || ch=='^';
  }
  
  static String postfix(String infix)
  {
    int n = infix.length();// 1+2-(3*4
    if(n==0) // 12+34*(-
      return "";
    Stack<Character> s = new Stack<>();
    String op = "";
    for(int i=0;i<n;i++)
    {
      char ch = infix.charAt(i);
      if(ch==' ')
        continue;
      if(isoperator(ch))
      {
        while(!s.empty() && precedence(ch)<=precedence(s.peek()))
          op+=s.pop();
      
        s.push(ch);
      }
     else if(ch=='(')
        s.push(ch);
      else if(ch==')')
      {
        while(!s.empty() && s.peek()!='(')
          op+=s.pop();
          
        if(!s.empty())
          s.pop();
      }
      else
        op+=ch;
    }
    while(!s.empty())
    {
      if(s.peek()=='(')
        return "Invalid Expression";
      op+=s.pop();
    }
    return op;
  }
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String infix = sc.nextLine();
    System.out.println(postfix(infix));
  }
}

 

-----------------------------------------------------------

 

import java.util.*;

public class Main
{
  static int evaluation(String postfix)
  {
    int n = postfix.length();
    if(n==0)
      return 0;
    Stack<Integer> s = new Stack<>();
    int temp = 0;
    for(int i=0;i<n;i++)
    {
      char ch = postfix.charAt(i);
      if(ch==' ')
      {
        if(temp!=0)
          s.push(temp);
        System.out.println(s);
        temp = 0;
        continue;
      }
      else if(temp==0 && ch=='0' && (i+1)<n && postfix.charAt(i+1)==' ')
        s.push(0);
      else if(ch>='0' && ch<='9')
      {
        temp= temp*10+(ch-'0');
      }
      else
      {
        int a = s.pop();
        int b = s.pop();
        if(ch=='+')
          s.push(b+a);
        else if(ch=='-')
          s.push(b-a);
        else if(ch=='*')
          s.push(b*a);
        else if(ch=='/')
        {
          if(a==0)
          {
            System.out.println("Cannot divide by zero");
            return 0;
          }
          s.push((int)b/a);
        }
        else if(ch=='%')
          s.push(b%a);
          
      }
      
    }
    return s.peek();
  }
  static int precedence(char ch){
    
    if(ch=='+' || ch=='-')
      return 1;
    if(ch=='*' || ch=='/' || ch=='%')
      return 2;
    if(ch=='^')
      return 3;
    
    return -1;
  }
  static boolean isoperator(char ch)
  {
    return ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%' || ch=='^';
  }
  
  static String postfix(String infix)
  {
    int n = infix.length();// 1+2-(3*4
    if(n==0) // 12+34*(-
      return "";
    Stack<Character> s = new Stack<>();
    String op = "";
    for(int i=0;i<n;i++)
    {
      char ch = infix.charAt(i);
      if(ch==' ')
        continue;
      if(isoperator(ch))
      {
        while(!s.empty() && precedence(ch)<=precedence(s.peek()))
          op+=" "+s.pop();
      
        s.push(ch);
        op+=" ";
      }
     else if(ch=='(')
        s.push(ch);
      else if(ch==')')
      {
        while(!s.empty() && s.peek()!='(')
          op+=" "+s.pop();
          
        if(!s.empty())
          s.pop();
      }
      else
        op+=ch;
    }
    while(!s.empty())
    {
      if(s.peek()=='(')
        return "Invalid Expression";
      op+=" "+s.pop();
    }
    System.out.println(op);
    return op;
  }
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String infix = sc.nextLine();
    System.out.println(evaluation(postfix(infix)));
    // System.out.println(postfix(infix));
  }
}
