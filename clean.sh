# Видалити всі бінарники
find . -iname "bin" -printf '"%p"\n' | xargs -r rm -rv
find . -iname "obj" -printf '"%p"\n' | xargs -r rm -rv
find . -iname "cmake-build-debug" -printf '"%p"\n' | xargs -r rm -rv

# Перевірити та записати поточні версії компіляторів
sed -i "3s/.*/_Скомпільовані на C++\/GCC $(c++ -dumpfullversion) та C#\/.NET Core $(dotnet --version)._/" README.md

# Запис на GitHub репозиторій
echo "Створити новий коміт?"
select ghYn in "Так" "Ні"; do
case $ghYn in
    Так)
        git add -A
        git status
        echo "Відправити на репозиторій?"
        select ghPush in "Продовжити" "Скасувати"; do
        case $ghPush in
            Продовжити)
                read -p "Коментар: " ghM
                git commit -m "$ghM"
                git push "https://$(sed -n '1p' ../hwtoken.txt):$(sed -n '2p' ../hwtoken.txt)@github.com/yaBobJonez/Homework.git"
                ;;
            Скасувати) ;;
        esac
        break; done
        ;;
    Ні) ;;
esac
break; done
