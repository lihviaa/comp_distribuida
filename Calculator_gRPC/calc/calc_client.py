import grpc
import calc_pb2
import calc_pb2_grpc

# Função para criar uma fração
def create_fraction(numerator, denominator):
    return calc_pb2.Fraction(numerator=numerator, denominator=denominator)


def run():
    with grpc.insecure_channel('localhost:50054') as channel:
        stub = calc_pb2_grpc.CalculatorStub(channel)

        # FRACTIONS
        frac1 = create_fraction(1, 2)
        frac2 = create_fraction(2, 3)
        print(f"F1: {frac1.numerator}/{frac1.denominator}")
        print(f"F2: {frac2.numerator}/{frac2.denominator}")

        # ADDITION
        print("\n************** ADDITION ************** ")
        response = stub.Add(calc_pb2.FractionOpRequest(fraction1=frac1, fraction2=frac2))
        print(f"Result: {response.result.numerator}/{response.result.denominator}")

        # SUBTRACTION
        print("\n************ SUBTRACTION ************* ")
        response = stub.Sub(calc_pb2.FractionOpRequest(fraction1=frac1, fraction2=frac2))
        print(f"Result: {response.result.numerator}/{response.result.denominator}")

        # MULTIPLICATION
        print("\n********** MULTIPLICATION ************ ")
        response = stub.Mult(calc_pb2.FractionOpRequest(fraction1=frac1, fraction2=frac2))
        print(f"Result: {response.result.numerator}/{response.result.denominator}")

        # DIVISION
        print("\n************** DIVISION ************* ")
        response = stub.Div(calc_pb2.FractionOpRequest(fraction1=frac1, fraction2=frac2))
        print(f"Result: {response.result.numerator}/{response.result.denominator}")
        
		# MAX
        print("\n**************** MAX **************** ")
        response = stub.Max(calc_pb2.FractionOpRequest(fraction1=frac1, fraction2=frac2))
        print(f"Result: {response.result.numerator}/{response.result.denominator}")
        
		# MIN
        print("\n**************** MIN **************** ")
        response = stub.Min(calc_pb2.FractionOpRequest(fraction1=frac1, fraction2=frac2))
        print(f"Result: {response.result.numerator}/{response.result.denominator}")

if __name__ == '__main__':
	run()
