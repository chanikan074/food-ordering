package gui;

import javax.swing.*;
import java.awt.*;

public class Drinks extends JPanel {
    private final SpinnerModel spinnerModel1, spinnerModel2, spinnerModel3, spinnerModel4, spinnerModel5, spinnerModel6, spinnerModel7, spinnerModel8, spinnerModel9;
    private final JSpinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7, spinner8, spinner9;
    private final JLabel img1, img2, img3, img4, img5, img6, img7, img8, img9;
    private final JLabel lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9;
    private final double price1, price2, price3, price4, price5, price6, price7, price8, price9;
    private final Color colorBlack, colorWhite;
    Drinks(){
        setLayout(null);
        colorBlack = new Color(0,0,0);
        colorWhite = new Color(255,255,255);
        setBackground(getColorWhite());
        price1 = 89.0;
        price2 = 89.0;
        price3 = 89.0;
        price4 = 99.0;
        price5 = 99.0;
        price6 = 99.0;
        price7 = 89.0;
        price8 = 89.0;
        price9 = 65.0;

        spinnerModel1 = new SpinnerNumberModel(0,0,100,1);
        spinnerModel2 = new SpinnerNumberModel(0,0,100,1);
        spinnerModel3 = new SpinnerNumberModel(0,0,100,1);
        spinnerModel4 = new SpinnerNumberModel(0,0,100,1);
        spinnerModel5 = new SpinnerNumberModel(0,0,100,1);
        spinnerModel6 = new SpinnerNumberModel(0,0,100,1);
        spinnerModel7 = new SpinnerNumberModel(0,0,100,1);
        spinnerModel8 = new SpinnerNumberModel(0,0,100,1);
        spinnerModel9 = new SpinnerNumberModel(0,0,100,1);

        spinner1 = new JSpinner(getSpinnerModel1());
        spinner2 = new JSpinner(getSpinnerModel2());
        spinner3 = new JSpinner(getSpinnerModel3());
        spinner4 = new JSpinner(getSpinnerModel4());
        spinner5 = new JSpinner(getSpinnerModel5());
        spinner6 = new JSpinner(getSpinnerModel6());
        spinner7 = new JSpinner(getSpinnerModel7());
        spinner8 = new JSpinner(getSpinnerModel8());
        spinner9 = new JSpinner(getSpinnerModel9());

        img1 = new JLabel(new ImageIcon("src/images/Drinks/Grape red tea.png"));
        img2 = new JLabel(new ImageIcon("src/images/Drinks/Orange red tea.png"));
        img3 = new JLabel(new ImageIcon("src/images/Drinks/Plum red tea.png"));
        img4 = new JLabel(new ImageIcon("src/images/Drinks/Green milk tea.png"));
        img5 = new JLabel(new ImageIcon("src/images/Drinks/Hojicha milk tea.png"));
        img6 = new JLabel(new ImageIcon("src/images/Drinks/Sweet potato milk tea.png"));
        img7 = new JLabel(new ImageIcon("src/images/Drinks/Latte.png"));
        img8 = new JLabel(new ImageIcon("src/images/Drinks/Matcha milk tea.png"));
        img9 = new JLabel(new ImageIcon("src/images/Drinks/Milk tea.png"));

        lbl1 = new JLabel("Grape red tea", SwingConstants.CENTER);
        lbl2 = new JLabel("Orange red tea", SwingConstants.CENTER);
        lbl3 = new JLabel("Plum red tea", SwingConstants.CENTER);
        lbl4 = new JLabel("Green milk tea", SwingConstants.CENTER);
        lbl5 = new JLabel("Hojicha milk tea", SwingConstants.CENTER);
        lbl6 = new JLabel("Sweet potato milk tea", SwingConstants.CENTER);
        lbl7 = new JLabel("Latte", SwingConstants.CENTER);
        lbl8 = new JLabel("Matcha milk tea", SwingConstants.CENTER);
        lbl9 = new JLabel("Milk tea", SwingConstants.CENTER);

        getLbl1().setToolTipText("Grape red tea");
        getLbl2().setToolTipText("Orange red tea");
        getLbl3().setToolTipText("Plum red tea");
        getLbl4().setToolTipText("Green milk tea");
        getLbl5().setToolTipText("Hojicha milk tea");
        getLbl6().setToolTipText("Sweet potato milk tea");
        getLbl7().setToolTipText("Latte");
        getLbl8().setToolTipText("Matcha milk tea");
        getLbl9().setToolTipText("Milk tea");

        getImg1().setToolTipText("Grape red tea");
        getImg2().setToolTipText("Orange red tea");
        getImg3().setToolTipText("Plum red tea");
        getImg4().setToolTipText("Green milk tea");
        getImg5().setToolTipText("Hojicha milk tea");
        getImg6().setToolTipText("Sweet potato milk tea");
        getImg7().setToolTipText("Latte");
        getImg8().setToolTipText("Matcha milk tea");
        getImg9().setToolTipText("Milk tea");

        // Set Position Spinner
        getSpinner1().setBounds(130,70,50,30);
        getSpinner2().setBounds(300,70,50,30);
        getSpinner3().setBounds(470,70,50,30);

        getSpinner4().setBounds(130,210,50,30);
        getSpinner5().setBounds(300,210,50,30);
        getSpinner6().setBounds(470,210,50,30);

        getSpinner7().setBounds(130,350,50,30);
        getSpinner8().setBounds(300,350,50,30);
        getSpinner9().setBounds(470,350,50,30);

        // Set Position Image
        getImg1().setBounds(20,20,100,100);
        getImg2().setBounds(190,20,100,100);
        getImg3().setBounds(360,20,100,100);

        getImg4().setBounds(20,160,100,100);
        getImg5().setBounds(190,160,100,100);
        getImg6().setBounds(360,160,100,100);

        getImg7().setBounds(20,300,100,100);
        getImg8().setBounds(190,300,100,100);
        getImg9().setBounds(360,300,100,100);

        // Set Position Label
        getLbl1().setBounds(20,120,100,20);
        getLbl2().setBounds(190,120,100,20);
        getLbl3().setBounds(360,120,100,20);

        getLbl4().setBounds(20,260,100,20);
        getLbl5().setBounds(190,260,100,20);
        getLbl6().setBounds(360,260,100,20);

        getLbl7().setBounds(20,400,100,20);
        getLbl8().setBounds(190,400,100,20);
        getLbl9().setBounds(360,400,100,20);

        getLbl1().setOpaque(true);
        getLbl2().setOpaque(true);
        getLbl3().setOpaque(true);
        getLbl4().setOpaque(true);
        getLbl5().setOpaque(true);
        getLbl6().setOpaque(true);
        getLbl7().setOpaque(true);
        getLbl8().setOpaque(true);
        getLbl9().setOpaque(true);

        getLbl1().setBackground(getColorBlack());
        getLbl2().setBackground(getColorBlack());
        getLbl3().setBackground(getColorBlack());
        getLbl4().setBackground(getColorBlack());
        getLbl5().setBackground(getColorBlack());
        getLbl6().setBackground(getColorBlack());
        getLbl7().setBackground(getColorBlack());
        getLbl8().setBackground(getColorBlack());
        getLbl9().setBackground(getColorBlack());

        getLbl1().setForeground(getColorWhite());
        getLbl2().setForeground(getColorWhite());
        getLbl3().setForeground(getColorWhite());
        getLbl4().setForeground(getColorWhite());
        getLbl5().setForeground(getColorWhite());
        getLbl6().setForeground(getColorWhite());
        getLbl7().setForeground(getColorWhite());
        getLbl8().setForeground(getColorWhite());
        getLbl9().setForeground(getColorWhite());

        add(getImg1());
        add(getImg2());
        add(getImg3());
        add(getImg4());
        add(getImg5());
        add(getImg6());
        add(getImg7());
        add(getImg8());
        add(getImg9());

        add(getSpinner1());
        add(getSpinner2());
        add(getSpinner3());
        add(getSpinner4());
        add(getSpinner5());
        add(getSpinner6());
        add(getSpinner7());
        add(getSpinner8());
        add(getSpinner9());

        add(getLbl1());
        add(getLbl2());
        add(getLbl3());
        add(getLbl4());
        add(getLbl5());
        add(getLbl6());
        add(getLbl7());
        add(getLbl8());
        add(getLbl9());
    }

    public JSpinner getSpinner1() {
        return spinner1;
    }

    public JSpinner getSpinner2() {
        return spinner2;
    }

    public JSpinner getSpinner3() {
        return spinner3;
    }

    public JSpinner getSpinner4() {
        return spinner4;
    }

    public JSpinner getSpinner5() {
        return spinner5;
    }

    public JSpinner getSpinner6() {
        return spinner6;
    }

    public JSpinner getSpinner7() {
        return spinner7;
    }

    public JSpinner getSpinner8() {
        return spinner8;
    }

    public JSpinner getSpinner9() {
        return spinner9;
    }

    public JLabel getImg1() {
        return img1;
    }

    public JLabel getImg2() {
        return img2;
    }

    public JLabel getImg3() {
        return img3;
    }

    public JLabel getImg4() {
        return img4;
    }

    public JLabel getImg5() {
        return img5;
    }

    public JLabel getImg6() {
        return img6;
    }

    public JLabel getImg7() {
        return img7;
    }

    public JLabel getImg8() {
        return img8;
    }

    public JLabel getImg9() {
        return img9;
    }

    public JLabel getLbl1() {
        return lbl1;
    }

    public JLabel getLbl2() {
        return lbl2;
    }

    public JLabel getLbl3() {
        return lbl3;
    }

    public JLabel getLbl4() {
        return lbl4;
    }

    public JLabel getLbl5() {
        return lbl5;
    }

    public JLabel getLbl6() {
        return lbl6;
    }

    public JLabel getLbl7() {
        return lbl7;
    }

    public JLabel getLbl8() {
        return lbl8;
    }

    public JLabel getLbl9() {
        return lbl9;
    }

    public SpinnerModel getSpinnerModel1() {
        return spinnerModel1;
    }

    public SpinnerModel getSpinnerModel2() {
        return spinnerModel2;
    }

    public SpinnerModel getSpinnerModel3() {
        return spinnerModel3;
    }

    public SpinnerModel getSpinnerModel4() {
        return spinnerModel4;
    }

    public SpinnerModel getSpinnerModel5() {
        return spinnerModel5;
    }

    public SpinnerModel getSpinnerModel6() {
        return spinnerModel6;
    }

    public SpinnerModel getSpinnerModel7() {
        return spinnerModel7;
    }

    public SpinnerModel getSpinnerModel8() {
        return spinnerModel8;
    }

    public SpinnerModel getSpinnerModel9() {
        return spinnerModel9;
    }

    public Color getColorBlack() {
        return colorBlack;
    }

    public Color getColorWhite() {
        return colorWhite;
    }

    public double getPrice1() {
        return price1;
    }

    public double getPrice2() {
        return price2;
    }

    public double getPrice3() {
        return price3;
    }

    public double getPrice4() {
        return price4;
    }

    public double getPrice5() {
        return price5;
    }

    public double getPrice6() {
        return price6;
    }

    public double getPrice7() {
        return price7;
    }

    public double getPrice8() {
        return price8;
    }

    public double getPrice9() {
        return price9;
    }
}
