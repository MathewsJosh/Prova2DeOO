package trabalhopokemon;

import InterfaceGrafica.*;

/**
 * Projeto de pokedex desenvolvido para Mostra detalhes de treinadores, pokemons
 * e fazer uma simulação de batalha entre eles
 *
 * @authors Mathews Edwirds,Julia Valadares, Renan Nunes
 */
public class TrabalhoPokemon
{
    public static void main(String[] args) throws Exception
    {
        /*Codigo de execução dos jframes do trabalho
        TelaInicial p = new TelaInicial();
        p.setVisible(true);
         */
        
        
        
        //Codigo da Prova
        VendaDePokemons venda = new VendaDePokemons();
        venda.Vender();
        
        /*
        Pergunta da prova: Como você implementaria os pokemons de brinquedo?
        
        Eu definiria classes especificas para cada pokemon, adicionando seus atributos: int Preço e String som.
        Depois instanciaria essa classe na minha classe VendaDePokemons, calculando seus dados de acordo com as
        informações que o usuario digitasse, como a quantidade e quais pokemons de brinquedo ele deseja comprar
        
        */
    }

}
