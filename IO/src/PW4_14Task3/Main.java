package PW4_14Task3;

import java.awt.GridLayout;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main {
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		JFrame window = new JFrame("Сравнить файлы");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFileChooser f1Chooser = new JFileChooser(); f1Chooser.setSelectedFile(new File(Main.class.getResource("file1.txt").getPath()));
		JFileChooser f2Chooser = new JFileChooser(); f2Chooser.setSelectedFile(new File(Main.class.getResource("file2.txt").getPath()));
		JButton f1Btn = new JButton("Выбрать Файл 1"); f1Btn.addActionListener((e)->f1Chooser.showOpenDialog(window));
		JButton f2Btn = new JButton("Выбрать Файл 2"); f2Btn.addActionListener((e)->f2Chooser.showOpenDialog(window));
		JCheckBox caseInsCheck = new JCheckBox("Не чуствительно к регистру", true);
		JButton exec = new JButton("Сравнить");
		exec.addActionListener(e -> { try{
			FileInputStream f1In = new FileInputStream(f1Chooser.getSelectedFile());
			FileInputStream f2In = new FileInputStream(f2Chooser.getSelectedFile());
			boolean identical = true;
			if(caseInsCheck.isSelected()){
				while(true){
					int a = f1In.read();
					int b = f2In.read();
					if(a==-1 && b==-1) break;
					if(Character.toLowerCase((char)a) != Character.toLowerCase((char)b)){ identical = false; break; }
				}
			} else {
				while(true){
					int a = f1In.read();
					int b = f2In.read();
					if(a==-1 && b==-1) break;
					if( ((char)a) != ((char)b) ){ identical = false; break; }
				}
			} JOptionPane.showMessageDialog(null,
				identical?"Файлы одинаковые.":"Файлы разные."
			, "Результат", JOptionPane.INFORMATION_MESSAGE);
			f1In.close(); f2In.close();
		} catch(Exception exc){System.err.println(exc);exc.printStackTrace();}});
		window.setLayout(new GridLayout(2, 2, 5, 10));
		window.setLocationRelativeTo(null);
		window.add(f1Btn); window.add(f2Btn); window.add(caseInsCheck); window.add(exec);
		window.pack();
		window.setVisible(true);
	}
}
