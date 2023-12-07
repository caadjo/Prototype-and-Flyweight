/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

/**
 *
 * @author Caio Veloso &lt;caio.veloso at ifnmg.edu.br&gt;
 */
public class TcrossPrototype extends CarroPrototype {
    
    protected TcrossPrototype(TcrossPrototype tcrossPrototype) {
		this.valorCompra = tcrossPrototype.getValorCompra();
	}

	public TcrossPrototype() {
		valorCompra = 0.0;
	}

	@Override
	public String exibirInfo() {
		return "Modelo: Tcross\nMontadora: Wolskwagen\n" + "Valor: R$"
				+ getValorCompra();
	}

	@Override
	public CarroPrototype clonar() {
		return new TcrossPrototype(this);
	}
}
