package topic_6_files_exceptions;

public class WritingToFilesIntro {
    public static void main(String[] args) {

        /*
        * File Writing
        * Several different Java library classes for file input and output
        *
        * In class, we are focusing on reading and writing text files sequentially - line-by-line
        * Opening a text file, and starting to read at the beginning
        * Creating a file and writing lines to the file
        * Opening a file and appending data to the end of that file
        *
        * In all cases, writing text data line-by-line or reading line-by-line
        *
        * Steps for writing to a file:
        * 1. Either create and open file for writing, OR open an existing file to add data
        * 2. Write data
        * 3. Close the file
        *
        * FileWriter object can open, create, close, and write to a file
        * FileWriter can write out strings or chars to a file
        * If file doesn't exist, then FileWriter will create it
        * If file does exist, it will be overwritten
        * If you don't want to overwrite your data, then use the append flag
        *
        * FileWriter and BufferedWriter
        *
        * File I/O is slow - around 1000 times slower than reading/writing to memory
        * BufferedWriter class wraps FileWriter and handles I/O in background of the program
        * This way, memory-based operations can continue while the file is being used
        */
    }
}
