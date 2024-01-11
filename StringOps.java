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
        int[]array =(allIndexOf("hello world", 'o'));
        for(int i=0;i<3;i++)
            System.out.println(array[i]);
        }

    public static String capVowelsLowRest (String string)
     {
        String newstr = "";
        String vowels="aeiouAEIOU";
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
      
       while(counter<string.length())
       {
            counter++;
            answer=answer+upperCase(string.charAt(counter));
            counter++;

            while (counter<string.length()&& string.charAt(counter)!=32)
                {
                    answer=answer+lowerCase(string.charAt(counter));
                    counter++;
                }
        }
        return answer;
    }
    public static int[] allIndexOf (String string, char chr) {
       int counter=0;
        for (int i=0; i<string.length();i++)
        {
            if(string.charAt(i)==chr)
            {
                counter++;
            }
        }
        int[] array = new int[counter];
        int j=0;
        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i)==chr)
            {            
                    array[j]=i;
                    j++;
            }
        }
        return array;
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
    
    public static char upperCase(char s)
 { 
          char c = s;
          if (c>=97 && c<=122)
          {
                c=(char)(c-32); 
          }
        return c;
    } 
    
}

