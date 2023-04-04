package gui;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class MainMenu extends JPanel{
    private final Foods foods;
    private final Drinks drinks;
    private final Desserts desserts;
    private final JTabbedPane jTabbedPane;
    private final JTextField textField;
    private JTextField textFieldTable;
    private final JLabel lbl2, btn1, btn2, btn3;
    private final Color colorBlack, colorWhite;
    private double total;
    private final Sound sound;
    MainMenu(){
        setLayout(null);
        total = 0.00;
        colorBlack = new Color(0,0,0);
        colorWhite = new Color(255,255,255);
        sound = new Sound();
        setBackground(new Color(255, 89, 0));
        foods = new Foods();
        drinks = new Drinks();
        desserts = new Desserts();
        jTabbedPane = new JTabbedPane();
        textField = new JTextField();
        textFieldTable = new JTextField();
        lbl2 = new JLabel("Total", SwingConstants.CENTER);
        btn1 = new JLabel("Reset", SwingConstants.CENTER);
        btn2 = new JLabel("Exit", SwingConstants.CENTER);
        btn3 = new JLabel("Order", SwingConstants.CENTER);

        // ตั้งให้เมื่อเปิดโปรแกรมราคารวมเป็น 0.00 และโต๊ะเป็นค่าว่าง
        getTextField().setText("0.00");
        getTextFieldTable().setText("");

        // ตั้ง TabbedPane
        getjTabbedPane().add("Foods", getFoods());
        getjTabbedPane().add("Drinks", getDrinks());
        getjTabbedPane().add("Desserts", getDesserts());

        // ตั้งให้ JLabel มีสีพื้นหลังได้
        getBtn1().setOpaque(true);
        getBtn2().setOpaque(true);
        getLbl2().setOpaque(true);
        getBtn3().setOpaque(true);

        // เปลี่ยนสีพื้นหลัง
        getBtn1().setBackground(getColorWhite());
        getBtn2().setBackground(getColorWhite());
        getLbl2().setBackground(getColorWhite());
        getBtn3().setBackground(getColorWhite());

        // เปลี่ยนสีตัวอักษร
        getBtn1().setForeground(getColorBlack());
        getBtn2().setForeground(getColorBlack());
        getLbl2().setForeground(getColorBlack());
        getBtn3().setForeground(getColorBlack());

        // จัดวางตำแหน่ง x y และ ขนาด กว้าง สูง
        getjTabbedPane().setBounds(20,20,540,460);

        getLbl2().setBounds(20,500,100,20);
        getTextField().setBounds(140,500,120,20);
        getTextFieldTable().setBounds(140, 500,50,20);
        getTextFieldTable().setBounds(510, 20,50,20);
        getBtn1().setBounds(280,500,280,60);
        getBtn2().setBounds(20,540,100,20);
        getBtn3().setBounds(140,540,120,20);

        // เพิ่ม Widget
        add(getTextFieldTable());
        add(getjTabbedPane());
        add(getBtn1());
        add(getBtn2());
        add(getTextField());
        add(getLbl2());
        add(getBtn3());

        getTextField().setEditable(false);

        // Spinner Food 1
        getFoods().getSpinner1().addChangeListener(e -> calTotal());

        // Spinner Food 2
        getFoods().getSpinner2().addChangeListener(e -> calTotal());

        // Spinner Food 3
        getFoods().getSpinner3().addChangeListener(e -> calTotal());

        // Spinner Food 4
        getFoods().getSpinner4().addChangeListener(e -> calTotal());

        // Spinner Food 5
        getFoods().getSpinner5().addChangeListener(e -> calTotal());

        // Spinner Food 6
        getFoods().getSpinner6().addChangeListener(e -> calTotal());

        // Spinner Food 7
        getFoods().getSpinner7().addChangeListener(e -> calTotal());

        // Spinner Food 8
        getFoods().getSpinner8().addChangeListener(e -> calTotal());

        // Spinner Food 9
        getFoods().getSpinner9().addChangeListener(e -> calTotal());

        // Spinner Drink 1
        getDrinks().getSpinner1().addChangeListener(e -> calTotal());

        // Spinner Drink 2
        getDrinks().getSpinner2().addChangeListener(e -> calTotal());

        // Spinner Drink 3
        getDrinks().getSpinner3().addChangeListener(e -> calTotal());

        // Spinner Drink 4
        getDrinks().getSpinner4().addChangeListener(e -> calTotal());

        // Spinner Drink 5
        getDrinks().getSpinner5().addChangeListener(e -> calTotal());

        // Spinner Drink 6
        getDrinks().getSpinner6().addChangeListener(e -> calTotal());

        // Spinner Drink 7
        getDrinks().getSpinner7().addChangeListener(e -> calTotal());

        // Spinner Drink 8
        getDrinks().getSpinner8().addChangeListener(e -> calTotal());

        // Spinner Drink 9
        getDrinks().getSpinner9().addChangeListener(e -> calTotal());

        // Spinner Dessert 1
        getDesserts().getSpinner1().addChangeListener(e -> calTotal());

        // Spinner Dessert 2
        getDesserts().getSpinner2().addChangeListener(e -> calTotal());

        // Spinner Dessert 3
        getDesserts().getSpinner3().addChangeListener(e -> calTotal());

        // Spinner Dessert 4
        getDesserts().getSpinner4().addChangeListener(e -> calTotal());

        // Spinner Dessert 5
        getDesserts().getSpinner5().addChangeListener(e -> calTotal());

        // Spinner Dessert 6
        getDesserts().getSpinner6().addChangeListener(e -> calTotal());

        // Spinner Dessert 7
        getDesserts().getSpinner7().addChangeListener(e -> calTotal());

        // Spinner Dessert 8
        getDesserts().getSpinner8().addChangeListener(e -> calTotal());

        // Spinner Dessert 9
        getDesserts().getSpinner9().addChangeListener(e -> calTotal());

    }

    public Foods getFoods() {
        return foods;
    }

    public Drinks getDrinks() {
        return drinks;
    }

    public Desserts getDesserts() {
        return desserts;
    }

    public JTabbedPane getjTabbedPane() {
        return jTabbedPane;
    }

    public JTextField getTextField() {
        return textField;
    }

    public JLabel getLbl2() {
        return lbl2;
    }

    public JLabel getBtn1() {
        return btn1;
    }

    public JLabel getBtn2() {
        return btn2;
    }

    public Color getColorBlack() {
        return colorBlack;
    }

    public Color getColorWhite() {
        return colorWhite;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    //โค้ดคำนวนราคารวม
    public void calTotal(){
        setTotal(getFoods().getPrice1() * Double.parseDouble(getFoods().getSpinner1().getValue().toString())
                + getFoods().getPrice2() * Double.parseDouble(getFoods().getSpinner2().getValue().toString())
                + getFoods().getPrice3() * Double.parseDouble(getFoods().getSpinner3().getValue().toString())
                + getFoods().getPrice4() * Double.parseDouble(getFoods().getSpinner4().getValue().toString())
                + getFoods().getPrice5() * Double.parseDouble(getFoods().getSpinner5().getValue().toString())
                + getFoods().getPrice6() * Double.parseDouble(getFoods().getSpinner6().getValue().toString())
                + getFoods().getPrice7() * Double.parseDouble(getFoods().getSpinner7().getValue().toString())
                + getFoods().getPrice8() * Double.parseDouble(getFoods().getSpinner8().getValue().toString())
                + getFoods().getPrice9() * Double.parseDouble(getFoods().getSpinner9().getValue().toString())// Foods
                + getDrinks().getPrice1() * Double.parseDouble(getDrinks().getSpinner1().getValue().toString())
                + getDrinks().getPrice2() * Double.parseDouble(getDrinks().getSpinner2().getValue().toString())
                + getDrinks().getPrice3() * Double.parseDouble(getDrinks().getSpinner3().getValue().toString())
                + getDrinks().getPrice4() * Double.parseDouble(getDrinks().getSpinner4().getValue().toString())
                + getDrinks().getPrice5() * Double.parseDouble(getDrinks().getSpinner5().getValue().toString())
                + getDrinks().getPrice6() * Double.parseDouble(getDrinks().getSpinner6().getValue().toString())
                + getDrinks().getPrice7() * Double.parseDouble(getDrinks().getSpinner7().getValue().toString())
                + getDrinks().getPrice8() * Double.parseDouble(getDrinks().getSpinner8().getValue().toString())
                + getDrinks().getPrice9() * Double.parseDouble(getDrinks().getSpinner9().getValue().toString())// Drinks
                + getDesserts().getPrice1() * Double.parseDouble(getDesserts().getSpinner1().getValue().toString())
                + getDesserts().getPrice2() * Double.parseDouble(getDesserts().getSpinner2().getValue().toString())
                + getDesserts().getPrice3() * Double.parseDouble(getDesserts().getSpinner3().getValue().toString())
                + getDesserts().getPrice4() * Double.parseDouble(getDesserts().getSpinner4().getValue().toString())
                + getDesserts().getPrice5() * Double.parseDouble(getDesserts().getSpinner5().getValue().toString())
                + getDesserts().getPrice6() * Double.parseDouble(getDesserts().getSpinner6().getValue().toString())
                + getDesserts().getPrice7() * Double.parseDouble(getDesserts().getSpinner7().getValue().toString())
                + getDesserts().getPrice8() * Double.parseDouble(getDesserts().getSpinner8().getValue().toString())
                + getDesserts().getPrice9() * Double.parseDouble(getDesserts().getSpinner9().getValue().toString())// Desserts
        );
        getTextField().setText(String.format("%.2f", getTotal()));
        getSound().play("src/sound/tap.wav");
    }

    //โค้ดรีเซ็ตค่า
    public void clear(){
        getFoods().getSpinner1().setValue(0);
        getFoods().getSpinner2().setValue(0);
        getFoods().getSpinner3().setValue(0);
        getFoods().getSpinner4().setValue(0);
        getFoods().getSpinner5().setValue(0);
        getFoods().getSpinner6().setValue(0);
        getFoods().getSpinner7().setValue(0);
        getFoods().getSpinner8().setValue(0);
        getFoods().getSpinner9().setValue(0);
        getDrinks().getSpinner1().setValue(0);
        getDrinks().getSpinner2().setValue(0);
        getDrinks().getSpinner3().setValue(0);
        getDrinks().getSpinner4().setValue(0);
        getDrinks().getSpinner5().setValue(0);
        getDrinks().getSpinner6().setValue(0);
        getDrinks().getSpinner7().setValue(0);
        getDrinks().getSpinner8().setValue(0);
        getDrinks().getSpinner9().setValue(0);
        getDesserts().getSpinner1().setValue(0);
        getDesserts().getSpinner2().setValue(0);
        getDesserts().getSpinner3().setValue(0);
        getDesserts().getSpinner4().setValue(0);
        getDesserts().getSpinner5().setValue(0);
        getDesserts().getSpinner6().setValue(0);
        getDesserts().getSpinner7().setValue(0);
        getDesserts().getSpinner8().setValue(0);
        getDesserts().getSpinner9().setValue(0);
        calTotal();

    }

    //โค้ดสร้างใบเสร็จ
    public boolean writeFile(){
        try {
            if(getTotal() != 0 && Integer.parseInt(getTextFieldTable().getText()) > 0) {
                FileWriter myWriter = new FileWriter("src/gui/Bill.txt");
                myWriter.write(String.format("โต๊ะที่ %s%n", getTextFieldTable().getText()));
                if (Integer.parseInt(getFoods().getSpinner1().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getFoods().getSpinner1().getValue().toString(), getFoods().getLbl1().getText(), Double.parseDouble(getFoods().getSpinner1().getValue().toString()) * getFoods().getPrice1()));
                }
                if (Integer.parseInt(getFoods().getSpinner2().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getFoods().getSpinner2().getValue().toString(), getFoods().getLbl2().getText(), Double.parseDouble(getFoods().getSpinner2().getValue().toString()) * getFoods().getPrice2()));
                }
                if (Integer.parseInt(getFoods().getSpinner3().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getFoods().getSpinner3().getValue().toString(), getFoods().getLbl3().getText(), Double.parseDouble(getFoods().getSpinner3().getValue().toString()) * getFoods().getPrice3()));
                }
                if (Integer.parseInt(getFoods().getSpinner4().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getFoods().getSpinner4().getValue().toString(), getFoods().getLbl4().getText(), Double.parseDouble(getFoods().getSpinner4().getValue().toString()) * getFoods().getPrice4()));
                }
                if (Integer.parseInt(getFoods().getSpinner5().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getFoods().getSpinner5().getValue().toString(), getFoods().getLbl5().getText(), Double.parseDouble(getFoods().getSpinner5().getValue().toString()) * getFoods().getPrice5()));
                }
                if (Integer.parseInt(getFoods().getSpinner6().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getFoods().getSpinner6().getValue().toString(), getFoods().getLbl6().getText(), Double.parseDouble(getFoods().getSpinner6().getValue().toString()) * getFoods().getPrice6()));
                }
                if (Integer.parseInt(getFoods().getSpinner7().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getFoods().getSpinner7().getValue().toString(), getFoods().getLbl7().getText(), Double.parseDouble(getFoods().getSpinner7().getValue().toString()) * getFoods().getPrice7()));
                }
                if (Integer.parseInt(getFoods().getSpinner8().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getFoods().getSpinner8().getValue().toString(), getFoods().getLbl8().getText(), Double.parseDouble(getFoods().getSpinner8().getValue().toString()) * getFoods().getPrice8()));
                }
                if (Integer.parseInt(getFoods().getSpinner9().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getFoods().getSpinner9().getValue().toString(), getFoods().getLbl9().getText(), Double.parseDouble(getFoods().getSpinner9().getValue().toString()) * getFoods().getPrice9()));
                }

                if (Integer.parseInt(getDrinks().getSpinner1().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDrinks().getSpinner1().getValue().toString(), getDrinks().getLbl1().getText(), Double.parseDouble(getDrinks().getSpinner1().getValue().toString()) * getDrinks().getPrice1()));
                }
                if (Integer.parseInt(getDrinks().getSpinner2().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDrinks().getSpinner2().getValue().toString(), getDrinks().getLbl2().getText(), Double.parseDouble(getDrinks().getSpinner2().getValue().toString()) * getDrinks().getPrice2()));
                }
                if (Integer.parseInt(getDrinks().getSpinner3().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDrinks().getSpinner3().getValue().toString(), getDrinks().getLbl3().getText(), Double.parseDouble(getDrinks().getSpinner3().getValue().toString()) * getDrinks().getPrice3()));
                }
                if (Integer.parseInt(getDrinks().getSpinner4().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDrinks().getSpinner4().getValue().toString(), getDrinks().getLbl4().getText(), Double.parseDouble(getDrinks().getSpinner4().getValue().toString()) * getDrinks().getPrice4()));
                }
                if (Integer.parseInt(getDrinks().getSpinner5().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDrinks().getSpinner5().getValue().toString(), getDrinks().getLbl5().getText(), Double.parseDouble(getDrinks().getSpinner5().getValue().toString()) * getDrinks().getPrice5()));
                }
                if (Integer.parseInt(getDrinks().getSpinner6().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDrinks().getSpinner6().getValue().toString(), getDrinks().getLbl6().getText(), Double.parseDouble(getDrinks().getSpinner6().getValue().toString()) * getDrinks().getPrice6()));
                }
                if (Integer.parseInt(getDrinks().getSpinner7().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDrinks().getSpinner7().getValue().toString(), getDrinks().getLbl7().getText(), Double.parseDouble(getDrinks().getSpinner7().getValue().toString()) * getDrinks().getPrice7()));
                }
                if (Integer.parseInt(getDrinks().getSpinner8().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDrinks().getSpinner8().getValue().toString(), getDrinks().getLbl8().getText(), Double.parseDouble(getDrinks().getSpinner8().getValue().toString()) * getDrinks().getPrice8()));
                }
                if (Integer.parseInt(getDrinks().getSpinner9().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDrinks().getSpinner9().getValue().toString(), getDrinks().getLbl9().getText(), Double.parseDouble(getDrinks().getSpinner9().getValue().toString()) * getDrinks().getPrice9()));
                }

                if (Integer.parseInt(getDesserts().getSpinner1().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDesserts().getSpinner1().getValue().toString(), getDesserts().getLbl1().getText(), Double.parseDouble(getDesserts().getSpinner1().getValue().toString()) * getDesserts().getPrice1()));
                }
                if (Integer.parseInt(getDesserts().getSpinner2().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDesserts().getSpinner2().getValue().toString(), getDesserts().getLbl2().getText(), Double.parseDouble(getDesserts().getSpinner2().getValue().toString()) * getDesserts().getPrice2()));
                }
                if (Integer.parseInt(getDesserts().getSpinner3().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDesserts().getSpinner3().getValue().toString(), getDesserts().getLbl3().getText(), Double.parseDouble(getDesserts().getSpinner3().getValue().toString()) * getDesserts().getPrice3()));
                }
                if (Integer.parseInt(getDesserts().getSpinner4().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDesserts().getSpinner4().getValue().toString(), getDesserts().getLbl4().getText(), Double.parseDouble(getDesserts().getSpinner4().getValue().toString()) * getDesserts().getPrice4()));
                }
                if (Integer.parseInt(getDesserts().getSpinner5().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDesserts().getSpinner5().getValue().toString(), getDesserts().getLbl5().getText(), Double.parseDouble(getDesserts().getSpinner5().getValue().toString()) * getDesserts().getPrice5()));
                }
                if (Integer.parseInt(getDesserts().getSpinner6().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDesserts().getSpinner6().getValue().toString(), getDesserts().getLbl6().getText(), Double.parseDouble(getDesserts().getSpinner6().getValue().toString()) * getDesserts().getPrice6()));
                }
                if (Integer.parseInt(getDesserts().getSpinner7().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDesserts().getSpinner7().getValue().toString(), getDesserts().getLbl7().getText(), Double.parseDouble(getDesserts().getSpinner7().getValue().toString()) * getDesserts().getPrice7()));
                }
                if (Integer.parseInt(getDesserts().getSpinner8().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDesserts().getSpinner8().getValue().toString(), getDesserts().getLbl8().getText(), Double.parseDouble(getDesserts().getSpinner8().getValue().toString()) * getDesserts().getPrice8()));
                }
                if (Integer.parseInt(getDesserts().getSpinner9().getValue().toString()) > 0) {
                    myWriter.write(String.format("  %s  %s          %.2f%n", getDesserts().getSpinner9().getValue().toString(), getDesserts().getLbl9().getText(), Double.parseDouble(getDesserts().getSpinner9().getValue().toString()) * getDesserts().getPrice9()));
                }
                myWriter.write(String.format("Total %.2f", getTotal()));
                myWriter.close();
                getSound().play("src/sound/SAOMessage.wav");
                return true;
            }else {
                    getSound().play("src/sound/SAOMessage.wav");
                    return false;
            }
        } catch (IOException e) {
            getSound().play("src/sound/SAOMessage.wav");
            return false;
        }

    }

    public JLabel getBtn3() {
        return btn3;
    }

    public Sound getSound() {
        return sound;
    }

    public JTextField getTextFieldTable() {
        return textFieldTable;
    }
}
