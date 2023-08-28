package es.dsrroma.school.java.domina1.video01_13;

public class Movil {
  private String marca;
  private String modelo;
  private String numSerie;
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((marca == null) ? 0 : marca.hashCode());
    result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Movil other = (Movil) obj;
    if (marca == null) {
      if (other.marca != null)
        return false;
    } else if (!marca.equals(other.marca))
      return false;
    if (modelo == null) {
      if (other.modelo != null)
        return false;
    } else if (!modelo.equals(other.modelo))
      return false;
    return true;
  }

}
