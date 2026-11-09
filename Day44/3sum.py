class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        result = []
        nums.sort()
        n = len(nums)

        for i in range(n - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            if nums[i] > 0:
                break

            left = i + 1
            right = n - 1  # Fix 1: Start at the last index.

            while left < right:
                total = nums[i] + nums[left] + nums[right]

                if total == 0:
                    # Fix 2: Use the actual pointer names.
                    result.append([nums[i], nums[left], nums[right]])

                    while left < right and nums[left] == nums[left + 1]:
                        left += 1

                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1

                    left += 1
                    right -= 1

                elif total < 0:
                    left += 1

                else:
                    right -= 1

        return result