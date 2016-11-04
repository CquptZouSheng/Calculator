/**
 * Created by Zou on 2016/11/4.
 */

import java.util.Scanner;

public class Subject {
    public static void main(String[] args) {
        Calculator calculator =new Calculator();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入表达式：");
        String temp=scanner.next();
        System.out.println(calculator.GetResult(temp));
    }
}