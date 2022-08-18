package mainApp.dto;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="maquinas_registradoras")
public class Maquina_registradora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column(name = "piso")
	private int piso;

	@OneToMany
	@JoinColumn(name="maquina")
	private List<Venta> venta;

	/**
	 * 
	 */
	public Maquina_registradora() {
	}

	/**
	 * @param codigo
	 * @param piso
	 * @param venta
	 */
	public Maquina_registradora(int codigo, int piso, List<Venta> venta) {
		this.codigo = codigo;
		this.piso = piso;
		this.venta = venta;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the piso
	 */
	public int getPiso() {
		return piso;
	}

	/**
	 * @param piso the piso to set
	 */
	public void setPiso(int piso) {
		this.piso = piso;
	}

	/**
	 * @return the venta
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return venta;
	}

	/**
	 * @param venta the venta to set
	 */
	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "Maquina_registradora [codigo=" + codigo + ", piso=" + piso + "]";
	}
	
	
}
