# Oblig3_SE
Har samarbeidet med Cornelia Kristiansen på denne obligen.

Opprettet først et Github repository fra oblig 2-prosjektet i IntelliJ. 

På denne nettsiden fant jeg en framgangsmåte for hvordan man kan bygge og teste Java med Gradle i Github Actions: https://docs.github.com/en/actions/automating-builds-and-tests/building-and-testing-java-with-gradle. Brukte Gradle workflow-templaten som fremgikk på denne siden, byttet kun ut fra 'ubuntu-latest' til 'windows-latest' på angivelsen av operativsystemet, samt byttet til Java 15 versjon som Java-prosjektet mitt bygget på. Opprettet deretter denne templaten under Github Actions. 

I build.gradle-filen i Java-prosjektet la jeg inn koden testLogging {events "passed", "skipped", "failed", "standardOut", "standardError" }. Dette gjorde at testene vises i Github Actions når denne kjøres, sammen med informasjon om testene er passed, failed osv. 

Testet å legge inn "feil" input i testene, og pushet på nytt. Dette gjorde at Actions feilet/den aktuelle testen feilet, når Actions ble kjørt. 

Når input-data for testene deretter ble lagt inn med riktige verdier igjen, kjørte Actions uten feil og alle testene vises som "passed". Kjøringen av testene fremgår i steget "Build with Gradle". 
