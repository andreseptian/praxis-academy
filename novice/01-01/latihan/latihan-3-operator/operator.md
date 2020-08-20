Operator Aritmatika
perator	Deskripsi	Contoh
+ (Penambahan)	Menambahkan nilai di kedua sisi operator.	A + B akan menghasilkan 30
- (Pengurangan)	Mengurangi operan kanan dari operan kiri.	A - B akan memberi -10
* (Perkalian)	Mengalikan nilai di kedua sisi operator.	A * B akan memberi 200
/ (Divisi)	Membagi operan kiri dengan operan kanan.	B / A akan memberi 2
% (Modulus)	Membagi operan kiri dengan operan kanan dan mengembalikan sisanya.	B% A akan memberi 0
++ (Kenaikan)	Meningkatkan nilai operan sebanyak 1.	B ++ menghasilkan 21
- (Penurunan)	Menurunkan nilai operan sebesar 1.	B-- memberi 19

Operator Relasional
Operator	Deskripsi	Contoh
== (sama dengan)	Memeriksa apakah nilai dari dua operan sama atau tidak, jika ya maka kondisinya menjadi benar.	(A == B) tidak benar.
! = (tidak sama dengan)	Memeriksa apakah nilai dari dua operan sama atau tidak, jika nilai tidak sama maka kondisi menjadi benar.	(A! = B) benar.
> (lebih dari)	Memeriksa apakah nilai operan kiri lebih besar dari nilai operan kanan, jika ya maka kondisi menjadi benar.	(A> B) tidak benar.
<(kurang dari)	Memeriksa apakah nilai operan kiri kurang dari nilai operan kanan, jika ya maka kondisinya menjadi benar.	(A <B) benar.
> = (lebih besar dari atau sama dengan)	Memeriksa apakah nilai operan kiri lebih besar dari atau sama dengan nilai operan kanan, jika ya maka kondisi menjadi benar.	(A> = B) tidak benar.
<= (kurang dari atau sama dengan)	Memeriksa apakah nilai operan kiri kurang dari atau sama dengan nilai operan kanan, jika ya maka kondisi menjadi benar.	(A <= B) benar.

Operator Bitwise
Operator	Deskripsi	Contoh
& (bitwise dan)	Biner AND Operator menyalin sedikit ke hasil jika ada di kedua operan.	(A & B) akan memberikan 12 yaitu 0000 1100
| (bitwise atau)	Biner OR Operator menyalin sedikit jika ada di salah satu operan.	(A | B) akan menghasilkan 61 yaitu 0011 1101
^ (XOR bitwise)	Operator Biner XOR menyalin bit jika diatur dalam satu operan tetapi tidak keduanya.	(A ^ B) akan menghasilkan 49 yaitu 0011 0001
~ (pujian bitwise)	Operator Pelengkap Binary Ones adalah unary dan memiliki efek bit 'membalik'.	(~ A) akan memberikan -61 yaitu 1100 0011 dalam bentuk komplemen 2 karena bilangan biner bertanda.
<< (shift kiri)	Operator Binary Left Shift. Nilai operan kiri dipindahkan ke kiri dengan jumlah bit yang ditentukan oleh operan kanan.	A << 2 akan menghasilkan 240 yaitu 1111 0000
>> (shift kanan)	Operator Pergeseran Kanan Biner. Nilai operan kiri dipindahkan ke kanan dengan jumlah bit yang ditentukan oleh operan kanan.	A >> 2 akan menghasilkan 15 yaitu 1111
>>> (nol mengisi shift kanan)	Geser operator pengisian nol ke kanan. Nilai operan kiri dipindahkan ke kanan dengan jumlah bit yang ditentukan oleh operan kanan dan nilai yang digeser diisi dengan nol.	A >>> 2 akan menghasilkan 15 yaitu 0000 1111

The Logical Operators
Operator	Description	Example
&& (logical and)	Called Logical AND operator. If both the operands are non-zero, then the condition becomes true.	(A && B) is false
|| (logical or)	Called Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true.	(A || B) is true
! (logical not)	Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false.	!(A && B) is true

The Assignment Operators
Operator	Description	Example
=	Simple assignment operator. Assigns values from right side operands to left side operand.	C = A + B will assign value of A + B into C
+=	Add AND assignment operator. It adds right operand to the left operand and assign the result to left operand.	C += A is equivalent to C = C + A
-=	Subtract AND assignment operator. It subtracts right operand from the left operand and assign the result to left operand.	C -= A is equivalent to C = C – A
*=	Multiply AND assignment operator. It multiplies right operand with the left operand and assign the result to left operand.	C *= A is equivalent to C = C * A
/=	Divide AND assignment operator. It divides left operand with the right operand and assign the result to left operand.	C /= A is equivalent to C = C / A
%=	Modulus AND assignment operator. It takes modulus using two operands and assign the result to left operand.	C %= A is equivalent to C = C % A
<<=	Left shift AND assignment operator.	C <<= 2 is same as C = C << 2
>>=	Right shift AND assignment operator.	C >>= 2 is same as C = C >> 2
&=	Bitwise AND assignment operator.	C &= 2 is same as C = C & 2
^=	bitwise exclusive OR and assignment operator.	C ^= 2 is same as C = C ^ 2
|=	bitwise inclusive OR and assignment operator.	C |= 2 is same as C = C | 2


