Zadanie 31.
Napisz program, który policzy wystąpienia każdego słowa w pliku tekstowym 
a następnie wyniki zapisze w formie tabelki w nowym pliku.

Można użyć regex'a do wyczyszczenia z interpunkcji i innych rzeczy
regex1 = [^\p{L}\s]
line.replaceAll("[^\\p{L}\\s]", "")

inny przykład
regex2 = [^0-9a-zA-Ząćęłńóśźż]

