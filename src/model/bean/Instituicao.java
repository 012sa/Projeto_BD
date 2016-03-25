package model.bean;

import java.util.Objects;


/**
 * 
 * @author Jaqueline, Sarah, Lorena
 *
 */
public class Instituicao {
    
	public int idCampus; 
        public String estado;
	public String campus;
        
	/**
	 * 
	 * @param estado
	 * @param campus
	 */
	public Instituicao(String estado, String campus) {
		this.estado = estado;
		this.campus = campus;
	}

      /**
       * 
       * @return
       */
	public int getIdCampus() {
            return idCampus;
        }
        
        public void setIdCampus(int idCampus ){
            this.idCampus = idCampus;
        }
        
        
        public String getEstado() {
		return "Estado"; 
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * 
	 * @return
	 */
	public String getCampus() {
		return campus;
	}

	/**
	 * 
	 * @param campus
	 */
	public void setCampus(String campus) {
		this.campus = campus;
	}

    
        public String toString() {
        return "id:" + getIdCampus() + "Estado:" + getEstado()+ ", Campus:" + getCampus() + '}';
        }
        
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.idCampus);
        hash = 43 * hash + Objects.hashCode(this.estado);
        hash = 43 * hash + Objects.hashCode(this.campus);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Instituicao other = (Instituicao) obj;
        if (this.idCampus != other.idCampus) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.campus, other.campus)) {
            return false;
        }
        return true;
    }
 
        
}
