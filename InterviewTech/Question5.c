//Write a program that takes an integer as input and returns an integer with reversed digit 
//ordering

#include <stdio.h>

//defines a function reverseInteger
int reverseInteger(int num) {
    int reversed = 0;

    while (num != 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }

    return reversed;
}

//main function takes user input, calls the reverseInteger function, and then prints the reversed integer
int main() {
    int input;

    // Get user input
    printf("Enter an integer: ");
    scanf("%d", &input);

    // Reverse the integer and display the result
    int reversed = reverseInteger(input);
    printf("Reversed integer: %d\n", reversed);

    return 0;
}
