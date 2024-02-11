//Write a program that takes an integer as input and returns true if the input is a power of two.

#include <iostream>

bool isPowerOfTwo(int num) {
    //Here we check if the number is greater than 0
    return (num > 0) && ((num & (num - 1)) == 0);
}

int main() {
    int input;

    // input an interger value
    std::cout << "Enter an integer: ";
    std::cin >> input;

    // Check if the input is a power of two and display the result
    if (isPowerOfTwo(input)) {
        std::cout << input << " true " << std::endl;
    } else {
        std::cout << input << " false " << std::endl;
    }

    return 0;
}
