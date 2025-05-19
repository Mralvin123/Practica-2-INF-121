class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre

    def mostrar_info(self):
        print(f"Estudiante: {self.nombre} | Carrera: {self.carrera} | Semestre: {self.semestre}")

class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []

    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self.nombre}")
        for estudiante in self.estudiantes:
            estudiante.mostrar_info()

est1 = Estudiante("Lucía Méndez", "Ingeniería", 3)
est2 = Estudiante("Carlos Ruiz", "Medicina", 5)
est3 = Estudiante("Ana Torres", "Derecho", 2)

uni = Universidad("Universidad Central")
uni.agregar_estudiante(est1)
uni.agregar_estudiante(est2)
uni.agregar_estudiante(est3)

uni.mostrar_universidad()
