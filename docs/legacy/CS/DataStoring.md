---
layout: default
title: Работа с Файлами
nav_order: 8
parent: Информатика (Java)
description: "Курс Java на уроках Информатики."
has_toc: false
nav_exclude: true
search_exclude: true
---

# Хранение и обработка данных, или работа с Файлами

Java имеет много стандартных иструментов для работы с файлами различных типо, но самым основным есть класс `File`, через который можно создавать, читать, писать, удалять, и т.п. файлы:

```java
new File(<Путь к файлу как строка>);
```
Например, получить файл `file1.txt` из корневой папки програмы (путь `./`) в переменную `f1` можно так:

```java
File f1 = new File(Main.class.getResource("file1.txt").getPath());
//или так
File f1 = new File("./file1.txt");
```

### Чтение файлов

Для чтения (и записи) используют классы-потоки, в частности `BufferedReader` и `FileReader`, последний из которых есть общим "читателем", а первый читает файлы конкретно побайтово. Для получения содержимого файла `f1`, открываем `BufferedReader(FileReader)`:

```java
FileReader fr = new FileReader(f1);
BufferedReader reader = new BufferedReader(fr);
```
Теперь, будем читать и обрабатывать содержимое по строкам:

```java
String line;
while((line = reader.readLine()) != null){ //"Пока есть дальше строка,"
    System.out.println(line); //Вывести её.
}
```
Далее, чтобы избежать "ломания" файла, после окончания работы с ним, его лучше закрыть:

```java
reader.close();
```

### Запись в файлы

Запись можно делать аналогично 2 классами, `FileWriter` и `PrintWriter`:

```java
FileWriter fw = new FileWriter(f1, false); //false — перезаписать файл, true — дописать
PrintWriter writer = new PrintWriter(f1);
```
Работа с `PrintWriter` практически такая же, как и со стандартным `System.out` для вывода, только "сливать" текст в файл нужно вручную с помощью `flush()`:

```java
writer.println("Текст.");
writer.flush();
```
И наконец, необходимо закрыть:

```java
writer.close();
fw.close();
```

### Основные методы класса `File`

| Метод | Возврат | Что делает |
|:-----:|:-------:|:----------:|
| `exists()` | boolean | Проверить, существует ли файл |
| `createNewFile()` | void | Создать/пересоздать файл |
| `mkdir()` | void | Создать папку |
| `length()` | int | Получить длину файла |
| `renameTo(File)` | void | Переместить/переименовать файл |
| `delete()` | void | Удалить файл |
| `isDirectory()` | boolean | Проверить, или это папка |
| `getName()` | String | Получить имя файла |
| `getPath()` | String | Получить путь к файлу (относительный) |
| `toAbsoluteFile()` | File | Перевести файл в файл с абсолютным путём |
| `listFiles()` | File[] | Получить массив файлов (и папок) в директории |

Другие методы можно найти в оффициальном API Java.

