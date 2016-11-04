/**
 * Created by Zou on 2016/11/4.
 */
import java.util.*;
public class Calculator {
    public double GetResult(String temp){
        if(""==temp.trim()) return 0;
        Stack<Object> SNum = new Stack();
        Stack<Object> SOp = new Stack();
        SNum.removeAllElements();
        SOp.removeAllElements();
        String Snum="";
        double Inum=0;
        for(int i=0;i<temp.length();i++)
        {
            char c = temp.charAt(i);
            if(c=='+'||c=='-')
            {
                Inum=Double.parseDouble(Snum);
                if(SOp.empty())
                    SNum.push(Inum);
                else
                {
                    switch((char)SOp.peek())
                    {
                        case '+':
                            SNum.push((double)SNum.pop()+Inum);
                            SOp.pop();
                            break;
                        case '-':
                            SNum.push((double)SNum.pop()-Inum);
                            SOp.pop();
                            break;
                        case '*':
                            SNum.push((double)SNum.pop()*Inum);
                            SOp.pop();
                            break;
                        case '/':
                            SNum.push((double)SNum.pop()/Inum);
                            SOp.pop();
                            break;
                    }
                }
                switch (c)
                { case '+':
                    SOp.push('+');
                    break;
                    case '-':
                        SOp.push('-');
                        break;
                }
                Snum="";
            }
            else if(c=='*'||c=='/')
            {
                Inum=Double.parseDouble(Snum);
                if(SOp.empty())
                    SNum.push(Inum);
                else
                {
                    switch((char)SOp.peek())
                    { case '*':
                        SNum.push((double)SNum.pop()*Inum);
                        SOp.pop();
                        break;
                        case '/':
                            SNum.push((double)SNum.pop()/Inum);
                            SOp.pop();
                            break;
                        default:
                            SNum.push(Inum);
                            break;
                    }
                }
                switch (c)
                {
                    case '*':
                        SOp.push('*');
                        break;
                    case '/':
                        SOp.push('/');
                        break;
                }
                Snum="";
            }
            else
            {
                Snum=Snum+c;
            }
        }
        SNum.push(Double.parseDouble(Snum));
        double a,b;
        while(!SOp.empty()) {
            a = (double) SNum.pop();
            b = (double) SNum.pop();
            switch ((char) SOp.pop()) {
                case '+':
                    SNum.push(b + a);
                    break;
                case '-':
                    SNum.push(b - a);
                    break;
                case '*':
                    SNum.push(b * a);
                    break;
                case '/':
                    SNum.push(b / a);
                    break;
            }
        }
        return (double)SNum.pop();
    }
}