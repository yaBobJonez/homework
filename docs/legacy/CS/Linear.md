---
layout: default
title: Основы
nav_order: 1
parent: Информатика (Java)
description: "Курс Java на уроках Информатики."
has_toc: false
nav_exclude: true
search_exclude: true
---

# Основы Java

Переменные нужны для хранения значений выражений. Java — статический язык, поэтому нужно указывать тип:

```java
int var1 = 0;
double var2 = 2.5;
String var3 = "Text";
boolean var4 = true;
char var5 = 'a';
```

Ввод осуществляется с помощью Сканера потока Ввод Системы:

```java
Scanner sc = new Scanner(System.in);
String var = sc.nextLine();
```

Вывод данных осуществляется печатанием в поток Вывод Системы:

```java
System.out.println("Text");
System.out.println(25.75);
System.out.println(false);
```

Операторы чисел:

- `+` прибавить
- `-` отнять
- `*` умножить
- `/` поделить
- `%` модуло, то есть остаток от деления

Методы для работы с числами:

- `Math.pow(<число>, <степень>)` возведение числа в степень
- `Math.sqrt(<число>)` квадратный корень от числа
