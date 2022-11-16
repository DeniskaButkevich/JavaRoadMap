# JavaRoadMap

### ↓ Содержание ↓
+ [Links](#links) - какие-то общие ссылки.
+ [RoadMap](#roadMap) - план по изучению джавы.
+ [Инструменты](#инструменты) - все остальное кроме джавы.
+ [Более продвинутые вещи](#более-продвинутые-вещи) - это то, что не пригодиться автотестеру (я так думаю), а джависту джуну надо.
+ [Пед проект](#пед-проект) - тут будет план капкан по маленькому проекту (если будет).


## Links
1. [Видео основы (англ).](https://www.youtube.com/watch?v=eIrMbAQSU34&ab_channel=ProgrammingwithMosh)
2. [Туториал по Java на русском](https://metanit.com/java/tutorial/).
3. [Туториал по Java на английском](https://www.javatpoint.com/java-tutorial).
4. [Курс на Stepik](https://stepik.org/course/90684/promo?search=1429334538).
5. За основу road map выступали:
   + [источник 1](https://miro.medium.com/max/4800/1*dAQJ-UDP3altoQKThbQs_w.webp)
   + [источник 2](https://roadmap.sh/java)
6. [Вопросы на интервью с ответами](https://github.com/enhorse/java-interview#jvm) 


## RoadMap
### Java Core
1. Синтаксис
   + Prerequisite.
     1. [JVM, JDK, JRE, JSE,](https://javadevblog.com/chto-takoe-jdk-jre-i-jvm-v-java.html)
     2. Компилятор и интерпретатор. -> [краткое пояснение](https://qna.habr.com/q/679242)
     3. Установка IDEA, JDK и первый **'hello world'** -> [пример](https://metanit.com/java/tutorial/1.5.php)
     4. Статейки:
        + [Введение в компиляторы, интерпретаторы и JIT’ы](https://habr.com/ru/company/vk/blog/304748/)
   + Переменные.
     1. [Источник 1](https://javarush.ru/groups/posts/peremennie-v-java)
     2. [Источник 2](https://metanit.com/java/tutorial/2.1.php)
   + Типы данных.
     1. [Источник 1](https://metanit.com/java/tutorial/2.12.php)
     2. [Источник 1](http://developer.alexanderklimov.ru/android/java/types.php)
   + Операторы (Операции над типами).
   + [Условные выражения и конструкции.](https://metanit.com/java/tutorial/2.5.php)
   + Циклы.
   + Массивы.
   + Методы.
2. ООП.
   + Prerequisite
   + Классы
   + Методы классов
   + Модификаторы доступа.
   + Парадигмы (Наследование, Полиморфизм, Инкапсуляция, Абстракция)
   + Наследования.
   + Полиморфизм.
   + Инкапсуляция.
   + Интерфейсы.
   + Абстрактные классы.
   + Клонирование объектов.
   + Пакеты.
3. Классы библиотеки.
   + Object.
   + String.
   + Коллекции
     1. Set
     2. List
     3. Map
   + Исключения
   + Лямбда Функции.
   + Stream API
   + [Generic](https://habr.com/ru/company/sberbank/blog/416413/)
   + Работа с файлами

## Инструменты
Здесь будет то, к чему будем приступать постепенно по мере необходимости.  
Это будут библиотеки, фреймворки, тулзы и тд.  
Не нужно пугаться, что-то я покажу, а что-то будет просто и абстрактно для понимания, а что-то можно рассмотреть и подробней.  
Список не имеет порядка, но имеет ссылки на хорошие **статьи**/**доку**/**источники** по моему мнению.  


+ `git (git / github / gitBash)`- Система контроля версий.
  + [Вот ссылка](https://youtube.com/playlist?list=PLU2ftbIeotGr_C-6t_lXH1Z3VgS5TLLdb) на плейлист в ютубе. Наверное лучше что могу предложить.  
+ `Data Structure` - **todo** (Почитать про деревья и O(n))
+ `swagger` - набор инструментов, который позволяет автоматически описывать API и бывшая спецификация, на которой основана спецификация OpenAPI.
  + [Swagger/OpenAPI Specification как основа для ваших приёмочных тестов](https://habr.com/ru/company/jugru/blog/525298/). Статья Автотестировщика.
  + [Что такое Swagger и OpenAPI за 3 минуты](https://www.youtube.com/watch?v=aaFDBgPdXw4&ab_channel=ListenIT) 
+ **логирование** - для java будем юзайть **log4g**.  
+ `postman`  - это платформа API, позволяющая разработчикам проектировать, создавать, тестировать и повторять свои API. 
   + [Вот](https://habr.com/ru/company/maxilect/blog/596789/) хорошая статья на эту по постмону.
+ `Patterns` - то часто встречающееся решение определённой проблемы при проектировании архитектуры программ.
  + [Вот](https://refactoring.guru/ru/design-patterns/what-is-pattern) самый лучший сайт по потернам проектирования. 
+ `Http/Https` - протоколы передачи данных.
+ `IP, TCP, and HTTP` - [статейка по протоколам](https://www.objc.io/issues/10-syncing-data/ip-tcp-http/).
+ `REST` - архитектурный стиль взаимодействия компонентов распределённого приложения в сети.
+ `Maven` - сборщик проектов для java, а т.е. собирает все фалы зависимости и тд в **JAR** файл, который можно исполнять.
+ `Database` - **todo**. Тут по Sql че-то будет.
+ `postgres` - Sql база данных. Если и придется работать с базой, то будем с этой. 
+ `JDBC` - коннектор к базам данных для java 
+ `Тестирование` - Покажу, как и шо только если начнем писать хоть какой малюсенький проект.
  + integration тестирование.
  + unit тестирование.

## Более продвинутые вещи
Не будем смотреть, сложные темы. Может когда-нибудь...
1. Stream Api
2. Многопоточность
3. [Сборщик мусора](https://habr.com/ru/post/269621/)
4. [загрузка классов](https://javarush.ru/groups/posts/646-kak-proiskhodit-zagruzka-klassov-v-jvm)
5. [JVM Run-Time Data Areas](https://www.programcreek.com/2013/04/jvm-run-time-data-areas/)

## Пед проект
#### **todo**
![](rock.png)