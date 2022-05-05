package com.interview2;

/*
gramming challenge description:

Determine if two URIs match. For the purpose of this challenge, you should use a case-sensitive octet-by-octet comparison of the entire URIs, with these exceptions:

1. A port that is empty or not given is equivalent to the default port of 80
2. Comparisons of host names MUST be case-insensitive
3. Comparisons of scheme names MUST be case-insensitive
4. Characters are equivalent to their % HEX HEX encodings. (Other than typical reserved characters in urls like , / ? : @ & = + $ #)

e.g.
http://hk.yahoo.com/
http://hk.yahoo.com:80/
true

http://www.google.com/calendar
http://www.GOOGLE.com:80/calendar
true

http://www.google.com/%7Ecalendar
http://www.google.com/~calendar
true

Your program should read lines from standard input. Each line contains two urls delimited by a semicolon.

Output:

Print out True/False if the URIs match.
 */
public class Uri {
}
