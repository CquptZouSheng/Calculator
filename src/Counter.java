/**
 * Created by Zou on 2016/11/4.
 */

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Subject subject=new Subject();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入表达式：");
        String temp=scanner.next();
        System.out.println(subject.GetResult(temp));
    }
}