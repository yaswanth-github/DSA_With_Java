def AddAmount(i):
    amount = 50
    amount+=i
    return amount

i=int(input("Enter the Amount: "))
print("Total Amount after Deposited is: ",AddAmount(i))