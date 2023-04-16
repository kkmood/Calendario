import java.util.Scanner;


public class Calendario
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Perguntas
        while(true) {
        System.out.println("Digite o dia: ");
        int num_dia = input.nextInt();
        
        System.out.println("Digite o mês: ");
        int num_mes = input.nextInt();
        
        System.out.println("Digite o ano: ");
        int num_ano = input.nextInt();
        
        //Meses com 31 Dias:
        if ((num_mes ==1) || (num_mes == 3) || (num_mes ==5) || (num_mes ==7) || 
                (num_mes ==8) || (num_mes ==10) || (num_mes ==12)) {
            
                
            for (int x=1; x<32; x++){
            for (int y=1; y<13; y++){
            for (int z=1; z<9999; z++){
                
                
                //Checando as datas inválidas:
                if ((num_dia <= 0) || (num_dia > 31)){
                    System.out.println("Data inválida");
                    System.exit(0);
                } 
                
                if ((num_ano <= 0) || (num_ano > 9999)){
                    System.out.println("Data inválida");
                    System.exit(0);
                }
                
                if ((num_mes <= 0) || (num_mes > 12)){
                    System.out.println("Data inválida");
                    System.exit(0);
                }
                
                if ((x == num_dia) && (y == num_mes) && (z == num_ano)){
                    if (z % 4 == 0){
                        System.out.println("-----------");
                        System.out.println(x + "/" + y + "/" + z + "- Ano Bissexto");
                    }
                    
                    else {
                        System.out.println("-----------");
                        System.out.println(x + "/" + y + "/" + z);
                    }
                }
            }   
        }
    }
}

            //Fevereiro
            else if (num_mes == 2) {
            if (num_ano % 4 == 0) {
                if ((num_dia < 1) || (num_dia > 29)) {
                    System.out.println("Data inválida");
                } else {
                    System.out.println("-----------");
                    System.out.println(num_dia + "/" + num_mes + "/" + num_ano + "- Ano Bissexto");
                }
            } else {
                if ((num_dia < 1) || (num_dia > 28)) {
                    System.out.println("Data inválida");
                } else {
                    System.out.println("-----------");
                    System.out.println(num_dia + "/" + num_mes + "/" + num_ano);
                }   
            }
}
        
    //Meses com 30 Dias:
    else {
            for (int x=1; x<31; x++){
            for (int y=1; y<13; y++){
            for (int z=1; z<9999; z++){

                //Checando as datas inválidas:
                if ((num_dia <= 0) || (num_dia >= 31)){
                    System.out.println("Data inválida");
                       System.exit(0);
            }
                
                if ((num_mes <= 0) || (num_mes > 12)){
                    System.out.println("Data inválida");
                       System.exit(0);
            }
                
                if ((num_ano <= 0) || (num_ano > 9999)){
                    System.out.println("Data inválida");
                       System.exit(0);
                }
                
                    if ((x == num_dia) && (y == num_mes) && (z == num_ano)){
                        if (z % 4 == 0){
                            System.out.println("-----------");
                            System.out.println(x + "/" + y + "/" + z + "- Ano Bissexto");
                        } 
                    
                        else {
                            System.out.println("-----------");
                            System.out.println(x + "/" + y + "/" + z);
                            }

                        }   
                    }
                }
            }
        }         
    }
}
}