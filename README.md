# Day 2 assignments
These assignments were given in the morning and was expected to be finished by the end of the day.  Assignments are written in english out of habit.

Dessa uppgifter var givna på förmiddagen och förväntades vara klara i slutet av dagen. Uppgifterna är skrivna på engelska, vanesak.
## Uppgift 1: Temperaturanalys för en vecka
### Beskrivning
Skapa ett program som samlar temperaturdata för en vecka och analyserar den.
### Krav
* Skapa en array för 7 dagars temperaturer (double[])
* Använd en **for-loop** för att läsa in temperaturer från användaren
* Beräkna och visa:
  * Medeltemperatur
  * Högsta temperatur (och vilken dag)
  * Lägsta temperatur (och vilken dag)
  * Antal dagar över 20°C
* Använd **enhanced for-loop** för att visa alla temperaturer
* Visa en graf med stjärnor (`*`) där varje stjärna = 2°C
## Uppgift 2: Studentbetyg för en klass
### Beskrivning
Hantera betyg för en hel klass och skapa statistik.
### Krav
* Fråga användaren om antal studenter i klassen
* Skapa en **dynamisk array** baserat på antal studenter
* För varje student:
  * Läs in namn (`String[]`)
  * Läs in 5 betyg (int-array för varje student = 2D-array)
* Använd **nested loops** för att:
  * Beräkna varje students genomsnitt
  * Hitta klassens bästa student
  * Räkna antal godkända (≥ 3) vs underkända (< 3)
* Visa en ranking-lista (sortera studenter efter genomsnitt)
## Uppgift 3: Veckans utgifter
### Beskrivning
Skapa ett program som håller reda på dina utgifter under en vecka.
### Krav
* Skapa en array för 7 dagars utgifter (`double[]`)
* Använd en **for-loop** för att läsa in utgifter från användaren
* Använd en **for-loop** för att:
  * Räkna ut totala utgifter
  * Hitta den dyraste dagen
  * Räkna dagar över 100 kr
* Visa resultat
## Uppgift 4: Handelslista med priser
### Beskrivning
Skapa en handelslista där användaren kan mata in varor och priser.
### Krav
* Fråga användaren hur många varor de vill köpa (max 10)
* Skapa arrayer för varnamn (`String[]`) och priser (`double[]`)
* Använd **for-loop** för att läsa in varor och priser
* Använd **for-loop** för att:
  * Räkna totalkostnad
  * Hitta dyraste varan
  * Visa hela listan
## Uppgift 5: Enkel tal-lek
### Beskrivning
Skapa en enkel lek där datorn väljer 5 hemliga tal och användaren ska gissa.
### Krav
* Skapa en array med 5 hemliga tal (1-20)
* Skapa en array för användarens gissningar
* Använd **while-loop** för att låta användaren gissa
* Använd **for-loop** för att kontrollera om gissningen finns bland de hemliga talen
* Räkna antal rätt gissningar
* Spelet slutar när användaren hittat alla 5 eller gissat 15 gånger