class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def mostrar_info(self):
        print(f"Parte: {self.nombre} | Peso: {self.peso} kg")

class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []

    def agregar_parte(self, parte):
        self.partes.append(parte)

    def mostrar_avion(self):
        print(f"Modelo: {self.modelo}")
        print(f"Fabricante: {self.fabricante}")
        print("Partes:")
        for parte in self.partes:
            parte.mostrar_info()

avion = Avion("Boeing 747", "Boeing")
avion.agregar_parte(Parte("Motor", 1800.0))
avion.agregar_parte(Parte("Alas", 2500.5))
avion.agregar_parte(Parte("Tren de aterrizaje", 800.3))

avion.mostrar_avion()
