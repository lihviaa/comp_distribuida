# Remote Calculator

This project implements a remote calculator service using Java RMI (Remote Method Invocation). It supports operations on different types of numbers: doubles, fractions, and complex numbers.

## Folder Structure

The workspace contains three main folders, where:

- `assets`: the foulder that contains the execution png
- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Overview

The project consists of the following main components:

**1. Calulator Interface** - Defines remote methods for arithmetic operations on doubles, fractions, and complex numbers.

**2. CalculatorServer** - Implements the Calculator interface and provides remote calculation services.

**3. CalculatorClient** - A client application to interact with the CalculatorServer and perform various operations.

**4. ComplexNum** - Complex number class, supports arithmetic operations.

**5. Fraction** - Fraction class, supports arithmetic operations.


### Components
**1. Calculator (Interface)**
Defines the following remote methods:

- Double Operations: `add`, `sub`, `multiply`, `divide`
- Fraction Operations: `add`, `sub`, `multiply`, `divide`, `max`, `min`
- Complex Number Operations: `add`, `sub`, `multiply`, `divide`, `max`, `min`
  
**2. CalculatorServer**
Implements the  `Calculator` interface and provides the functionality for arithmetic operations on doubles, fractions, and complex numbers. The server is registered with the RMI registry.

**3. CalculatorClient**
Connects to the `CalculatorServer`, performs remote method invocations, and prints the results. It demonstrates usage for double operations, fraction operations, and complex number operations.

**4. ComplexNum**
Represents complex numbers and provides methods for addition, subtraction, multiplication, division, and comparison based on modulus.

**5. Fraction**
Represents fractions and provides methods for addition, subtraction, multiplication, division, and comparison based on value.

## Setup and Usage
**1. Compile the Code** 
Ensure you have `JDK` installed. Compile the code using the following commands:
```
javac Calculator.java
javac CalculatorServer.java
javac CalculatorClient.java
javac ComplexNum.java
javac Fraction.java
```

**2. Start the Calculator Server**
Run the CalculatorServer to start the remote service:
```
java CalculatorServer
```

**3. Run the Calculator Client**
In a separate terminal, run the CalculatorClient to interact with the server:
```
java CalculatorClient
```

## Example Output
Upon running the client, you will see output for operations with double values, fractions, and complex numbers, such as:

<img src ="https://github.com/lihviaa/comp_distribuida/blob/main/assets/execucao.png" alt="Execução do programa">

## Notes
- Ensure that the RMI registry is running before starting the server.
- The client assumes the server is running on localhost and the default port 1099.
