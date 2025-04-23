| Primitive   | Size      | Range                                      | Default     | Wrapper      |
|-------------|-----------|--------------------------------------------|-------------|--------------|
| **byte**    | 8-bit     | –2⁷ … 2⁷– 1  (–128 … 127)                   | 0           | `Byte`       |
| **short**   | 16-bit    | –2¹⁵ … 2¹⁵– 1  (–32 768 … 32 767)         | 0           | `Short`      |
| **int**     | 32-bit    | –2³¹ … 2³¹– 1  (–2 147 483 648 … 2 147 483 647) | 0           | `Integer`    |
| **long**    | 64-bit    | –2⁶³ … 2⁶³– 1                              | 0L          | `Long`       |
| **float**   | 32-bit    | ±1.4 × 10⁻⁴⁵ … ±3.4 × 10³⁸                  | 0.0f        | `Float`      |
| **double**  | 64-bit    | ±4.9 × 10⁻³²⁴ … ±1.7 × 10³⁰⁸                | 0.0d        | `Double`     |
| **char**    | 16-bit    | 0 … 2¹⁶– 1  (UTF-16 code unit)             | `'\u0000'` | `Character`  |
| **boolean** | ≥1 bit    | `true` / `false`                           | `false`     | `Boolean`    |

---

### 1. Literals, Defaults & Operators

#### Literals & Defaults  
- **Integer literals** (no suffix) → `int` by default  
- **Long literals**: append `L` or `l` (e.g. `123L`)  
- **Floating literals** (with decimal) → `double` by default  
- **Float literals**: append `f` or `F` (e.g. `3.14f`)  

#### Shorthand (Compound & Increment/Decrement) Operators  
- **Compound Assignments** (numeric types & `char`):  
  
  x += 5;   // x = x + 5;
  x -= 3;   // x = x - 3;
  x *= 2;   // x = x * 2;
  x /= 4;   // x = x / 4;
  x %= 2;   // x = x % 2;
  x <<= 1;  // x = x << 1;
  x >>= 2;  // x = x >> 2;
  x &= 0xFF;// x = x & 0xFF;
  x ^= mask;// x = x ^ mask;
  x |= flag;// x = x | flag;
  ```
- **Increment/Decrement**:  
  
  ++i; // pre-increment (increment, then use)
  i++; // post-increment (use, then increment)
  --i; // pre-decrement
  i--; // post-decrement
  ```

These shorthand forms simplify arithmetic and bitwise code.

### 2. Widening vs. Narrowing Conversions  
- **Widening (implicit)** – safe, no cast needed: 

  byte → short → int → long → float → double
  char → int → long → float → double
  ```  
- **Narrowing (explicit)** – may lose data, requires cast:  

  int i = (int) 1234567890123L;
  float f = (float) 3.141592653589793;
  ```

### 3. Autoboxing & Unboxing  
- **Autoboxing**: primitive → wrapper  
  Integer iObj = 42;     // auto-boxed from int
  ```  
- **Unboxing**: wrapper → primitive  
  
  int i = iObj;          // auto-unboxed
  ```

### 4. Parsing & Utility Methods  
- Converting strings:  

  int    x = Integer.parseInt("123");
  double y = Double.parseDouble("3.14");
  boolean b = Boolean.parseBoolean("true");
  ```  
- Wrapper constants:  
  
  Integer.MAX_VALUE;    //  2_147_483_647
  Integer.MIN_VALUE;    // –2_147_483_648
  Double.MAX_VALUE;     //  1.7976931348623157e308
  // etc.
  ```

### 5. Common Usage Tips  
- **Use `int`** for counters, array indexes, loops.  
- **Use `long`** for timestamps or very large integer values.  
- **Use `double`** for general-purpose decimal arithmetic; **`BigDecimal`** for money.  
- **Use `char`** for single characters; **`String`** for text.  
- **Use `boolean`** for flags, conditions, binary choices.  

### 6. Beyond Primitives  
- **`BigInteger`** / **`BigDecimal`** (in `java.math`) for arbitrary-precision arithmetic.  
- **`String`** isn’t a primitive but is by far the most used “text” type.

