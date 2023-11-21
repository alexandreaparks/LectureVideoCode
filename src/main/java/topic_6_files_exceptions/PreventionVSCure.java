package topic_6_files_exceptions;

public class PreventionVSCure {
    public static void main(String[] args) {


        /*
        Prevention is almost always better than a cure!
        -Better to prevent exceptions
        -Exception handling is slow - usually slower than checking for the issue

        Best to write code that checks for possible error conditions to avoid causing exceptions
        BUT some scenarios may be faster with try-catch blocks or be needed for error conditions out of your control
        What makes sense to you and clarity of code is also important!


        When called with a null string, this code is 40 times slower than preventing the exception
        When called with a non-null string, this code is 30% faster than preventing the exception because no str==null
        check is made

        public static int countCharactersException(String str) {
            try {
                return str.length();
            } catch (NullPointerException npe) {
                return 0;
            }
        }


        When called with a null string, this code is 40 times faster than using try-catch
        When called with a non-null string, this code is 30% slower than using try-catch because the method has to do
        the str==null check

        public static int countCharactersNullCheck(String str) {
            if (str == null) {
                return 0;
            }
            return str.length();
        }

         */
    }
}
