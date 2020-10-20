# Инструкция по настройке и проверке проекта Homework

## Установка
Перед `git pull`/`git clone` проекта, убедитесь, что вы подключены к репозиторию Github Packages
с помощью имени пользователя и персонального токена. Для этого в:

- Windows: `C:/Users/<Имя пользователя>/.m2/settings.xml`
- Linux: `/home/<Имя пользователя>/.m2/settings.xml`

добавьте авторизацию к GH Packages:

```xml
<servers>
	<server>
		<id>github</id>
		<username>ИМЯ_ПОЛЬЗОВАТЕЛЯ_GITHUB</username>
		<password>ПЕРСОНАЛЬНЫЙ_ТОКЕН_ДОСТУПА</password>
        </server>
</servers>
```

Если файла нет, создайте его. Персональный токен доступа можно получить [**здесь**](https://github.com/settings/tokens).

## Загрузка

"Стяните" проект или клонируйте его с помощью `git pull`/`git clone` по ссылке:
[Homework](https://github.com/yaBobJonez/Homework).

```bash
git clone https://github.com/yaBobJonez/Homework
```

Eclipse/Intellij должны будут автоматически подгрузить зависимости проекта. Готово.