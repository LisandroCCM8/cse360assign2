/*
Name: Lisandro Cuestas
Assignment #: 2
Class ID: Friday 9:40 - 10:30
Description: Create a calculator adds or subtracts and prints out the order in which the operations
             were performed.
*/
package cse360assign2;
import java.util.ArrayList;
import java.util.List;


public class AddingMachine
{

    private int total;
    // create arrayList to store operators
    private List<String> operators = new ArrayList<>();

    // create arrayList to store integers being used. Initialize with 0
    private List<Integer> valueInt = new ArrayList<>();
    {
        {
            // add initial value, 0, to values list
            add(0);
        }
    }


    // constructor for AddingMachine class
    public AddingMachine ()
    {
        total = 0;  // not needed - included for clarity
        // make operators list empty
        operators.clear();
    }

    // used to return current total
    public int getTotal ()
    {
        // return total value
        return total;
    }

    // add parameter to total
    public void add (int value)
    {
        // add value to valueInt list
        valueInt.add(value);
        // add operator to operator list
        operators.add("+");
        // add value to total
        total = total + value;

    }

    // subtract parameter from total
    public void subtract (int value)
    {
        // add value to valueInt list
        valueInt.add(value);
        // add operator to operators list
        operators.add("-");
        // subtract value from total
        total = total - value;
    }

    // print out operations performed
    public String toString ()
    {
        // create string object to hold string that displays the operations performed in adding machine
        StringBuilder sb = new StringBuilder();
        // create variables to iterate through operator and value lists
        int operatorIndex = 0;
        int valuesIndex = 0;

        // put the initial value 0 into the string first
        sb.append(valueInt.get(valuesIndex)).append(" ");
        valuesIndex++;

        // use while loop to iterate through lists. Add values and operators to string until there are
        // no more operators or values to add.
        while (operatorIndex < operators.size() && valuesIndex < valueInt.size())
        {
            // append operator and value to string builder object
            sb.append(operators.get(operatorIndex)).append(" ").append(valueInt.get(valuesIndex)).append(" ");
            // increment both indexes by one to get next value and operator.
            operatorIndex++;
            valuesIndex++;
        }
        // return the completed string
        return sb.toString();
    }

    public void clear() {

    }
}
