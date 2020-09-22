public class Main {
    public static void main(String[] args) {
	    int pencils = 1257; //Количество карандашей
        System.out.println("Всего карандашей: "+pencils);
	    int boxSize = 24; //Размер коробки
        System.out.println("Размер коробки (количество карандашей в 1 коробке): "+boxSize);
        int full = pencils / boxSize; //Количество полных коробок
        System.out.println("Количество полных коробок: "+full);
        int remainder = pencils % boxSize; //Остача карандашей
        System.out.println("Остача карандашей: "+remainder);
        int additional = (remainder == 0)? 0 : 1; //Если нет остачи, 0 дополнительных коробок. Если есть остача, 1 дополнительная коробка.
        System.out.println(full + additional + " коробок потребуеться.");
    }
}
