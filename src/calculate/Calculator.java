package calculate;

/**
 * 1. Write a java program using the following descriptions
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 * 4. Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

public class Calculator {
    int a;
    int b;
    char symbol;
    public void addition() {    //instance method - no return with no parameters
        System.out.println(a + b);
    }
        public void subtraction() {
            System.out.println(a - b);
        }
        public void division() {
            System.out.println(a / b);
        }
        public void multiplication(){
        System.out.println(a*b);
    }
    public void calculateResults(int a, int b, char symbol){  // no return with parameters
        if (symbol == '+'){                             //if else loop used
            System.out.println("Addition of "+a+" and "+b+" is: "+ (a+b));   //concatenation
        } else if (symbol == '-') {
            System.out.println("Subtraction of "+a+" and "+b+" is: "+ (a-b));
        } else if (symbol == '*') {
            System.out.println("Multiplication of "+a+" and "+b+" is: "+ (a*b));
        } else if (symbol == '/') {
            System.out.println("Division of "+a+" and "+b+" is: "+ (a/b));
        }else{
            System.out.println("Please enter correct symbol");
        }
    }
}
