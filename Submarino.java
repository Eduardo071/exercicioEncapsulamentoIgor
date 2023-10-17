public class Submarino extends VeiculoAquatico{
  private String integridadeHelice;
  private boolean sonarEstaLigado;

  public void ligarSonar(){
    this.sonarEstaLigado = true;
  }

  public void desligarSonar(){
    this.sonarEstaLigado = false;
  }

  private void getIntegridadeHelice(){
    System.out.println("A integridade da hélice está " + this.integridadeHelice);
  }

  public void setIntegridadeHelice(String integridadeHelice){
    this.integridadeHelice = integridadeHelice;
  }

  public void setProfundidadePermitida(int profundidadePermitida){
    super.profundidadePermitida = profundidadePermitida;
  }

  public void setVelocidadeMaxima(int velocidadeMaxima){
    super.velocidadeMaxima = velocidadeMaxima;
  }

  public void setCapacidadeTanque(int capacidadeTanque){
    super.capacidadeTanque = capacidadeTanque;
  }

  public void setInfoVeiculo(String integridade, int profundidade, int velocidade, int capacidade){
    this.setIntegridadeHelice(integridade);
    this.setProfundidadePermitida(profundidade);
    this.setVelocidadeMaxima(velocidade);
    this.setCapacidadeTanque(capacidade);
  }

  public void getStatusSubmarino(){
    if(this.sonarEstaLigado == true){
      System.out.println("A profundidade máxima permitida nesse veículo é de " + super.profundidadePermitida + " metros abaixo do nível da água" + "\nA velocidade máxima desse veículo é de " + super.velocidadeMaxima + " km/h" + "\nA capacidade máxima do tanque desse veículo é de " + super.capacidadeTanque + " litros de combustível" + "\nA integridade do veículo está " + this.integridadeHelice);
    }else{
      System.out.println("O sonar do veículo está desligado, ligue ele para ver o status geral do veículo");
    }
  }
}