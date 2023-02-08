---
layout: default
title: JavaFX (Основное)
nav_order: 9
parent: Информатика (Java)
description: "Курс Java на уроках Информатики."
has_toc: false
nav_exclude: true
search_exclude: true
---

# JavaFX

JavaFX это набор инструментов (точнее, библиотека), разработанный Oracle как отдельный проект (с JDK 11), для лёгкого создания GUI (Графического Интерфейса) с хорошим дизайном. Графическо-функциональные компоненты называются _контролами_ (или "виджетами"), например: кнопки, текстовые поля, слайдеры, и т.д. FX также включает в себя и примитивные фигуры, такие как квадрат или круг, и технические возможности (изменять курсор, дизайн окна программы, открытие и выбор файлов).

_Заметка:_ на компьютере можно навести курсором на изображение для описания.

### Установка и настройка

Для начала нужно скачать JavaFX SDK с [официального сайта](https://gluonhq.com/products/javafx/). Затем, распаковать архив в любое свободное место. Далее, добавте библиотеку в `modulepath`/`classpath` вашей IDE. Начиная с Java 9 многие проекты имеют "модулярную структуру", поэтому не достаточно просто подключить их к IDE. Необходимо, в настройках (конфигурации) запуска, в `VM аргументах`/`VM опциях` написать `--module-path="<путь_к_JavaFX_SDK/lib>"`, а затем добавить там же необходимые модули: `--add-modules=<названия_модулей_через_запятые>`, список ниже.

- `javafx.controls` -> Общие контролы, основной модуль
- `javafx.fxml` -> Для работы с FXML файлами
- `javafx.media` -> Видео и аудио плееры и файлы
- `javafx.web` -> Встраивание примитивного браузера (на основе WebKit)
- `javafx.swing` -> Для интеграции JavaFX со Swing'ом

### Начало создания GUI

![Понятия Stage, Scene, и Node](https://hsto.org/webt/4g/e1/uo/4ge1uolcdkwkxcsdont6cnytgto.png)

Для начала, создавая новый файл `.java`, нужно расширить/наследовать класс javafx.application.`Application`. В методе `main(String[] args)` достаточно вызвать один метод `launch(String[] args)`, который подготовит и запустит программу автоматически с базовыми настройками. Сам дизайн и функционал нужно задавать в методе `public void start(Stage stage)`_*_, перезаписав его. Как видно на фото, `Stage` это окно программы, а `Scene` это его содержимое. Это "содержимое" должно иметь в себе основной "контейнер", например `Pane`. Также, можно поставить заголовок окна, и после всего этого открыть само окно:

```java
public class Main extends Application{
    @Override
    public void start(Stage stage){
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 640, 480); //640x480 это размер окна, в данном случае VGA.
        stage.setTitle("Заголовок здесь");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
```

*существуют и другие методы, `init()` и `stop()`, но они используются редко, поэтому здесь не рассматриваются.

Создавать интерфейс можно двумя способами: через FXML, или кодом. В школьной программе рассматривался первый способ, который подразумевает собой создание GUI в визуальном редакторе, а затем подключая его. Так как JavaFX имеет очень много возможностей, я не могу делать так много объяснений, поэтому далее находятся просто примеры возможностей JavaFX, используя второй способ, вручную, чистым кодом.

### Контролы

![Некоторые контролы](https://i.imgur.com/3MtMndX.png)
![Те же контроллы](https://i.imgur.com/NPtN3MJ.png)

- [Код для исследования](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/ControlsTest.java)
- Модули: `javafx.controls`

### Фигуры

![Стандартные и самодельные фигуры](https://i.imgur.com/ItAQ71q.png)

- [Код для исследования](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/GeometryTest.java)
- Модули: `javafx.controls`

### Фигуры 3D

![3D графика в JFX](https://i.imgur.com/HJSy8l7.png)

- [Код для исследования](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/Geom3DTest.java)
- Модули: `javafx.controls`

### "Разметка" программы, или контейнеры

![Табличная разметка](https://i.imgur.com/WgCx7ej.png)

- [Код для исследования](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/LayoutTextTest.java)
- Модули: `javafx.controls`

### Графики, диаграммы, или визуализация данных

![Различные схемы, с эффектами](https://i.imgur.com/oi7jOaC.png)

- [Код для исследования](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/ChartsEffectsTest.java)
- Модули: `javafx.controls`

### Анимации

![Некоторые анимации](https://i.imgur.com/UaDAcZw.png)
![Вращение, изменение цвета, и движение](https://i.imgur.com/WuPkXu8.png)

- [Код для исследования](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/AnimationsTest.java)
- Модули: `javafx.controls`

### `Scene`: обработка изображений, курсор, диалоги

![Фото лапы кота :3, его фрагменты](https://i.imgur.com/cTldOCa.png)
![Диалог-"алерт"](https://i.imgur.com/C9WW8jZ.png)

- [Код для исследования](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/SceneTest.java)
- Модули: `javafx.controls`

### `Stage`: работа с окнами, монитором, выбор файлов

![Прозрачность окна, стиль](https://i.imgur.com/eMddt5F.png)
![Окно-утилита](https://i.imgur.com/oPRYKRV.png)
![Диалог выбора файла](https://i.imgur.com/siMrw0F.png)

- [Код для исследования](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/StagesTest.java)
- Модули: `javafx.controls`

### События JFX

![Перемещение круга мышкой, нажатие ПКМ для изменения цвета, создание квадратиков нажатием на клавиатуре](https://i.imgur.com/2vQHtJ5.png)

- [Код для исследования](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/EventsTest.java)
- Модули: `javafx.controls`

### Аудио и видео

![Видео со звуком](https://i.imgur.com/e5Xg2zy.png)
![Это же видео, далее](https://i.imgur.com/9yan166.png)

- [Код для исследования](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/MediaTest.java)
- Модули: `javafx.controls`, `javafx.media`

### Холст (`Canvas`) и буфер обмена

![Простая программа для рисования](https://i.imgur.com/f9K1scu.png)

- [Код для исследования](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/CanvasClipboardTest.java)
- Модули: `javafx.controls`

### Браузер (встраиваемый WebKit компонент)

![Google открыт в браузере](https://i.imgur.com/DkK5DSK.png)
![Загрузка WarriorS Wiki](https://i.imgur.com/MmDk2co.png)

- [Код для исследования](https://github.com/yaBobJonez/Homework/blob/java/JFXTest/src/Test/WebTest.java)
- Модули: `javafx.controls`, `javafx.web`

