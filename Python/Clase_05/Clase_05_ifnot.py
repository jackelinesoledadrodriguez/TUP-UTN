#Ejercicio con el operador or, Operador not
vacaciones = False
diaDescanso = True
if(vacaciones or diaDescanso):
    print("Puede asistir al juego")
else:
    print("Tiene trabajo que hacer")


#if not
vacaciones = False
diaDescanso = False
if not(vacaciones or diaDescanso):
    print("Tiene trabajo que hacer")
else:
    print("Puede asistir al juego")
