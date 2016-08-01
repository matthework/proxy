package proxy;

import java.io.*;

public class KeywordsFilter{

    String [] kw = {"Password", "Address", "Salary", "Credit Card","Amount", 
    				"Medical History", "Sex", "Health", "Weapon"};

    public String filterKeywords(String pageStr) {

       // System.out.println(pageStr);

       // for (String s : kw) {
       //     String bstr = "<input class=\"button-r\" onclick='responsiveVoice.speak(\"hello world\");' type='button' value='XXXXXX' />";
       //     pageStr = pageStr.replaceAll(s, bstr);
       // }
       // System.out.println(pageStr);
        return pageStr;

    }

}