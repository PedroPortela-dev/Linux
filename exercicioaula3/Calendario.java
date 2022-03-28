public class Calendario {
    
    public static void main(String[] args) {
        
        long totalMiliSegundos = System.currentTimeMillis() - 10800000;

        int totalSegundos = (int)(totalMiliSegundos/1000);
        int atualSegundos = (int)(totalSegundos%60);

        int totalMinutos = totalSegundos/60;
        int atualMinutos = totalMinutos%60;

        int totalHoras = totalMinutos/60;
        int atualHoras = totalHoras%24;

        int totalDias = totalHoras/24-730;

        int atualQuatrocentosAnos = totalDias/146097;
        int restoDeDias = totalDias%146097;

        int atualCentenario = (restoDeDias)/36524;
        restoDeDias = (restoDeDias)%36524;

        int atualQuartenario = (restoDeDias)/1461;
        restoDeDias = (restoDeDias)%1461;

        int atualAno = (restoDeDias)/365;
        restoDeDias = (restoDeDias)%365;

        atualAno = atualQuatrocentosAnos*400+atualCentenario*100+atualQuartenario*4+atualAno+1972;

        int fevereiro;

        if(atualAno == 0){
            fevereiro = 29;
        }else{
            fevereiro = 28;
        }

        int mes;
        int atualDia = restoDeDias;

        if(restoDeDias<31){
            mes = 1;
        }else if(restoDeDias<fevereiro+31){
            mes = 2;
            atualDia -= 31;
        }else if(restoDeDias<62+fevereiro){
            mes = 3;
            atualDia -= fevereiro+31;
        }else if(restoDeDias<92+fevereiro){
            mes = 4;
            atualDia -= 62+fevereiro;
        }else if(restoDeDias<123+fevereiro){
            mes = 5;
            atualDia -= 92+fevereiro;
        }else if(restoDeDias<153+fevereiro){
            mes = 6;
            atualDia -= 123+fevereiro;
        }else if(restoDeDias<184+fevereiro){
            mes = 7;
            atualDia -= 153+fevereiro;
        }else if(restoDeDias<215+fevereiro){
            mes = 8;
            atualDia -= 184+fevereiro;
        }else if(restoDeDias<245+fevereiro){
            mes = 9;
            atualDia -= 215+fevereiro;
        }else if(restoDeDias<276+fevereiro){
            mes = 10;
            atualDia -= 245+fevereiro;
        }else if(restoDeDias<307+fevereiro){
            mes = 11;
            atualDia -= 276+fevereiro;
        }else{
            mes = 12;
            atualDia -= 307+fevereiro;
        }

        System.out.println("Data:       "+atualAno+"/"+mes+"/"+atualDia);
        System.out.println("Horario:    "+atualHoras+":"+atualMinutos+":"+atualSegundos);
    }
}
