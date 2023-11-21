package topic_6_files_exceptions;

public class ReadingFilesIntro {
    public static void main(String[] args) {

        /*
        Reading a file

        Simplest to read line-by-line from beginning to end

        Use a BufferedReader to "wrap" a FileReader

        FileReader handles opening and closing the file, and can read a file character-by-character
        BufferedReader provides a readLine method to collect all the characters from one line, put them together
        into a String, and then return the String to your program

        You have to read a whole file to find out how many lines of data are in the file and know when you've
        reached the end of the file

        BufferedReader's readLine() method reads one line and returns it as a String, then it prepares to read
        the next line of the file
        When BufferedReader gets to the end of the file, there are no more lines to read so readLine will return null
        To read an entire file, use a while loop that repeats while readLine() != null
        (null = special value that means "no data")
         */
    }
}
