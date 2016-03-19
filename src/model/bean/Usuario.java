package model.bean;

import java.util.Objects;

/**
 * 
 * @author Jaqueline, Lorena, Sarah
 *
 */
public class Usuario {

        private int idUsu;
        public String nickname;
	public String senha;
	
	public Usuario(int idUsu, String nickname, String senha) {
                this.idUsu = idUsu;
		this.nickname = nickname;
		this.senha = senha;
	}

        
        /**
	 * @return the idUsu
	 */
        public int getIdUsu() {
                return idUsu;
        }
        /**
	 * @param idUsu the idUsu to set
	 */
        public void setIdUsu(int idUsu) {
                this.idUsu = idUsu;
    }
	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

    
        public String toString() {
        return "id:" + getIdUsu() + "Nick:" + getNickname() + ", Senha:" + getSenha();
        }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.idUsu;
        hash = 19 * hash + Objects.hashCode(this.nickname);
        hash = 19 * hash + Objects.hashCode(this.senha);
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
        final Usuario other = (Usuario) obj;
        if (this.idUsu != other.idUsu) {
            return false;
        }
        if (!Objects.equals(this.nickname, other.nickname)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        return true;
    }


       

 
        
	
	
	
	

	
}
