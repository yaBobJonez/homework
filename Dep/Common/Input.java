package Common;

import java.util.Scanner;

public class Input{
	private static Scanner sc = new Scanner(System.in);
	
	public static int inputInt(String mes){
        if(mes != null) System.out.println(mes);
        int t = sc.nextInt(); sc.nextLine(); return t;
    } public static double inputDouble(String mes){
        if(mes != null) System.out.println(mes);
        double t = sc.nextDouble(); sc.nextLine(); return t;
    } public static String inputString(String mes){
        if(mes != null) System.out.println(mes);
        return sc.nextLine();
    } public static boolean inputBoolean(String mes){
        if(mes != null) System.out.println(mes);
        boolean t = sc.nextBoolean(); sc.nextLine(); return t;
    } public static String[] inputStringArray(String mes){
    	if(mes != null) System.out.println(mes);
    	return sc.nextLine().split(" ");
    } public static int[] inputIntArray(String mes){
    	if(mes != null) System.out.println(mes);
    	String[] arr = sc.nextLine().split(" ");
    	int[] res = new int[arr.length];
    	for(int i = 0; i < arr.length; i++){
    		try{ res[i] = Integer.parseInt(arr[i]); }
    		catch(NumberFormatException e){ return null; }
    	} return res;
    } public static double[] inputDoubleArray(String mes){
    	if(mes != null) System.out.println(mes);
    	String[] arr = sc.nextLine().split(" ");
    	double[] res = new double[arr.length];
    	for(int i = 0; i < arr.length; i++){
    		try{ res[i] = Double.parseDouble(arr[i]); }
    		catch(NumberFormatException e){ return null; }
    	} return res;
    } public static boolean[] inputBooleanArray(String mes){
    	if(mes != null) System.out.println(mes);
    	String[] arr = sc.nextLine().split(" ");
    	boolean[] res = new boolean[arr.length];
    	for(int i = 0; i < arr.length; i++){
    		res[i] = Boolean.parseBoolean(arr[i]);
    	} return res;
    }
    
    public static int inputInt(){ int t = sc.nextInt(); sc.nextLine(); return t; }
    public static double inputDouble(){ double t = sc.nextDouble(); sc.nextLine(); return t; }
    public static String inputString(){ return sc.nextLine(); }
    public static boolean inputBoolean(){ boolean t = sc.nextBoolean(); sc.nextLine(); return t; }
    public static String[] inputStringArray(){ return sc.nextLine().split(" "); }
    public static int[] inputIntArray(){
    	String[] arr = sc.nextLine().split(" ");
    	int[] res = new int[arr.length];
    	for(int i = 0; i < arr.length; i++){
    		try{ res[i] = Integer.parseInt(arr[i]); }
    		catch(NumberFormatException e){ return null; }
    	} return res;
    } public static double[] inputDoubleArray(){
    	String[] arr = sc.nextLine().split(" ");
    	double[] res = new double[arr.length];
    	for(int i = 0; i < arr.length; i++){
    		try{ res[i] = Double.parseDouble(arr[i]); }
    		catch(NumberFormatException e){ return null; }
    	} return res;
    } public static boolean[] inputBooleanArray(){
    	String[] arr = sc.nextLine().split(" ");
    	boolean[] res = new boolean[arr.length];
    	for(int i = 0; i < arr.length; i++){
    		res[i] = Boolean.parseBoolean(arr[i]);
    	} return res;
    }
    
    public static String input(){ return inputString(); }
    public static String input(String mes){ return inputString(mes); }
    public static String[] inputArray(){ return inputStringArray(); }
    public static String[] inputArray(String mes){ return inputStringArray(mes); }
}
