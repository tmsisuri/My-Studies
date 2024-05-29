public class JavaException {
    //Errors

        //1 - Compile time errors (syntex errors)
        //These errors occur when the programmer violates the rules of the Java language
        //The Java compiler identifies these errors during the compilation process
        //Examples --> Missing semicolons (;) , Misspelled keywords , Improper use of braces ({}) and parentheses (()) , Incorrect method declarations

        //2 - Run time errors
        //These errors occur while the program is running. 
        //They typically result from illegal operations performed by the code
        //Runtime errors lead to the abnormal termination of the program unless they are properly handled using exception handling mechanisms
        //Examples --> Division by zero , Null pointer dereference , Array index out of bounds , File not found

        //3 - Logical errors
        //Logical errors occur when the program runs without crashing, but it produces incorrect results 
        //These errors are due to flaws in the program's logic and are often the most difficult to detect and fix

        //4 - Exceptions
        //Exceptions are events that disrupt the normal flow of the program. 
        //Java provides a robust exception handling mechanism to manage these disruptions
        //all the runtime exeptions are called uncheked exeptions and all the other exeptions are called cheked exeptions

            //Checked Exceptions
            //Checked exceptions are checked at compile-time
            //The programmer must handle these exceptions using try-catch blocks or declare them using the throws keyword

            //Unchecked Exceptions
            //Unchecked exceptions, also known as runtime exceptions, are not checked at compile-time
            //They occur during the execution of the program and are usually indicative of programming bugs, such as logic errors or improper use of APIs

            //Errors
            //Errors in Java are not exceptions but serious problems that a reasonable application should not try to catch
            //They are usually abnormal conditions such as JVM-level issues
}
