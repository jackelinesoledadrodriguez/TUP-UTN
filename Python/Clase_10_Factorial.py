def factorial():
    num = int(input("Digite un número: "))
    if num < 0:
        print("El factorial no está definido para números negativos.")
        return
    i = 1
    factorial = 1
    while i <= num:
        factorial = factorial * i
        i = i + 1
    print("El factorial es:", factorial)

factorial()

