/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

/**
 *
 * @author Caio Veloso &lt;caio.veloso at ifnmg.edu.br&gt;
 */
public class Cliente { 
    public static void main(String[] args) {
		NivusPrototype prototipoNivus = new NivusPrototype();

		CarroPrototype nivusNovo = prototipoNivus.clonar();
		nivusNovo.setValorCompra(225000.0);
		CarroPrototype nivusUsado = prototipoNivus.clonar();
		nivusUsado.setValorCompra(110000.0);

		System.out.println(nivusNovo.exibirInfo());
		System.out.println(nivusUsado.exibirInfo());
                
                
	}
}
