#Tipos int, floar, string, bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola Alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

#Manejo de cadenas (string)
miGrupoFavorito = "Las Pastillas del Abuelo"
print("Mi Grupo favorito es: " + miGrupoFavorito)   #el + funciona como concatenación

miGrupoFavorito = "Las Pastillas del Abuelo:" + " "  + "La mejor"
print("Mi grupo favorito es: " + miGrupoFavorito)


miGrupoFavorito = "Las Pastillas del Abuelo"
caracteristicas = "La mejor banda Argentina"
print("Mi Grupo favorito es:" , miGrupoFavorito , caracteristicas)   #La coma agrega el espacio

num1 = "7"
num2 = "8"
print(num1 + num2)

print(int(num1) + int(num2))

#Tipos booleanos (bool)
miBooleano = True
print(miBooleano)

miBooleano = 1 > 2
print(miBooleano)

miBooleano = 3 > 2
print(miBooleano)

miBooleando = 1 > 2
if miBooleano: 
    print("El resultado es verdadero")
else:
    print("El resultado es falso")


#Procesar la entrada del usuario
#Función input
resultado = input("Digite un número: ") #regresa un dato tipo string
print(resultado)

#Conversión de la entrada de datos

numero1 = int(input("Escribe el primer número: "))
numero2 = int(input("Escribe el segundo número: "))
resultado = numero1 + numero2
print("El resultado de la suma es:", resultado)