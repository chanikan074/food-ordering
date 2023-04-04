package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    private final JFrame frame, msg;
    private final MainMenu mainMenu;
    App(){
        frame = new JFrame("Chanikan Restaurant"); // ตั้งชื่อโปรแกรม
        frame.setIconImage(new ImageIcon("src/images/icon.jpg").getImage()); // ตั้งรูปไอคอนโปรแกรม
        mainMenu = new MainMenu();
        msg = new JFrame();
        getFrame().setSize(new Dimension(600, 640)); // ตั้งขนาดโปรแกรม
        getFrame().setResizable(false); // ตั้งให้ขยายโปรแกรมไม่ได้
        getFrame().setLocationRelativeTo(null); // ตั้งให้โปรแกรมอยู่ตรงกลางจอ
        getFrame().setDefaultCloseOperation(getFrame().EXIT_ON_CLOSE); // ตั้งให้โปรแกรมคืนแรมเมื่อถูกปิด
        getFrame().add(getMainMenu()); // เพิ่ม JPanel ในหน้าโปรแกรม
        getFrame().setVisible(true); // ตั้งให้เห็นโปรแกรม

        // เพิ่มตัวรับฟังเหตุการณ์ที่เกิดขึ้นกับ Btn1 คือ Reset
        getMainMenu().getBtn1().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getMainMenu().clear();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                getMainMenu().clear();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getMainMenu().getBtn1().setBackground(getMainMenu().getColorBlack());
                getMainMenu().getBtn1().setForeground(getMainMenu().getColorWhite());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getMainMenu().getBtn1().setBackground(getMainMenu().getColorWhite());
                getMainMenu().getBtn1().setForeground(getMainMenu().getColorBlack());
            }
        });

        // เพิ่มตัวรับฟังเหตุการณ์ที่เกิดขึ้นกับ Btn2 คือ Exit
        getMainMenu().getBtn2().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getMainMenu().getBtn2().setBackground(getMainMenu().getColorBlack());
                getMainMenu().getBtn2().setForeground(getMainMenu().getColorWhite());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getMainMenu().getBtn2().setBackground(getMainMenu().getColorWhite());
                getMainMenu().getBtn2().setForeground(getMainMenu().getColorBlack());
            }
        });

        // เพิ่มตัวรับฟังเหตุการณ์ที่เกิดขึ้นกับ Btn3 คือ Order
        getMainMenu().getBtn3().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //เริ่มอัลกอริทึมหลัก
                if(getMainMenu().writeFile()){
                    JOptionPane.showMessageDialog(getMsg(),"Order Successfully.","Alert",JOptionPane.WARNING_MESSAGE);
                    getMainMenu().clear();
                }else {
                    JOptionPane.showMessageDialog(getMsg(),"Order Failed.","Alert",JOptionPane.ERROR_MESSAGE);
                }
                //จบอัลกอริทึมหลัก
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(getMainMenu().writeFile()){
                    JOptionPane.showMessageDialog(getMsg(),"Order Successfully.","Alert",JOptionPane.WARNING_MESSAGE);
                    getMainMenu().clear();
                }else {
                    JOptionPane.showMessageDialog(getMsg(),"Order Failed.","Alert",JOptionPane.ERROR_MESSAGE);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getMainMenu().getBtn3().setBackground(getMainMenu().getColorBlack());
                getMainMenu().getBtn3().setForeground(getMainMenu().getColorWhite());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getMainMenu().getBtn3().setBackground(getMainMenu().getColorWhite());
                getMainMenu().getBtn3().setForeground(getMainMenu().getColorBlack());
            }
        });
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(App::new);
    }

    public JFrame getFrame() {
        return frame;
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

    public JFrame getMsg() {
        return msg;
    }
}
