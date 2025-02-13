# Scala Bug: Missing Exception Handling in String to Int Conversion

This repository demonstrates a common bug in Scala: missing exception handling when converting a String to an Int.  The `MyClass` constructor attempts to convert a String to an Int without handling potential `NumberFormatException`s.  The solution demonstrates how to handle this exception gracefully.