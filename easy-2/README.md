# Kangaroo

## Đề bài
Cho 2 kangaroo đứng trên trục số.

- Kangaroo 1 bắt đầu tại x1 và nhảy v1 mét mỗi lần.
- Kangaroo 2 bắt đầu tại x2 và nhảy v2 mét mỗi lần.

Xác định xem chúng có thể đứng cùng vị trí sau cùng số lần nhảy hay không.

---

## Ý tưởng

Nếu kangaroo đứng sau nhưng nhảy chậm hơn hoặc bằng kangaroo phía trước
thì sẽ không bao giờ đuổi kịp.

Ngược lại, kiểm tra xem khoảng cách giữa 2 kangaroo có chia hết cho
hiệu vận tốc hay không.

Nếu chia hết:
- gặp nhau
- trả về YES

Ngược lại:
- trả về NO

---

## Công thức

n(v1 - v2) = x2 - x1

=> n = (x2 - x1) / (v1 - v2)

n phải là số nguyên.

---

## Độ phức tạp

Time Complexity: O(1)

Space Complexity: O(1)

---

## Kỹ thuật sử dụng

- Math
- Modulo (%)
- Conditional Statement