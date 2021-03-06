# EducationalProjects

## Practical work 1

### part 1.

Напишите консольное приложение, которое определяет целое
положительное число в десятичной системе, затем преобразует в
двоичной/восьмиричной/шестнадцатиричной системах счисления и выводит
результат.

### part 2.

Напишите консольное приложение, которое находит все
совершенные числа в диапазоне от 1 по некоторое заданное положительное
число и выводит их (совершенное число – это число, которое равно сумме
всех своих делителей, кроме самого себя. Например, 6 = 1+2+3).

### part 3.

Напишите консольное приложение, которое вызывает метод для
построения пирамиды высотой в диапазоне от 1 по 9.

### part 4. 

Напишите консольное приложение, которое выполняет поворот
квадратной матрицы размерностью N на 90° против часовой стрелки.

ТРЕБОВАНИЯ.

1. Приложение должно быть написано на языке Java.
2. Использовать только операторы, массивы (т.е. не применять
библиотечные методы).
3. При кодировании должны быть использованы соглашения об
оформлении кода для языка Java.
4. Код должен быть разделен для каждого задания на классы и пакеты
согласно действиям: отображение результата, вычисление, запуск на
исполнение.
5. Значения элементов матрицы задаются с помощью генератора
случайных чисел. Матрица должна содержать как положительные, так
и отрицательные значения.
6. Для проверки результата работы нужно вывести матрицу исходную и
после обработки.

## Practical work 2

Напишите консольное приложение, которое: описывает тип данных согласно таблице;
 создает набор данных описанного типа (массив размерностью не
меньше 7 элементов);
 использует работу с меню для обработки созданного массива данных
согласно таблице;
 использует интерфейс Comparator для упорядочивания элементов
массива данных согласно таблице.

ТРЕБОВАНИЯ.

1. Приложение должно быть написано на языке Java.
2. Использовать только стандартные компиляторы и библиотеки.
3. При кодировании должны быть использованы соглашения об
оформлении кода для языка Java.
4. Значения для инициализации объектов выбираются из заранее
подготовленных данных (выбранных случайным образом или по
порядку следования).
5. Для проверки результата работы нужно вывести исходный массив
после создания.
6. Данные для обработки массива выбираются из заранее подготовленных
данных случайным образом.
7. Если в результате обработки массива данных не найдено, то
необходимо вывести соответствующее сообщение.
8. При построении приложения использовать пакеты для создания
функциональной структуры.

## Practical work 3

Создайте приложение как Maven проект, в который:
- добавьте Junit зависимость в файл pom.xml;
- добавьте класс, использующийся для конвертации значения температуры
в различные единицы измерения (Цельсий, Кельвин, Фаренгейт):

```java
public class TemperatureConverter {
  public double convertFtoC(double degreesFahrenheit) {
    return (degreesFahrenheit - 32.0) / 9.0 * 5.0;
  }
  public double convertCtoF(double degreesCelsius) {
    return degreesCelsius / 5.0 * 9.0 + 32.0;
  }
  public double convertCtoK(double degreesCelsius) {
    return degreesCelsius + 273.2;
  }
  public double convertKtoC(double kelvin) {
    return kelvin - 273.2;
  }
  public double convertFtoK(double degreesFahrenheit) {
    return (degreesFahrenheit + 459.7) / 9.0 * 5.0;
  }
  public double convertKtoF(double kelvin) {
    return kelvin / 5.0 * 9.0 - 459.7;
  }
}
```

- добавьте класс с junit-тестами для проверки всех методов описанного
класса и запустите их для проверки;
- добавьте возможность параметризированного запуска тестов.

ТРЕБОВАНИЯ.

1. Приложение должно быть написано на языке Java.
2. При кодировании должны быть использованы соглашения об
оформлении кода для языка Java.
3. Для реализации модульного тестирования используйте фреймворк
JUnit 4.

## Practical work 4

Реализовать собственный класс который по функциональности будет идентичный классу Enum.

## Practical work 5

Напишите консольное приложение, которое позволяет создавать
сущность "Запись в журнале куратора".
Для этого требуется:
- организовать ввод данных из командной строки и передать результат ввода
в соответствующую сущность;
- проверять на правильность ввод данных (сохраняя правильно введенные) и
в случае полной корректности всех данных – передать их в
соответствующий класс в модели;
- отображать все записи журнала;
- предоставлять возможность отображения интерфейса на разных языках.
Сущность "Запись в журнале куратора" описывается следующим
набором:
- фамилия студента;
- имя студента;
- дата рождения студента;
- телефон студента;
- домашний адрес (улица, дом, квартира).

ТРЕБОВАНИЯ.

1. Приложение должно быть написано на языке Java.
2. Использовать только стандартные компиляторы и библиотеки.
3. При кодировании должны быть использованы соглашения об
оформлении кода для языка Java.
4. Приложение должно быть организовано по архитектурному шаблону
MVC.
5. Приложение должно использовать интернализацию для обеспечения
многоязыкового интерфейса (класс ResourceBundle).
6. Приложение должно использовать регулярные выражения для
проверки на корректность введенных данных. Если данные не
соответствуют требуемому формату, то предложить повторный ввод.

## Practical work 6
### task 1: Откройте код приложения task2(1) и внесите следующие изменения:
 Первое:
- добавьте в меню команду для сохранения набора объектов в файл;
- предусмотрите возможность чтения набора объектов из файла.
 Второе:
- добавьте систему логирования для фиксации хода выполнения
приложения и вывода сообщений об ошибках в консоль;
- добавьте вывод сообщений в текстовый файл.
Примечание: продемонстрируйте работу системы логирования с учетом
уровня регистратора и используемого метода вывода (т.е.
чтобы не все сообщения дошли до пункта назначения).

ТРЕБОВАНИЯ.

1. Приложение должно быть написано на языке Java.
2. Использовать только стандартные компиляторы и библиотеки.
3. При кодировании должны быть использованы соглашения об
оформлении кода для языка Java.
4. Предусмотрите возможность ввода местоположения и имени файла для
сохранения данных.
5. Используйте объектные потоки для работы с файлом.
6. Примените сериализацию по умолчанию для работы с файлами.
7. Выделите работу с файлами в отдельный класс.
8. Подключите к проекту фреймворк Log4J.
9. Реализуйте систему логирования через файл свойств log4j.properties.
10.Затем реализуйте систему логирования через файл конфигурации
log4j.xml.

### task 2. Задание на работу с рефлексией.
Напишите консольное приложение, которое:
- создает и инициализирует переменную типа String;
- использует рефлексию для изменения значения созданной строки
(через доступ к закрытому полю char[] value класса String).
ТРЕБОВАНИЯ.
1. Приложение должно быть написано на языке Java.
2. Использовать только стандартные компиляторы и библиотеки.
3. При кодировании должны быть использованы соглашения об
оформлении кода для языка Java.
4. Строка должна быть создана и проинициализирована двумя способами:
 как строковый литерал;
 введена набором с клавиатуры.
5. Значение для замены может быть заданно программно или введено
набором с клавиатуры.
6. Строка должна быть выведена до изменения и после.

### task 3. Напишите консольное приложение по архитектурному шаблону MVC, которое:
- описывает класс "Унарная арифметическая операция":
• закрытое поле вещественного типа;
• несколько конструкторов;
• методы доступа (геттеры и сеттеры);
• метод toString();
• методы инкремента, декремента, изменения знака.
- создает экземпляр описанного класса через механизм рефлексии
(любым конструктором);
- отображает информацию о состоянии созданного экземпляра через
рефлексию (экземпляр класса Field);
- изменяет состояние экземпляра динамическим вызовом метода
доступа.

ТРЕБОВАНИЯ.

1. Приложение должно быть написано на языке Java.
2. Использовать только стандартные компиляторы и библиотеки.
3. При кодировании должны быть использованы соглашения об
оформлении кода для языка Java.
4. Информация об экземпляре должна быть выведена в консоль после
создания и изменения.

## Practical work 7
### task1: Напишите консольное приложение, которое:
- описывает класс, который является генератором списка (List) и множества
(Set) из указанного количества и диапазона;
- создает по одному экземпляру списка и множества, а затем отображает их в
консоль.

### task2: Напишите консольное приложение, которое:
- описывает класс, который является переводчиком с английского языка и
содержит словарь английских и русских слов в виде коллекции
HashMap<String, String>, метод для добавления пар слов, метод для
перевода полученной фразы;
- создает экземпляр описанного класса, наполняет словарь;
- вводит некоторую фразу на английском языке и отображает ее перевод на
русском языке.

### task3: Напишите консольное приложение, которое:
- описывает класс, реализующий красно-черное дерево: добавление, обход и
удаление (вариативно) узлов;
- создает экземпляр дерева и наполняет его элементами (в качестве элементов
можно использовать числа):
• числа подаются в произвольном порядке (можно использовать массив,
который заполнить случайными числами; в этом случае массив
требуется вывести, чтобы видеть порядок добавления элементов);
• числа подаются упорядоченно, например, по возрастанию (можно
упорядочить массив, заполненный случайными числами);
- отображает дерево после каждого изменения (для отображения можно
использовать обход в ширину).

ТРЕБОВАНИЯ.
1. Приложение должно быть написано на языке Java.
2. Использовать только стандартные компиляторы и библиотеки.
3. При кодировании должны быть использованы соглашения об
оформлении кода для языка Java.
4. Все данные для заданий 1 и 2 должны быть введены набором с
клавиатуры.

## Project 1

Создать консольное приложение, удовлетворяющее следующим требованиям:
1. Использовать возможности ООП: классы, наследование, полиморфизм,
инкапсуляция.
2. Каждый класс должен иметь исчерпывающее смысл название и информативный
состав.
3. Наследование должно применяться только тогда, когда это имеет смысл.
4. При кодировании должны быть использованы соглашения об оформлении кода
java.
5. Классы должны быть грамотно разложены по пакетам.
6. Работа с консолью или консольное меню должно быть минимальным.
7. Для хранения параметров инициализации можно использовать файлы.

Вариант:

Налоги. Определить множество и сумму налоговых выплат физического лица за год с
учетом доходов с основного и дополнительного мест работы, авторских
вознаграждений, продажи имущества, получения в подарок денежных сумм и
имущества, переводов из-за границы, льгот на детей и материальную помощь.
Провести сортировку налогов по сумме.


