public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string)
     {
        String newstr = "";
        String vowels="aeiou";
        for(int i =0; i<string.length();i++)
        {
                 if (vowels.indexOf(string.charAt(i))!=-1)// is a vowel
            {
            newstr= newstr+upperCase(string.charAt(i));
            }
            else
            {
                if(string.charAt(i)==32)
                    newstr= newstr+string.charAt(i);
                else
                newstr= newstr+lowerCase(string.charAt(i));
            }
        }

        return newstr;
    }

    public static String camelCase (String string) {
       String answer ="";
       int counter = 0;
       while(string.charAt(counter)==32 && counter<string.length())
       {
        counter++;
       }
       while(string.charAt(counter)!=32 && counter<string.length())
       {
        answer=answer+lowerCase(string.charAt(counter));
        counter++;
       }
       for (int i=counter; i<string.length();i++)
       {
        answer=answer+upperCase(string.charAt(i));
        i++;
       while(string.charAt(i)==32&& counter<string.length())
        {
            answer=answer+lowerCase(string.charAt(i));
            i++;
        }
        while(string.charAt(i)==32 && counter<string.length())
       {
         i++;
       }

    }
        return answer;
    }

    public static int[] allIndexOf (String string, char chr) {
        int[] array = new int[string.length()];
        String draft=string;
        int counter=0;
        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i)==chr)
            {
                array[counter]=draft.indexOf(chr);
                counter++;
                draft="";
                for (int j=0;j<draft.length();j++)
                {
                    if (i==j)
                    {
                     draft=draft+(string.charAt(i)+1);
                    }
                    else
                    {
                    draft=draft+string.charAt(i);
                    }
                }

            }
        }
        int[] answer = new int[counter];
        for(int i=0;i<answer.length;i++)
        {
            answer[i]=array[i];
        }

        return answer;
    }
    public static String lowerCase(String s) 
    {
        String answer = "";
        for (int i=0; i<s.length();i++)
        {
          char c = s.charAt(i);
          if (c>=65 && c<=90)
          {
                c=(char)(c+32); 
          }
            answer=answer+c;
        }
        return answer;
    }
    public static char lowerCase(char s) 
    {
        char c=s;
          if (c>=65 && c<=90)
          {
                c=(char)(c+32); 
          }        
        return c;
    }
    
public static String upperCase(String s)
 {
        String answer = "";
        for (int i=0; i<s.length();i++)
        {
          char c = s.charAt(i);
          if (c>=97 && c<=122)
          {
                c=(char)(c-32); 
          }
            answer=answer+c;
        }
        return answer;
    }
    public static char upperCase(char s)
 { 
          char c = s;
          if (c>=97 && c<=122)
          {
                c=(char)(c-32); 
          }
        return c;
    }
    
    public static String uniqueChars(String s) {
        String answer="";
        for (int i=0; i<s.length();i++)
        {
            char c = s.charAt(i);
            if( c == 32|| answer.indexOf(c)==-1)
                answer=answer+c;
        }
        return answer;
    }
    
}

