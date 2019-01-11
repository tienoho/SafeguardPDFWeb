package vn.ted.pdf.utils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Scanner;

public class tool {
    public static java.sql.Date GetDateNow()
    {
        java.util.Date myDate = (Calendar.getInstance().getTime());
        java.sql.Date sqlDateNow = new java.sql.Date(myDate.getTime());
        return sqlDateNow;
    }
    public String OpenUrl(String url){
        String content="";
        try {
            URL myURL = new URL(url);
            URLConnection myURLConnection = myURL.openConnection();
            myURLConnection.connect();
            Scanner scanner = new Scanner(myURLConnection.getInputStream());
            scanner.useDelimiter("\\Z");
            content = scanner.next();
            scanner.close();
        }
        catch (MalformedURLException e) {
            // new URL() failed
            // ...
            System.out.println("Url not format");
        }
        catch (IOException e) {
            // openConnection() failed
            // ...
            System.out.println("Connection Failed");
        }
        return content;
    }

    public void CheckTheContents(String content){
        String[] contents;
        String[] SubContents;
        if(content.startsWith("OK")){
            contents=content.split("\n");
            for(String str:contents){
                System.out.println(str);
                SubContents=str.split("\" \"");
                for(String strSub:SubContents){
                    System.out.println(strSub);
                }
            }
        }
    }
    public static void main(String[] args) {
        String url="https://www.locklizard-evals.com/enterprise5/Interop.php?un=vsdzung-ted&pw=k7pq0zxhd4&action=list_customers";
        tool tool=new tool();
        String content=tool.OpenUrl(url);
        tool.CheckTheContents(content);
        System.out.println();
    }
}
