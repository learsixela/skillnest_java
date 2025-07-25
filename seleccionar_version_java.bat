@echo off
setlocal

echo ================================
echo  Seleccionar version de Java
echo ================================
echo 1. Java 21
echo 2. Java 24
echo 3. Salir
echo.

set /p opcion=Elige una opción [1-3]: 

if "%opcion%"=="1" (
    setx JAVA_HOME "C:\Program Files\Java\jdk-21" /M
    echo JAVA_HOME cambiado a Java 21
) else if "%opcion%"=="2" (
    setx JAVA_HOME "C:\Program Files\Java\jdk-24" /M
    echo JAVA_HOME cambiado a Java 24
) else (
    echo Saliendo sin cambios...
)

echo.
pause
endlocal
