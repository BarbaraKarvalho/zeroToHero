peso = float(input("Digite o peso : "))
excesso = peso - 50
multa = 4.00

if peso > 50:
   print ("Você tem que pagar uma multa de R$",multa,"reais por ter passado",excesso, "Kg a mais do quilo estabelecido")
else:
    print("O peso do seu peixe e de ",peso,"Kg")