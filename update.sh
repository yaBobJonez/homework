# Видалити всі бінарники
for name in 'bin' 'obj' 'out' 'cmake-build-debug' '__pycache__'; do
    find . -name '.venv' -prune -o -type d -iname "$name" -prune -exec rm -rv {} \;
done

# Перевірити та записати поточні версії компіляторів
cppVersion=$(c++ -dumpfullversion)
dotCoreVersion='7.0.203'
dotNetVersion='7.0.401'
javaVersion=$(java --version | head -n1 | cut -f2 -d' ')
pythonVersion=$(python --version | cut -f2 -d' ')
sed -i "3s/.*/_Виконані на C++\/GCC $cppVersion, C#\/.NET Core $dotCoreVersion (C#\/.NET Framework $dotNetVersion), Java\/OpenJDK $javaVersion, Python\/CPython $pythonVersion._ /" README.md

# Запис на GitHub репозиторій
git status
echo "Додати зміни в індекс?"
select ghYn in "Так" "Ні"; do
case $ghYn in
    Так)
        git add -A
        git status
        echo "Зробити коміт і відправити на репозиторій?"
        select ghPush in "Продовжити" "Скасувати"; do
        case $ghPush in
            Продовжити)
                read -p "Коментар: " ghM
                git commit -m "$ghM"
                git push
                ;;
            Скасувати)
                git reset
                ;;
        esac
        break; done
        ;;
    Ні) ;;
esac
break; done
