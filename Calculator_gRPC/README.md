# Fraction Calculator with gRPC

This project implements a Fraction Calculator using gRPC (Google Remote Procedutre Call). The service and client are both written in Python, leveraging Protocol Buffers for defining the service structure and the data exchanged between client and server.

## Features

The Fraction Calculator service supports the following operations:

- `Addition`: Adds two fractions and returns the result in simplified form.
- `Subtraction`: Subtracts the second fraction from the first and returns the simplified result.
- `Multiplication`: Multiplies two fractions and simplifies the result.
- `Division`: Divides the first fraction by the second and returns the simplified result. 
- `Max`: Returns the larger of two fractions.
- `Min`: Returns the smaller of two fractions.

---

## Requirements
To run this project, you need the following:
- `Python 3.x`
- `gRPC and gRPC tools for Python`
- `protobuf`
  
Install the required packages via pip:
```
pip install grpcio grpcio-tools
```
---

## Project Structure
- `calc.proto`: The Protocol Buffer definition file, containing the `Calculator` service and `Fraction` message definitions.
- `calc_pb2.py` and `calc_pb2_grpc.py`: Generated Python code from `calc.proto` that contains the classes and methods to be used by both client and server.
- `calc_client.py`: The client-side code that sends requests to the gRPC server and prints the results of operations.
- `calc_server.py`: The server-side implementation that processes requests and returns the calculated results.

---

## Usage

### 1. Compiling the Proto File
First, generate the Python code from the Protocol Buffer file (`calc.proto`) using the following command:

**[Ensure that you are in the same directory where the `calc.proto`file is located]**

```
python -m grpc_tools.protoc -I. --python_out=. --grpc_python_out=. calc.proto
```

This command generates two files:
- `calc_pb2.py`: Contains the data classes.
- `calc_pb2_grpc.py`: Contains the service classes and stubs.

### 2. Running the Application
**Server**
Start the server by running the following command:
```
python calc_server.py
```
This will star the gRPC server on port `50054`.

---

**Client**
Once the server is running, you can run the client in another terminal to perform fraction calculations:
```
python calc_client.py
```

The result are printed in the console.

### 3. Example
Here's an example of the fraction operations performed by the client:

<img src="https://github.com/lihviaa/comp_distribuida/blob/main/assets/execucao_calc_grmp.png">

In this example, the client creates two fractions: `1/2` and `2/3`, and performs all the available operations.
