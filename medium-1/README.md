# Extra Long Factorials

## Đề bài

Tính giai thừa của số nguyên n.

n! = n × (n - 1) × ... × 1

Do factorial có thể rất lớn nên cần sử dụng BigInteger.

---

## Ý tưởng

Khởi tạo:

result = 1

Duyệt từ 2 đến n:
- nhân dồn vào result

Sử dụng BigInteger để tránh tràn số.

---

## Ví dụ

5! = 5 × 4 × 3 × 2 × 1 = 120

---

## Độ phức tạp

Time Complexity: O(n)

Space Complexity: O(1)

---

## Kỹ thuật sử dụng

- Loop
- BigInteger
- Multiplication