# Reflection Util
reflection-util is for invoke Plain Java expression text.

The purpose is to execute a simple method call expression during runtime.



**Simple Usage**

```java
ReflectionUtil.exec("Java Expression")
```

This will return Object.
Currently, only 1 expression is available.



example)

```java
ReflectionUtil.exec("new java.lang.String(\"KangMoo\")")
```

