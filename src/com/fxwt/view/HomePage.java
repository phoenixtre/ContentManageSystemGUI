package com.fxwt.view;
import javax.swing.*;
import java.awt.*;


public class HomePage {
    public static void createShow() {
        //创建JFrame实例
        JFrame frame = new JFrame("欢迎您");
        //设置窗体宽高
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null); //设置窗口居中显示
        //设置窗体禁止调节大小
        frame.setResizable(false);
        //创建面板
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);

        JLabel label = new JLabel("欢迎您!");
        label.setBounds(250, 0, 100, 25);
        label.setFont(new Font("微软雅黑", Font.BOLD, 25));
        label.setForeground(Color.red);
        jPanel.add(label);
        //关闭窗口结束程序
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        //显示窗口
        frame.setVisible(true);

        //添加面板
        frame.add(jPanel);
        //设置可见
        frame.setVisible(true);
    }
}

