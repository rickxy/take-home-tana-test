# Take-Home Tana Test

### Language
- **Java 19**

---

## How the Solutions Work

### Question 1 – `Question1_GetLongestString.java`
Finds the longest string in an array that:
- Contains only valid characters
- Has no consecutive duplicate letters  
 Used a `Set` and simple iteration.

### Question 2 – `Question2_UniqueSums.java`
Counts the number of unique combinations from the array that sum up to a target value.  
 Backtracking with `Set<String>` for uniqueness.

### Question 3 – `Question3_DecrementPossible.java`
Checks if array can be reduced to zero (except first element) using subtraction rules.  
 Simulates allowed operations iteratively.

### Question 4 – `Question4_FirstUniqueProduct.java`
Finds the first string in the array that appears only once.  
 Used `LinkedHashMap` to preserve order.

### Question 5 – `Question5_ClosestMinimumDistance.java`
Finds the minimum distance between the closest occurrences of the smallest number.  
 Tracks previous index of minimums.

### Question 6 – `Question6_TopThreeWords.java`
Finds the 3 most frequent words in a sentence and returns them alphabetically.  
 Used a `PriorityQueue` and final sort.

### Question 7 – `Question7_RotateLinkedList.java`
Rotates a singly linked list to the right `n` times.  
 Converts to circular list, then breaks it.

---

## How to Run

From the terminal, for each question:

### Question 1
```bash
javac Question1_GetLongestString.java
javac tests/Question1_Test.java
java tests.Question1_Test
```

### Question 2
```bash
javac Question2_SubsetSumCount.java
javac tests/Question2_Test.java
java tests.Question2_Test
```

### Question 3
```bash
javac Question3_DecrementPossible.java
javac tests/Question3_Test.java
java tests.Question3_Test
```

### Question 4
```bash
javac Question4_FirstUniqueProduct.java
javac tests/Question4_Test.java
java tests.Question4_Test
```

### Question 5
```bash
javac Question5_ClosestMinimumDistance.java
javac tests/Question5_Test.java
java tests.Question5_Test
```

### Question 6
```bash
javac Question6_TopThreeWords.java
javac tests/Question6_Test.java
java tests.Question6_Test
```

### Question 7
```bash
javac Question7_RotateLinkedList.java
javac tests/Question7_Test.java
java tests.Question7_Test
```

**Note:**
- Used the `tests.` prefix when running test classes.
