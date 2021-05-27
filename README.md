Втора лабораториска вежба по Софтверско инженерство

Александра Ефтимова, индекс 193007

link: https://github.com/AleksandraEftimova/SI_lab2_193007.git


**2. Control Flow Graph**

SI Lab2-Control Flow Graph.png


**3. Цикломатска комплексност**

Цикломатската комплексност на овој код е 6. До резултатот стигнав користејќи ја формулата со предикатни јазли, односно јазли кои се разгрануваат, и добив:
цикломатска комплексност = Р + 1 = 5 + 1 = 6


**4. Тест случаи според Multiple condition критериум**

Со Multiple condition критериумот треба да се помине низ секоја можна опција кај if-ови со повеќе услови

Тест случаи за линија 7 -> if (hr < 0 || hr > 24)
1) T || ? -> Hours<0
2) F || T -> Hours>24
3) F || F -> 0<Hours<24
   
Тест случаи за линија 14 -> if (min < 0 || min > 59)
1) T || ? -> Minutes<0
2) F || T -> Minutes>59
3) F || F -> 0<Minutes<59

**5. Тест случаи според Every branch condition критериум**

Со Every branch condition критериумот се бара да се помине низ секоја гранка, користев и Excel file за да дојдам до решението
1) Hours<0, Minutes=?, Seconds=? -> Branches: 1, 2, 3.1, 3.2, 4, 5, 6, 7, 8, 9, 29
2) Hours>24, Minutes=?, Seconds=? -> Branches: 1, 2, 3.1, 3.2, 4, 5, 6, 7, 8, 10, 11, 29
3) Hours<24, Minutes<0||Minutes>59, Seconds=? -> Branches: 1, 2, 3.1, 3.2, 4, 5, 6, 13, 14, 15, 29
4) valid Hours, valid Minutes, Seconds<0||Seconds>59 -> Branches: 1, 2, 3.1, 3.2, 4, 5, 6, 13, 14, 16, 17, 19, 20, 29
5) valid Hours, valid Minutes, valid Seconds -> Branches: 1, 2, 3.1, 3.2, 4, 5, 6, 13, 14, 16, 17, 18, 21, 22, 27, 3.3, 3.2, 28, 29
6) Hours=24, Minutes=0, Seconds=0 -> Branches: 1, 2, 3.1, 3.2, 4, 5, 6, 23, 24, 27, 3.3, 3.2, 28, 29
7) Hours=24, invalid Minutes or Seconds -> Branches: 1, 2, 3.1, 3.2, 4, 5, 6, 25, 26, 29

**6. Gradle build за Java апликација**

Ги користeв следните команди во Command Prompt:

   gradle -v

   mkdir SI_lab2_193007

   cd SI_lab2_193007

   gradle init

   селектирав basic како тип на проект, Groovy како build script DSL

   име на проект: SI_lab2_193007

   *поради проблем со IntelliJ не успеав да го тестирам кодот за тест случаите во src/test/SILab2Test.java

