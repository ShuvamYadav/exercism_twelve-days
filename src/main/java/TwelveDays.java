class TwelveDays {
    String versesList[]= {" a Partridge in a Pear Tree."," two Turtle Doves,"," three French Hens,"," four Calling Birds,"," five Gold Rings,"," six Geese-a-Laying,"," seven Swans-a-Swimming,"," eight Maids-a-Milking,"," nine Ladies Dancing,"," ten Lords-a-Leaping,"," eleven Pipers Piping,"," twelve Drummers Drumming,"};
    String days[]={"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
    String verse(int verseNumber) {
        String finalVerse= "On the "+days[verseNumber-1]+" day of Christmas my true love gave to me:";
        if(verseNumber==1)
            return "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n";
        else{
        for(int i=verseNumber-1;i>=0;i--){
            if(i==0)
                finalVerse+=" and"+versesList[i];
            else
                finalVerse+=versesList[i];
            }
            return finalVerse+"\n";
        }
    }
    String verses(int startVerse, int endVerse){
        String finalVerses="";
        for(int i=startVerse-1;i<endVerse;i++){
            finalVerses+="On the "+days[i]+" day of Christmas my true love gave to me:";
            if(i==0)
                finalVerses+=versesList[i]+"\n\n";
            else{
                for(int j=i;j>=0;j--){
                    if(j==0)
                        finalVerses+=" and"+versesList[j];
                    else
                        finalVerses+=versesList[j];
                 }
                if(i==endVerse-1)
                    finalVerses+="\n";
                else
                    finalVerses+="\n\n";
            }
        }
        return finalVerses;
    }
    
    String sing() {
        String finalVerses="";
        for(int i=0;i<12;i++){
            finalVerses+="On the "+days[i]+" day of Christmas my true love gave to me:";
            if(i==0)
                finalVerses+=versesList[i]+"\n\n";
            else{
                for(int j=i;j>=0;j--){
                    if(j==0)
                        finalVerses+=" and"+versesList[j];
                    else
                        finalVerses+=versesList[j];
                 }
                if(i==11)
                    finalVerses+="\n";
                else
                    finalVerses+="\n\n";
            }
        }
        return finalVerses;
    }
}
