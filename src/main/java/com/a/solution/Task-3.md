# Task 3 - Constructive Feedback

## Readability
The nested if statements make the code difficult to read and maintain. This should be refactored for clarity.
E.g. We could use early returns or a boolean expression to flatten the structure.

## Null Safety
There is no guarantee that getTeacherName() or student itself is not null. Consider adding null checks to avoid potential NullPointerException.

## String Comparison
The method getTeacherName() is being compared to "Lee" using ==, which checks for reference equality in rather than string content equality. Consider using .equals() instead.
E.g.
`student.getTeacherName().equals("Lee")`

## Magic String
"Lee" is a magic string, which makes the code harder to maintain. Consider replacing it with a named constant for better readability and maintainability.
E.g.
`public enum Teacher {
    LEE, SMITH, BROWN;
}`


## Method Name
The method name `checkStudy` is does not clearly indicate its purpose. Consider renaming it to something more descriptive, like `isEligibleForStudy`.

## Single Responsibility
This method is performing multiple checks - login status, teacher name, course enrolment, and distinction. Consider breaking it into smaller, reusable methods for each check.
E.g.
`private boolean isLoggedIn(Student student);
private boolean hasTeacherNamedLee(Student student);
private boolean isEnrolledInMaths(Student student);
private boolean hasDistinction(Student student);`

## Boolean Logic
The checks could be combined into a single conditional statement for clarity.
E.g.
`return student != null && student.isLoggedIn() && "Lee".equals(student.getTeacherName()) && student.isEnrolledInMaths() && student.hasDistinction();`

## Unit Test
Ensure there are unit tests for this method to handle all edge cases, including null values, missing attributes, and failing conditions.
