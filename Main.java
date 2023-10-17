class Main {
  public static void main(String[] args) {
    Pessoa duduJobs = new Pessoa();
    Carro carroDoJobs = new Carro("Porshe 911s Turbo", "Preto fosco", 2023, "Porshe", (short)2, duduJobs);
    
    carroDoJobs.setProprietario("Dudu Jobs", 17, "Masculino", (float)1.70, (float)90.7);

    carroDoJobs.getDadosCarro();


    Submarino submarinoDoJobs = new Submarino();
    submarinoDoJobs.setInfoVeiculo("fraca", 126, 183, 80);

    //submarinoDoJobs.ligarSonar();
    submarinoDoJobs.getStatusSubmarino();
    //submarinoDoJobs.desligarSonar();
    //submarinoDoJobs.getStatusSubmarino();
  }
}