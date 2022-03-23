package Ser_Humano;

/**
 *
 * @author alunocmc
 */
public class Corpo_Humano {
    private float massa; 
    private float altura;
    private float IMC;
    
    public Corpo_Humano(float massa, float altura)
    {
    this.massa = massa;
    this.altura = altura;
    IMC = massa/altura*altura;
   
   }
 public float GetMassa()
 {
    return massa;   
 }
 public float GetAltura()
 {
     return altura;
 }
 public float GetIMC()
 {
     return IMC;
 }        
 public void Setmassa(float massa)
 {
     this.massa = massa;
     IMC = massa/altura*altura;
 }
 public void SetAltura(float altura)
 {
  this.altura = altura;
  IMC = massa/altura*altura;
 }
 }



 
