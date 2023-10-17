public class Carro{
  private String modelo;
  private String cor;
  private int ano;
  private String marca;
  private short numeroPortas;
  private Pessoa proprietario;

  public Carro(String modelo, String cor, int ano, String marca, short numeroPortas, Pessoa proprietario){
    this.modelo = modelo;
    this.cor = cor;
    this.ano = ano;
    this.marca = marca;
    this.numeroPortas = numeroPortas;
    this.proprietario = proprietario;
  }


  public void getModelo(){
    System.out.println("O modelo é " + this.modelo);
  }
  
  public void setModelo(String modelo){
    this.modelo = modelo;
  }


  public void getCor(){
    System.out.println("A cor é " + this.cor);
  }
  
  public void setCor(String cor){
    this.cor = cor;
  }

  public void getAno(){
    System.out.println("O ano é " + this.ano);
  }
  
  public void setAno(int ano){
    this.ano = ano;
  }

  public void getMarca(){
    System.out.println("A marca é " + this.marca);
  }
  
  public void setMarca(String marca){
    this.marca = marca;
  }

  public void getNumeroPortas(){
    System.out.println("O número de portas é " + this.numeroPortas);
  }
  
  public void setNumeroPortas(short numeroPortas){
    this.numeroPortas = numeroPortas;
  }


  public void getProprietario(){
    System.out.println("O nome do proprietário é " + this.proprietario.nome);

    System.out.println(this.proprietario.nome + " tem " + this.proprietario.idade + " anos de idade");

    System.out.println(this.proprietario.nome + " É do sexo " + this.proprietario.sexo);

    System.out.println(this.proprietario.nome + " tem " + this.proprietario.altura + " metros de altura");

    System.out.println(this.proprietario.nome + " tem " + this.proprietario.peso + " KG\n\n\n\n");
  }
  
  public void setProprietario(String nome, int idade, String sexo, float altura, float peso){
    this.proprietario.nome = nome;
    this.proprietario.idade = idade;
    this.proprietario.sexo = sexo;
    this.proprietario.altura = altura;
    this.proprietario.peso = peso;
  }

  public void getDadosCarro(){
    this.getModelo();
    this.getCor();
    this.getAno();
    this.getMarca();
    this.getNumeroPortas();
    this.getProprietario();
  }

  
}
