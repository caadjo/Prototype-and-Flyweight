/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flyweight;

/**
 *
 * @author Caio Veloso &lt;caio.veloso at ifnmg.edu.br&gt;
 */
public class Imagem {
                    protected String nomeDaImagem;

	public Imagem(String imagem) {
		nomeDaImagem = imagem;
	}

	public void desenharImagem() {
		System.out.println(nomeDaImagem + " desenhada!");
	}
}
