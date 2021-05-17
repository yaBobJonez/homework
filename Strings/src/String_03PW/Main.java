package String_03PW;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        StringBuffer sb = new StringBuffer("Спят усталые игрушки, книжки спят");
        System.out.println("1. Длина: "+sb.length());
        System.out.println("2. Ы @ "+sb.indexOf("ы"));
        /*3. */sb.delete(5, 10);
        System.out.println("3. ✂(\"устал\") => "+sb.toString());
        /*4. */sb.replace(8, 15, "зверюшки");
        System.out.println("4. \uD83D\uDD00(\"игрушки\", \"зверюшки\") => "+sb.toString());
        System.out.println("5. \u2B06\uFE0F => "+sb.toString().toUpperCase());
        /*6. */sb.append(".");
        System.out.println("6. \u2795(\".\") => "+sb.toString());
        System.out.println("7. \uD83E\uDC3C(0, 4)\uD83E\uDC3E => "+sb.substring(0, 4));

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        //for(UIManager.LookAndFeelInfo laf : UIManager.getInstalledLookAndFeels()) System.out.println(laf);
        JOptionPane.showMessageDialog(null, "Не, лучше почитать КВ.", "Строки, ок?", JOptionPane.INFORMATION_MESSAGE);
    }
}
