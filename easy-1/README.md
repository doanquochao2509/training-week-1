# Grading Students

## Ý tưởng
- Nếu `grade < 38` -> giữ nguyên (failing grade, không lam tròn)
- Tính bội số tiếp theo của 5: `nextMultiple = ((grade / 5) + 1) * 5`
- Nếu `nextMultiple - grade < 3` -> làm tròn lên `nextMultiple`
- Ngược lại -> giữ nguyên

## Độ phức tạp
- Time: O(n) - duyệt qua từng phần tử một lần
- Space: O(1) - chỉnh sửa in-place, không dùng bộ nhớ phụ

## Kỹ thuật sử dụng
- Loop: duyệt qua danh sách grades
- Integer Division: `(grade / 5) * 5` để tìm bội số gần nhất
- Modulo (%): có thể dùng thay thế `5 - (grade % 5)` để tính khoảng cách
- ArrayList: lưu trữ và chỉnh sửa trực tiếp

## Edge Cases
- grade = 38 -> hợp lệ, áp dụng làm tròn bình thường
- grade = 37 -> không làm tròn dù cách 40 chỉ 3
- grade đã là bội số của 5 (ví dụ 75) -> nextMultiple = 80, khoảng cách = 5 >= 3 -> giữ nguyên

## Ví dụ
| Input | nextMultiple | Khoảng cách | Output |
|-------|-------------|-------------|--------|
| 73    | 75          | 2 (< 3)     | 75     |
| 67    | 70          | 3 (>= 3)    | 67     |
| 38    | 40          | 2 (< 3)     | 40     |
| 33    | 35          | 2 (< 3)     | 33 (< 38, giữ nguyên) |