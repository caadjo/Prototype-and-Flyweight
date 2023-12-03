/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

/**
 *
 * @author Caio Veloso &lt;caio.veloso at ifnmg.edu.br&gt;
 */
public class NivusPrototype extends CarroPrototype {
    
                   protected NivusPrototype(NivusPrototype nivusPrototype) {
		this.valorCompra = nivusPrototype.getValorCompra();
	}

	public NivusPrototype() {
		valorCompra = 0.0;
	}

        
        
        
	@Override
	public String exibirInfo() {
		return "Modelo: Nivus\nMontadora: Wolkswagen\n" + "Valor: R$"
				+ getValorCompra();
	}

	@Override
	public CarroPrototype clonar() {
		return new NivusPrototype(this);
	}
}
