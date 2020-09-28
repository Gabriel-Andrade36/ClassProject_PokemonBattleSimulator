
package primary.pokesimulator;

import java.util.Scanner;
public class Pokemon {
 private String nome="default";   
 private int level=0;   
 private int tipo=0;   //1 = fogo, 2= agua, 3=planta
 private int hp=0;   
 private int atk=0;
 private String atkName="default";
 
public void setPokemon(){                              //Pegando informações dos pokemons
Scanner scanner = new Scanner(System.in);                         
    System.out.println("insira o nome do seu pokemon");                                                                            
   this.nome= scanner.nextLine();
    System.out.println("Insira o level de seu pokemon");
   this.level= scanner.nextInt();

 while(this.tipo <1 || this.tipo>3){ 
    System.out.println("Insira o número correspondente ao tipo de seu pokemon\n"
                                                        + "1 = fogo\n"
                                                          + "2 = agua\n"
                                                            + "3 = planta\n");
       this.tipo= scanner.nextInt();
 if (this.tipo <1 || this.tipo >3 ){ System.out.println("valor inserido incorreto");
 }}

   
this.hp=100+(10*this.level);
this.atk=20+(2*this.level);

}
public int getTipo(){
    return this.tipo;
}
public int getAtk(){
    return this.atk;
}
public void setAtk(int atk){
this.atk=atk;
}
public int getHp(){
    return this.hp;    
}
public String getName(){
    return this.nome;
}
public void setHp(int hp){
this.hp = hp;    
}
public String getAtkName(){
    return this.atkName;   
}
public void SetAtkName(String AtkName){
this.atkName = AtkName;    
}
public int getLevel(){
    return(this.level);
}
}
