import random
list1 = [[1,"der Einkauf","puchase"],
[2,"das Geschäft","store"],
[3,"der Job","job"],
[4,"das Konto","account"],
[5,"der Kredit","credit"],
[6,"die Rechnung","bill"],
[7,"das Taschengeld","allowance"],
[8,"ausgaben","to spend"],
[9,"bekommen","to get"],
[10,"bezhalen","to pay"],
[11,"jobben","to work a second job"],
[12,"leihen","to lend"],
[13,"pleite sein","to be broke"],
[14,"sparen","to save"],
[15,"arbeitlos","unemployed"],
[16,"wenig","a few/ a little"]]

def cards(list1):
  flip = "y"
  
  while flip != "n" or flip != "N":
    words = random.randint(0,15)
    word = list1[words]
    print(word[1])
    flip = input("flip? y/n  ")
    if flip == "y" or flip == "Y":
      print(word[2])
    elif flip == "n":
      break
    else:
      flip = "y"


def mult(list1):
  cont = "y"
  while cont != "n":
    



def main(cards):
  end = "1"
  while end != "0":
    print("""
    1: flashcards
    2: learn with multiple choice
    3: learn by typing""")
    end = int(input("Select a number, or press 0 to exit: "))
    if end == 1:
      cards(list1)
main(cards)