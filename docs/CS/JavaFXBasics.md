---
layout: default
title: JavaFX (Вступ)
nav_order: 12
parent: Інформатика (Java)
description: "Курс Java на уроках Інформатики."
has_toc: false
---

# JavaFX

_JavaFX_ — це бібліотека (навіть _фреймворк_), розроблена Oracle як окремий проєкт (починаючи з Java 11) для легкого створення доволі гарного та сучасного, функціонального _GUI_ (графічного інтерфейсу користувача). Елементи інтерфейсу (кнопки, текстові поля, повзунки тощо) називаються _контролами_, або _віджетами_. Окрім них, в JavaFX можна малювати примітивні фігури (квадрат, круг тощо), або навіть 3D графіку. Звичайно, є й технічні можливості, такі як зміна курсору, діалоги для вибору файлів, створення і дизайн вікон програми та багато іншого.

Бібліотека складається з модулів, що описані нижче. Залежно від їх використання, необхідно дописувати їх через кому в `--add-modules=`.

- `javafx.controls` -> Графічні контроли (основний модуль)
- `javafx.fxml` -> Для роботи з FXML файлами
- `javafx.media` -> Відео й аудіо плеєри
- `javafx.web` -> Вбудований браузер на базі WebKit
- `javafx.swing` -> Для інтеграції JavaFX зі Swing

## Початок роботи

_Фреймворком_ (англ. фундамент) називається бібліотека, на основі якої будують програми. До таких відноситься й JavaFX, тому основний клас кожної програми (Main) на ньому має наслідувати клас javafx.application.`Application`. У методі `main(String[] args)` потрібно викликати лише один метод Application.`launch(String[] args)`, який зробить всю складну роботу щодо створення вікна та запуску нового потоку програми з базовими налаштуваннями, тобто підготує програму. Для самого коду є три методи (в порядку їх виконання):

1. `init()`, у якому відбувається ініціалізація
2. `start(Stage stage)`, у якому пишуть майже весь (або весь) код
3. `stop()`, у якому роблять "очистку", завершальні дії за необхідності

![Поняття Stage, Scene і Node](https://hsto.org/webt/4g/e1/uo/4ge1uolcdkwkxcsdont6cnytgto.png)

Далі потрібно розібратись із структурою графічної програми: як видно на зображенні, `Stage` — це _вікно програми_ (у даному випадку одне основне вікно), а `Scene` — це об'єкт, у якому знаходиться весь графічний _контент_ програми (всі контроли). Клас `Node` являє собою будь-який _контрол_ або _контейнер_. Можна здогадатися, що _контейнерами_ називають контроли, які вміщують в себе й розташовують інші контроли, наприклад, контейнером є HBox (горизонтальна коробка), яка розташовує свої _дочірні Node_ горизонтально за порядком. Основний _батьківський контейнер_ для всіх елементів (корінь) називається _Root (Node)_. Найпростішим контейнером є _панель_ (`Pane`), яку ми й візьмемо. Далі змінимо назву вікна (заголовок, методом `setTitle(String)`) і покажемо це вікно на екрані:

```java
public class Main extends Application {
	@Override
	public void start(Stage stage) {
		Pane pane = new Pane();
		Scene scene = new Scene(pane, 640, 480);
		stage.setScene(scene);
		stage.setTitle("Назва вікна");
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
```
Це і буде шаблоном для JavaFX програми. Числа 640 та 480 — це розмір контенту вікна у пікселях, тобто 640x480 (VGA). Взагалі, створювати інтерфейс у JavaFX можна двома способами: або через FXML — формат файлів розмітки GUI у вигляді XML, або просто через код. У шкільній програмі використовували перший спосіб, який також дає змогу створювати дизайн інтерфейсу у візуальному редакторі [Scene Builder](https://gluonhq.com/products/scene-builder/), а потім просто підключити його. Такий принцип розробки називають [MVC](https://uk.wikipedia.org/wiki/%D0%9C%D0%BE%D0%B4%D0%B5%D0%BB%D1%8C-%D0%B2%D0%B8%D0%B4-%D0%BA%D0%BE%D0%BD%D1%82%D1%80%D0%BE%D0%BB%D0%B5%D1%80), детальніше у Wikipedia.

## Ресурси для вивчення

На жаль, бібліотека JavaFX є дуже великою та багатофункціональною темою, тому я не можу надати багато роз'яснень. Якщо Ви зацікавленні у створенні гарних графічних програм на Java (або просто з Вас вимагає цього шкільна програма xD), то краще пошукайте додаткову інформацію в Інтернеті. Я можу порекомендувати такі джерела: [code.makery (Укр)](https://code.makery.ch/uk/library/javafx-tutorial/), [Jenkov Tutorials](https://jenkov.com/tutorials/javafx/index.html), [Tutorials Point](https://www.tutorialspoint.com/javafx/index.htm) і [JavaTpoint (Англ)](https://www.javatpoint.com/javafx-tutorial).

Нижче також приведені _мої власні приклади можливостей JavaFX_ зі знімками екрана, але написані чистим кодом (без FXML).

### Контроли

![Деякі часто використовувані контроли](https://i.imgur.com/3MtMndX.png)
![Ті ж, але зі зміненими станами](https://i.imgur.com/NPtN3MJ.png)

- [Код для ознайомлення](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/ControlsTest.java)
- Модулі: `javafx.controls`

### Фігури 2D

![Стандартні та намальовані вручну](https://i.imgur.com/ItAQ71q.png)

- [Код для ознайомлення](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/GeometryTest.java)
- Модулі: `javafx.controls`

### Фігури 3D

![3D графіка в JFX](https://i.imgur.com/HJSy8l7.png)

- [Код для ознайомлення](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/Geom3DTest.java)
- Модулі: `javafx.controls`

### Розмітка та шрифти

![Табличний контейнер (GridPane)](https://i.imgur.com/WgCx7ej.png)

- [Код для ознайомлення](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/LayoutTextTest.java)
- Модулі: `javafx.controls`

### Діаграми та ефекти

![Візуалізація даних з ефектами](https://i.imgur.com/oi7jOaC.png)

- [Код для ознайомлення](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/ChartsEffectsTest.java)
- Модулі: `javafx.controls`

### Анімації

![Деякі анімації](https://i.imgur.com/UaDAcZw.png)
![Повертання, зміна кольору і рух](https://i.imgur.com/WuPkXu8.png)

- [Код для ознайомлення](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/AnimationsTest.java)
- Модулі: `javafx.controls`

### Scene, обробка зображень та діалоги

![Фото лапи кота та його фрагменти](https://i.imgur.com/cTldOCa.png)
![Діалог підтвердження з кнопками](https://i.imgur.com/C9WW8jZ.png)

- [Код для ознайомлення](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/SceneTest.java)
- Модулі: `javafx.controls`

### Stage, робота з монітором, вибір файлів

![Вікно зі зміненою прозорістю та стилем](https://i.imgur.com/eMddt5F.png)
![Вікно-утиліта](https://i.imgur.com/oPRYKRV.png)
![Діалог вибору файлу](https://i.imgur.com/siMrw0F.png)

- [Код для ознайомлення](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/StagesTest.java)
- Модулі: `javafx.controls`

### Події (Events)

![Рух кружечка за курсором, натискання ПКМ для зміни кольору, створення квадратиків натисканням клавіші](https://i.imgur.com/2vQHtJ5.png)

- [Код для ознайомлення](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/EventsTest.java)
- Модулі: `javafx.controls`

### Аудіо й відео

![Відео зі звуком](https://i.imgur.com/e5Xg2zy.png)
![Це ж відео (керування з клавіатури)](https://i.imgur.com/9yan166.png)

- [Код для ознайомлення](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/MediaTest.java)
- Модулі: `javafx.controls`, `javafx.media`

### Полотно (Canvas) та робота з буфером обміну

![Саморобна програма для малювання](https://i.imgur.com/f9K1scu.png)

- [Код для ознайомлення](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/CanvasClipboardTest.java)
- Модулі: `javafx.controls`

### Браузер (рушій — WebKit)

![Google, кнопки історії та поле пошуку](https://i.imgur.com/DkK5DSK.png)
![Сайт WarriorS Wiki](https://i.imgur.com/MmDk2co.png)

- [Код для ознайомлення](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/WebTest.java)
- Модулі: `javafx.controls`, `javafx.web`

