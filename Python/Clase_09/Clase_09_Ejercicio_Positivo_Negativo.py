# Leer 10 números e imprimir cuantos son positivos, cuantos negativos y cuantos neutros

positivos = 0
negativos = 0
neutros = 0

for i in range(1, 11):
    num = int(input(f"{i}. Digite un número: "))

    if num == 0:
        neutros += 1
    elif num > 0:
        positivos += 1
    else:
        negativos += 1

print("La cantidad de positivos es:", positivos)
print("La cantidad de negativos es:", negativos)
print("La cantidad de neutros es:", neutros)