# Program To Find The Armstrong Numbers

We'll write a program that finds whether a number is an Armstrong number or not with the Java loops.

## Armstrong Sayı Nedir ?

An n-digit number is called an Armstrong number if the sum of the n-th powers of the digits is equal to the number itself.

**For Example:** Let's take the number 407. The number give us that result:<p> **(4^3)+ (0^3)+(7^3) = 64+0+343 = 407**<p>That's why the number **407** is an Armstrong number.

Now take the number **1342** <p>(1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 is not equal to the number 1342. Because of that, **the number 1342 is not an Armstrong Number.**<p>
We can give more examples like below for Armstrong Number;

1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748

### Hint:

```
while(!(number == 0)){
            findDigit++;
            number = number / 10;
        }
        System.out.print("Number Of Digit: " + findDigit);

```

That's it! You can find how many digit of the numbers.**(You can define the number by yourself.)**