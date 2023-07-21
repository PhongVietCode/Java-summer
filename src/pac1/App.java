package pac1;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;


public class App {
    
    public static void main(String[] args) throws Exception {
        
    }

    public static void scan(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name ?");
        String name = scanner.nextLine();
        System.out.println("Your age ?");
        int age = scanner.nextInt();
        System.out.println("Your name is:" + name);
        System.out.println("Your age is: " + age);
        scanner.close();
    }

    public static void GUI(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "hello" + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "Your age: " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "Your heihgt: " + height);
    }

    public static void math(String[] args) {
        double x;
        double y;
        double z;

        Scanner sc = new Scanner(System.in);
        System.out.println("input x: ");
        x = sc.nextDouble();
        System.out.println("input y: ");
        y = sc.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
        System.out.println(z);
        sc.close();
    }

    public static void func2(String[] args) {
        String x = "water";
        String y = "Kool-Aid";
        String z = x;
        x = y;
        y = z;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    public static void random(String[] args) {
        Random random = new Random();
        int x = random.nextInt(6) + 1;

        System.out.println(x);
    }

    public static void statement(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age: ");
        // int age = sc.nextInt();
        String res = sc.nextLine();
        // if (res.equals("q") || res.equals("Q")) {
        // System.out.println("Quit the game");
        // } else {
        // System.out.println("You are playing");
        // }
        System.out.println("enter your name: ");
        while (!res.equals("z")) {
            res = sc.nextLine();
            System.out.println("Your name is: " + res);
        }
        System.out.println("Quitted");
        sc.close();
    }

    public static void array(String[] args) {
        String[] cars = new String[3];
        cars[0] = "Audi";
        cars[1] = "Vinfast";
        for (int i = 0; i < 3; i++) {
            System.out.println(cars[i]);
        }
    }

    public static void string(String[] args) {
        String name = "phong";
        boolean res = name.equalsIgnoreCase("phOnG");
        System.out.println(res);
    }

    public static void wrp(String[] args) {
        // Boolean a = true;
        // Character b = 'q';
        // Integer c = 10;
        // Double d = 2.13;

        // Wrapper class have useful method, autoboxing, unboxing features.
        // but it takes more step to access the value
        // Object is created to stored in arrayList or vector, or synchronization in
        // multithreading.

        ArrayList<String> food = new ArrayList<String>();

        food.add("Phong");
        food.add("pizza");
        food.add("hamburger");
        for (String string : food) {
            System.out.println(string);
        }
    }

    static void mth() {
        System.out.printf("hello %10d\n", 1);
        System.out.printf("hello %,.19f", 13218.131);
        // final double PI = 2.21;

    }

}
