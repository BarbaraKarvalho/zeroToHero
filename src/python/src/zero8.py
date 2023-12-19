#Calculo do salario e descontos 

hora = float(input("Quanto você ganha por hora ?"))
mes = float(input("Quantas horas ao mês?"))

IR = [7.5, 15, 22.5, 27.7]
salario = hora * mes 
INSS = salario * 8/100
sindicato = salario * 5/100

desconto = INSS + sindicato
salario_liqui = salario - desconto

if salario < 2112:
    print ("\n Salario Bruto: R$",salario,"\n")
    print ("IR : Zero ")
    print ("INSS (8%) : R$",INSS)
    print ("Sindicato ( 5%) : R$",sindicato,"\n")
    print ("Salario liquido :R$",salario_liqui)

elif salario >= 2112 and salario <= 2826:
    
    desc = salario * IR[0]/100

    print ("\n Salario Bruto: R$",salario,"\n")
    print ("IR(7,5%):R$" ,desc)
    print ("INSS (8%) : R$",INSS)
    print ("Sindicato ( 5%) : R$",sindicato,"\n")
    print ("Salario liquido :R$",salario_liqui - desc)

elif salario >= 2826 and salario <= 3751:

    desc = salario * IR[1]/100

    print ("\n Salario Bruto: R$",salario,"\n")
    print ("IR (15%): R$ " ,desc)
    print ("INSS (8%) : R$",INSS)
    print ("Sindicato ( 5%) : R$",sindicato,"\n")
    print ("Salario liquido :R$",salario_liqui - desc)

elif salario >= 3751 and salario <= 4664:

    desc = salario * IR[2]/100

    print ("\n Salario Bruto: R$",salario,"\n")
    print ("IR (22,5%): R$ " , desc)
    print ("INSS (8%) : R$",INSS)
    print ("Sindicato ( 5%) : R$",sindicato,"\n")
    print ("Salario liquido :R$",salario_liqui - desc)

else:

    desc = salario * IR[3]/100

    print ("\n Salario Bruto: R$",salario,"\n")
    print ("IR (27,5%): " ,desc)
    print ("INSS (8%) : R$",INSS)
    print ("Sindicato ( 5%) : R$",sindicato,"\n")
    print ("Salario liquido :R$",salario_liqui - desc)
