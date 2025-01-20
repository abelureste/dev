#basic data types
string: str = 'Abel'
integer: int = 21
decimal: float = 2.5
boolean: bool = False

lists: list = ['Abel', 'Angela', 'Chewy']
tuples: tuple = (1.5, 2.5)                          #inmutable, cannot remove or add anything to it
sets: set = {1, 4, 7, 8}                            #everything must be unique, no duplicates.
dictonary: dict = {'name': 'Abel', 'age': 21}

#basic function
def hello() -> None:                    #putting "-> None" indicates no return value should be expected from it
    print("Hello,", string)             
hello()

#function with parameter
def hello2(name: str) -> None:
    print(f'Hello, {name}!')
hello2('Angela')

#function with two parameters
def add(a: float, b: float) -> float:   #putting "-> float" indicates that the return value will be a float
    return a + b 
print(add(1,2))

#class with attributes
class Car:
    def __init__(self, color: str, horsepower: int) -> None:
        self.color = color              #color attribute
        self.horsepower = horsepower    #horsepower attribute

volvo: Car = Car('red', 200)
print(volvo.color)
print(volvo.horsepower)

bmw: Car = Car('blue', 240)
print(bmw.color)
print(bmw.horsepower)

#class with attributes and methods
class Car2:
    def __init__(self, brand: str, horsepower: int) -> None:
        self.brand = brand              #color attribute
        self.horsepower = horsepower    #horsepower attribute

    def drive(self) -> None:            #method referring to self.brand
        print(f'{self.brand} is driving!')

    def getinfo(self) -> None:          #method referring to self.brand and self.horsepower
        print(f'{self.brand} with {self.horsepower} horsepower')

volvo2: Car2 = Car2('Volvo', 200)
volvo2.drive()
volvo2.getinfo()

bmw2: Car2 = Car2('Bmw', 240)
bmw2.drive()
bmw2.getinfo()

#class with attributes and a method with parameters
class Car3:
    def __init__(self, brand: str, horsepower: int) -> None:
        self.brand = brand              #color attribute
        self.horsepower = horsepower    #horsepower attribute

    def drive(self, distance: int) -> None:            #method referring to self.brand and has an integer parameter for distance driven
        print(f'{self.brand} is driving {distance} miles!')

volvo3: Car3 = Car3('Volvo', 200)
volvo3.drive(10)

bmw3: Car3 = Car3('Bmw', 240)
bmw3.drive(25)

#class with dunder methods
class Car4:
    def __init__(self, brand: str, horsepower: int) -> None:
        self.brand = brand              #color attribute
        self.horsepower = horsepower    #horsepower attribute

    def __str__(self) -> str:               #"__str__" is the dunder method here that provides a string representation of objects
        return f'{self.brand}, {self.horsepower}hp'

    def __add__(self, other: str) -> str:   #"__add__" is the dunder method here that defines how objects will be added together
        return f'{self.brand} & {other.brand}'

volvo4: Car4 = Car4('Volvo', 200)
print(volvo4)

bmw4: Car4 = Car4('Bmw', 240)
print(volvo4 + bmw4)
