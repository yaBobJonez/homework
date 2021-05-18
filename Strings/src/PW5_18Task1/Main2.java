package PW5_18Task1;

import javax.swing.*;

public class Main2 {
    public static void main(String[] args) throws Exception {
        StringBuffer str1 = new StringBuffer("<...> but will he be satisfied with his power now -");
        String str2 = new String(" or does his desire for revenge burn even more strongly?");
        System.out.println("[Log]: str1 capacity - "+str1.capacity());
        str1.append(str2);
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JOptionPane.showMessageDialog(null, str1.toString(), "Ёмкость: "+str1.capacity()+", размер: "+str1.length(), JOptionPane.INFORMATION_MESSAGE);
    }
}
