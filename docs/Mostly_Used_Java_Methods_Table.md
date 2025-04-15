# Mostly Used Java Methods

| Category   | Method                                                   | Description                                                | Example                                           |
|:-----------|:---------------------------------------------------------|:-----------------------------------------------------------|:--------------------------------------------------|
| String     | `charAt(int index)`                                      | Returns the character at the specified index.              | `String s = "hello"; char ch = s.charAt(1); // e` |
| String     | `compareTo(String anotherString)`                        | Compares two strings lexicographically.                    | `"apple".compareTo("banana"); // negative value`  |
| String     | `contains(CharSequence s)`                               | Checks whether a string contains a sequence of characters. | `"hello world".contains("world"); // true`        |
| String     | `equals(Object another)`                                 | Compares two strings. Returns true if equal.               | `"test".equals("test"); // true`                  |
| String     | `equalsIgnoreCase(String another)`                       | Compares two strings, ignoring case.                       | `"Test".equalsIgnoreCase("test"); // true`        |
| String     | `indexOf(String str)`                                    | Returns the index of the first occurrence.                 | `"hello".indexOf("e"); // 1`                      |
| String     | `isEmpty()`                                              | Checks if the string is empty.                             | `"".isEmpty(); // true`                           |
| String     | `length()`                                               | Returns the length of a string.                            | `"hello".length(); // 5`                          |
| String     | `replace(CharSequence target, CharSequence replacement)` | Replaces each substring with the specified replacement.    | `"apple".replace("p", "b"); // "abble"`           |
| String     | `split(String regex)`                                    | Splits a string into an array using regex.                 | `"a,b,c".split(","); // ["a", "b", "c"]`          |
| String     | `startsWith(String prefix)`                              | Checks if the string starts with the specified prefix.     | `"hello".startsWith("he"); // true`               |
| String     | `substring(int beginIndex, int endIndex)`                | Returns a new string which is a substring.                 | `"hello".substring(1, 3); // "el"`                |
| String     | `toLowerCase()`                                          | Converts the string to lower case.                         | `"HELLO".toLowerCase(); // "hello"`               |
| String     | `toUpperCase()`                                          | Converts the string to upper case.                         | `"hello".toUpperCase(); // "HELLO"`               |
| String     | `trim()`                                                 | Removes whitespace from both ends.                         | `" hello ".trim(); // "hello"`                    |
| String     | `valueOf(Object obj)`                                    | Returns the string representation of an object.            | `String.valueOf(123); // "123"`                   |
| Math       | `abs(x)`                                                 | Returns the absolute value.                                | `Math.abs(-5); // 5`                              |
| Math       | `max(x, y)`                                              | Returns the larger of two values.                          | `Math.max(3, 7); // 7`                            |
| Math       | `min(x, y)`                                              | Returns the smaller of two values.                         | `Math.min(3, 7); // 3`                            |
| Math       | `pow(x, y)`                                              | Returns x raised to the power y.                           | `Math.pow(2, 3); // 8.0`                          |
| Math       | `random()`                                               | Returns a random double between 0.0 and 1.0.               | `Math.random(); // e.g. 0.684`                    |
| Math       | `round(x)`                                               | Rounds to the nearest integer.                             | `Math.round(4.6); // 5`                           |
| Math       | `sqrt(x)`                                                | Returns the square root.                                   | `Math.sqrt(16); // 4.0`                           |