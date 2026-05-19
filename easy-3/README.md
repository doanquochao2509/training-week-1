# Between Two Sets

## Đề bài

Cho hai mảng số nguyên `a` và `b`.

Tìm tất cả các số nguyên `x` sao cho:

1. Mọi phần tử trong mảng `a` đều là ước của `x`
2. `x` là ước của mọi phần tử trong mảng `b`

Trả về số lượng số nguyên thỏa mãn.

---

## Ví dụ

Input:

2 3
2 4
16 32 96

Trong đó:

a = [2, 4]
b = [16, 32, 96]

Các số thỏa mãn:

4, 8, 16

Output:

3

---

## Ý tưởng

Ta duyệt các số từ:

max(a) -> min(b)

Với mỗi số `x`:

### Điều kiện 1
`x` phải chia hết cho mọi phần tử trong mảng `a`

Ví dụ:

x % a[i] == 0

---

### Điều kiện 2
Mọi phần tử trong mảng `b` phải chia hết cho `x`

Ví dụ:

b[i] % x == 0

---

Nếu cả hai điều kiện đều đúng:
- tăng biến đếm `count`

---

## Các bước xử lý

1. Tìm:
    - `max(a)`
    - `min(b)`

2. Duyệt từng số `x` từ `max(a)` đến `min(b)`

3. Kiểm tra:
    - `x` có chia hết cho toàn bộ `a`
    - toàn bộ `b` có chia hết cho `x`

4. Nếu đúng:
    - `count++`

5. Trả về `count`

---

## Độ phức tạp

Time Complexity:

O(K * (n + m))

Trong đó:
- `K` là khoảng từ `max(a)` đến `min(b)`
- `n` là số phần tử của mảng `a`
- `m` là số phần tử của mảng `b`

---

## Kỹ thuật sử dụng

- Loop
- Modulo (%)
- ArrayList
- Brute Force
- Collections.max()
- Collections.min()

---

## Kiến thức rút ra

- Giới hạn phạm vi duyệt bằng:
    - `max(a)`
    - `min(b)`

- Dùng phép chia dư `%` để kiểm tra:
    - chia hết
    - ước số
    - bội số

- Khi điều kiện sai:
    - dùng `break`
    - tối ưu vòng lặp