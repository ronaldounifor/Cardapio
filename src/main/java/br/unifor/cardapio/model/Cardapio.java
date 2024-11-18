package br.unifor.cardapio.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Cardapio {
    private ArrayList<MenuItem> itens;

    /**
     * Ajuda de @author
     */
    public Cardapio() {
        this.itens = new ArrayList<>();

        itens.add(new MenuItem(1, "Pizza Margherita", 15.99));
        itens.add(new MenuItem(2, "Spaghetti Carbonara", 12.49));
        itens.add(new MenuItem(3, "Caesar Salad", 8.99));
        itens.add(new MenuItem(4, "Tiramisu", 5.49));
        itens.add(new MenuItem(5, "Cappuccino", 3.75));
    }

    public MenuItem pegarPorID(int id) {
        for (MenuItem menuItem : itens)
            if(menuItem.getId() == id) return menuItem;
        
        return null;
    }

    public ArrayList<MenuItem> pegarTodos() {
        return itens;
    }

    public void adicionar(MenuItem item) {
        itens.add(item);
    }

    public void remover(int id) {
        itens.remove(pegarPorID(id));
    }
}
