
package primary.pokesimulator;


public class Batalha {

public void batalha(){
Pokemon p1 = new Pokemon();
Pokemon p2 = new Pokemon();

System.out.println("Jogador 1:");
p1.setPokemon();
System.out.println("\n\njogador 2:");
p2.setPokemon();

// fogo 1 agua 2 planta 3 
int p1_vantagem =p1.getAtk()+(p1.getAtk()/4);
int p2_vantagem =p2.getAtk()+(p2.getAtk()/4);
//System.out.println("21- p1:"+p1.getAtk());
//System.out.println("22- p2:"+p2.getAtk());
switch(p1.getTipo()){                                // SWITCH PARA SETAR VANTAGENS POR TIPO UTILIZANDO O TIPO DO POKEMON 1
    case(1): p1.SetAtkName("Brasa");
             if(p2.getTipo()==2){                    //case (fogo) =  Se pokemon 2 for do tipo AGUA
             p2.setAtk(p2_vantagem);                 //  pokemon 2 aumenta seu ataque em 25%
            }else if(p2.getTipo()==3){               // se pokemon 2 for do tipo PLANTA
             p1.setAtk(p1_vantagem);                 // pokemon 1 aumenta seu ataque em 25%

            // System.out.println("29- p1:"+p1.getAtk());
            //System.out.println("30- p2:"+p2.getAtk()); 
             break;      
            }         

    case(2):p1.SetAtkName("jato d'água");
            if(p2.getTipo()==1){                     //case (agua) = Se pokemon 2 tipo AGUA                  
            p1.setAtk(p1_vantagem);                  // pokemon 2 dano>>
           }else if(p2.getTipo()==3){                // Se pokemon 2 tipo PLANTA
            p2.setAtk(p2_vantagem);}                 // pokemon 1 dano>>

           //System.out.println("39- p1:"+p1.getAtk());
           //System.out.println("40- p2:"+p2.getAtk());           
             break;
    
    case(3):p1.SetAtkName("Projétil de Semente");
            if(p2.getTipo()==1){                     // case (planta)= se pokemon 2 tipo FOGO  
            p2.setAtk(p2_vantagem);                  // pokemon 2 dano>>
          }else if(p2.getTipo()==2){                 // se pokemon tipo AGUA
            p1.setAtk(p1_vantagem);}                 // pokemon 1 dano>>  
           
           //System.out.println("48- p1:"+p1.getAtk());
           //System.out.println("49- p2:"+p2.getAtk());      
             break;
}
switch(p2.getTipo()){
    case 1: p2.SetAtkName("Chama Furacão");break;
    case 2: p2.SetAtkName("Revolver d'água");break;
    case 3: p2.SetAtkName("Chicote de Vinha");break;
            
}
for (int i=0;p1.getHp()>0 && p2.getHp()>0;i++){

    System.out.printf("%s usou %s",p1.getName(),p1.getAtkName());
    int oldHp = p2.getHp();
    p2.setHp(p2.getHp()-p1.getAtk());
    System.out.printf("\n%s desferiu %d de dano e a vida de %s desceu de %d para %d \n\n",p1.getName(),p1.getAtk(),p2.getName(),oldHp,p2.getHp());
   
 if(p2.getHp()>0){   
    System.out.printf("%s usou %s",p2.getName(),p2.getAtkName());
    oldHp = p1.getHp();
    p1.setHp(p1.getHp()-p2.getAtk());
    System.out.printf("\n%s desferiu %d de dano e a vida de %s desceu de %d para %d \n\n",p2.getName(),p2.getAtk(),p1.getName(),oldHp,p1.getHp());
}}
if(p1.getHp()>0){
    int a=100+p1.getLevel()/4;
  if(p1.getHp()==a){
  System.out.println(p1.getName()+" venceu com apenas um golpe");
  }else if (p1.getHp()>=a/1.25){
  System.out.println(p1.getName()+" venceu com facilidade");        
  }else if (p1.getHp()>=a/1.5){
  System.out.println(p1.getName()+" venceu após uma batalha razoável, mas com vantagem");
  }else if (p1.getHp()>=a/3){
  System.out.println(p1.getName()+" venceu após uma batalha dificil"); 
  }else if (p1.getHp()<a/3){
  System.out.println(p1.getName()+" venceu com difículdade");
  }
 }else{
    int a=100+p2.getLevel()/4;
  if(p1.getHp()==a){
  System.out.println(p2.getName()+" venceu com apenas um golpe");
  }else if (p2.getHp()>=a/1.25){
  System.out.println(p2.getName()+" venceu com facilidade");        
  }else if (p2.getHp()>=a/1.5){
  System.out.println(p2.getName()+" venceu após uma batalha razoável, mas com vantagem");
  }else if (p2.getHp()>=a/3){
  System.out.println(p2.getName()+" venceu após uma batalha dificil"); 
  }else if (p2.getHp()<a/3){
  System.out.println(p2.getName()+" venceu com difículdade");
    
 }}}
}