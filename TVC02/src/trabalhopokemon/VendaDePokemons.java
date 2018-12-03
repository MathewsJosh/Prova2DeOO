package trabalhopokemon;

import Pokemons.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class VendaDePokemons
{
    int estoqueTotal, inteiro, i, escolhidos;
    float total = 0;
    
    Scanner entrada = new Scanner(System.in);
    //ArrayList lista = new ArrayList();
    List<String> lista = new ArrayList<String>();
    List<String> sons = new ArrayList<String>();

    Bulbassauro b = new Bulbassauro();
    Caterpie c = new Caterpie();
    Charmander cha = new Charmander();
    Diglett d = new Diglett();
    Magikarp m = new Magikarp();
    Oddish od = new Oddish();
    Pidgey pid = new Pidgey();
    Pikachu pik = new Pikachu();
    Psyduck psy = new Psyduck();
    Squirtle sq = new Squirtle();
    Vulpix v = new Vulpix();
    Zubat zu = new Zubat();

    public VendaDePokemons()
    {
    }

    public void Vender() throws Exception
    {
        try
        {
            System.out.print("Quantos Pokemons você deseja comprar?   ");
            inteiro = entrada.nextInt();
            if (inteiro < 0)
            {
                throw new ValorInvalidoException();
            }
            System.out.println("Por favor, informe quais pokemons você deseja comprar: ");
            System.out.println("\n0 - Bulbassauro: "+ b.getValor() + " reais\n1- Caterpie: " + c.getValor() + " reais\n2- Charmander: " 
                    + cha.getValor() + " reais\n3- Diglett: " + d.getValor() + " reais\n4- Magikarp: " + m.getValor() 
                    + " reais\n5- Oddish: "+ od.getValor() + " reais\n6- Pidgey: " + pid.getValor() + " reais\n7- Pikachu: " +pik.getValor()
                    + " reais\n8- Psyduck: " + psy.getValor() + " reais\n9- Squirtle: " + sq.getValor() + " reais\n10- Vulpix: " 
                    +v.getValor() + " reais\n11- Zubat: "+zu.getValor()+" reais\n");
            for (i = 0; i < inteiro; i++)
            {
                escolhidos = entrada.nextInt();
                switch (escolhidos)
                {
                    case 0:
                        lista.add(b.getNome());
                        sons.add(b.som);
                        total += b.getValor();
                        //b.emitesom();
                        break;
                    case 1:
                        lista.add(c.getNome());
                        sons.add(c.som);
                        total += c.getValor();
                        //c.emitesom();
                        break;
                    case 2:
                        lista.add(cha.getNome());
                        sons.add(cha.som);
                        total += cha.getValor();
                        //cha.emitesom();
                        break;
                    case 3:
                        lista.add(d.getNome());
                        sons.add(d.som);
                        total += d.getValor();
                        //d.emitesom();
                        break;
                    case 4:
                        lista.add(m.getNome());
                        sons.add(m.som);
                        total += m.getValor();
                        //m.emitesom();
                        break;
                    case 5:
                        lista.add(od.getNome());
                        sons.add(od.som);
                        total += od.getValor();
                        //od.emitesom();
                        break;
                    case 6:
                        lista.add(pid.getNome());
                        sons.add(pid.som);
                        total += pid.getValor();
                        //pid.emitesom();
                        break;
                    case 7:
                        lista.add(pik.getNome());
                        sons.add(pik.som);
                        total += pik.getValor();
                        //pik.emitesom();
                        break;
                    case 8:
                        lista.add(psy.getNome());
                        sons.add(psy.som);
                        total += psy.getValor();
                        //psy.emitesom();
                        break;
                    case 9:
                        lista.add(sq.getNome());
                        sons.add(sq.som);
                        total += sq.getValor();
                        //sq.emitesom();
                        break;
                    case 10:
                        lista.add(v.getNome());
                        sons.add(v.som);
                        total += v.getValor();
                        //v.emitesom();
                        break;
                    case 11:
                        lista.add(zu.getNome());
                        sons.add(zu.som);
                        total += zu.getValor();
                        //zu.emitesom();
                        break;
                    default:
                        System.out.println("Por Favor, Digite o valor novamente: ");
                }
            }
            System.out.println("Total: " + total + " Reais");
            System.out.println(lista);
            salvar();

        }

        catch (ValorInvalidoException e)
        {
            System.out.println("Valor Invalido digitado! Tente Novamente!");
        }
    }

    /**
     * Método para salvar o log de batalha em um arquivo txt
     *
     */
    public void salvar()
    {
        try
        {
            FileWriter fw = new FileWriter("Resumo das vendas.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Lista de pokemons escolhidos: "+lista);
            pw.println("Lista de sons dos pokemons excolhidos: "+sons);
            pw.println("Valor Total dos Pokemons: "+total);
            pw.flush();
            pw.close();
            fw.close();
        }
        catch (IOException ex)
        {
            System.out.println("Erro ao Salvar! Tente Novamente!");
        }
    }

    private int ValorInvalidoException()
    {
        System.out.println("Valor Invalido digitado! Tente Novamente!");
        return 0;
    }

}
