public class Pessoa {
    
       String nome;
       double horasTrab;
       double salarioBruto;
       double salarioHora;
       int    numDep;
       double Inss;
       double Ir;
       double salarioLiquido;
    
    
   public double calculoSalario() {
       return salarioBruto = horasTrab * salarioHora + (50 * numDep);
   }
   
   public void descontoInss() {
       if (salarioBruto <= 1000){
        Inss = salarioBruto * 8.5 / 100;
       }   
       else if(salarioBruto > 1000){
           Inss = salarioBruto * 9 / 100;
       }
    }
   
   public void descontoIr() {
       if (salarioBruto <= 500){
           Ir = 0;
        }
        
       else if(salarioBruto > 500 && salarioBruto < 1000){
           Ir = salarioBruto * 5 / 100;
           }
       
       else if(salarioBruto > 1000){
           Ir = salarioBruto * 7 / 100;
        }
   }
           
   public void calculoSliquido() {
       salarioLiquido = salarioBruto - Inss - Ir;    
   } 
}  