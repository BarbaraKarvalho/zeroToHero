hora = float(input("Quanto você ganha por hora ?"))
mes = float(input("Quantas horas ao mês?"))

salario = hora * mes 
IR = salario * 11/100
INSS = salario * 8/100
sindicato = salario * 5/100

desconto = IR + INSS + sindicato
salario_liqui = salario - desconto

print ("\n Salario Bruto: R$",salario,"\n")
print ("IR (11%) : R$",IR)
print ("INSS (8%) : R$",INSS)
print ("Sindicato ( 5%) : R$",sindicato,"\n")
print ("Salario liquido :R$",salario_liqui)
