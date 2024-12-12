# Task 2 - ArrayFinder

## Overview

The findSubarrayIndex method takes two arrays as input - array and subArray.
It checks where (if at all) subArray appears as a continuous segment in array.
If found, the method returns the starting index; otherwise, it returns -1.

## Logic

Loop through each possible starting position in array where subArray could fit.
Use Arrays.copyOfRange to extract a slice of array with the same length as subArray and compare it using Arrays.equals
