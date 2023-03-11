using String = ClassLib.String;

class Program
{
    static void Main(string[] args)
    {
        String str1, str3; int str2 = 0;
        Console.WriteLine("Використання:\nвводьте рядки лише з цифр, наприклад: <82384>\nабо <exit> для виходу із програми.");
        string input1, action;
        while((input1 = Console.ReadLine()) != "exit"){
            try { str1 = new String(input1); }
            catch (ArgumentException e) {
                Console.Error.WriteLine("Некоректний формат вводу!");
                continue;
            }
            Console.WriteLine("Оберіть дію:\n0) Все одразу\n1) Дописати число\n2) Додати інший рядок\n3) Порівняти з іншим рядком\n"
                         + "4) Декрементувати (видалити останній символ)\n5) Перевірити на нуль\nexit) Вийти");
            if((action = Console.ReadLine()) == "exit") break;
            if(action.Length != 1 || action[0] < '0' || action[0] > '5'
               || !int.TryParse(action, out int a)){
                Console.Error.WriteLine("Некоректний формат вводу!");
                continue;
            } if(a<= 3){
                string num = Console.ReadLine();
                if(num == "exit") break;
                if(!int.TryParse(num, out str2)){
                    Console.Error.WriteLine("Некоректний формат вводу!");
                    continue;
                }
            } if(a== 0 || a== 1){
                Console.WriteLine($"{str2} * {str1} => "+ str2*str1 );
                Console.WriteLine($"{str1} * {str2} => "+ str1*str2 );
            } if(a== 0 || a== 2){
                Console.WriteLine($"{str1} + {str2} => "+ str1+str2.ToString() );
            } if(a== 0 || a== 3){
                Console.WriteLine($"{str1} == {str2} ? "+( str1 == new String(str2) ? "Так":"Ні" ));
            } if(a== 0 || a== 4){
                Console.WriteLine($"Рядок_3 = {str1} -- :");
                str3 = str1--;
                Console.WriteLine($"Рядок 1: {str1}");
                Console.WriteLine($"Рядок 3: {str3}");
            } if(a== 0 || a== 5){
                Console.WriteLine($"{str1} == 0? "+( str1 ? "Ні":"Так" ));
            }
        }
    }
}