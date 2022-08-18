package mainApp.dto;

import javax.persistence.*;

@Entity
@Table(name="ventas")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name="cajero")
	Cajero cajero;
	
	@ManyToOne
	@JoinColumn(name="maquina")
	Maquina_registradora maquina;
	
	@ManyToOne
	@JoinColumn(name="producto")
	Producto producto;

	/**
	 * 
	 */
	public Venta() {
	}

	/**
	 * @param id
	 * @param cajero
	 * @param maquina
	 * @param producto
	 */
	public Venta(int id, Cajero cajero, Maquina_registradora maquina, Producto producto) {
		this.id = id;
		this.cajero = cajero;
		this.maquina = maquina;
		this.producto = producto;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the cajero
	 */
	public Cajero getCajero() {
		return cajero;
	}

	/**
	 * @param cajero the cajero to set
	 */
	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	/**
	 * @return the maquina
	 */
	public Maquina_registradora getMaquina() {
		return maquina;
	}

	/**
	 * @param maquina the maquina to set
	 */
	public void setMaquina(Maquina_registradora maquina) {
		this.maquina = maquina;
	}

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", cajero=" + cajero + ", maquina=" + maquina + ", producto=" + producto + "]";
	}
	
	
}
