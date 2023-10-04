def min_steps_to_palindrome(s):
    # Initialize pointers and step counter
    left, right = 0, len(s) - 1
    steps = 0

    while left < right:
        if s[left] == s[right]:
            # Characters match, no swap needed
            left += 1
            right -= 1
        else:
            # Characters don't match, swap needed
            right -= 1
            steps += 1

    return steps

# Example usage:
s = "naman"
steps = min_steps_to_palindrome(s)
print(f"Minimum steps to palindrome: {steps}")