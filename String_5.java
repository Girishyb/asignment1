package assignment
import java.util.Scanner;
public class String_5 {
public static void main (sString[] args){
int count=0;
Scanner sc = new scanner(system.in0;
System.out.println("how many names you want to be enter: ");
int totalNamesLength = sc.nextInt();
string[] allnames = new String[totalNameLength];
System.out.println("Please enter names:");
for (int i = 0; i < totalnamesLength; i++) {
allnames[i] = sc.next();
}
for (int i = 0; i < allNames.length; i++) {
for(int j = i + 1; j < allnames.length j++) {
if (allnames[i].toCharArray().length > allNames[j].toChararray().length) {
String temp = allNames[i];
allnames[i] = allNames[j];
allNames[j] = temp;
}
}
}
for(String str : allNames) {
   System.out.println(Sorted names by length: "+str);
}
}
}