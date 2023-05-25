package br.com.atacado.fakeDB;

import java.time.LocalDate;

import br.com.atacado.dominio.Subcategoria;

public class SubcategoriaFakeDB extends BaseFakeDB<Subcategoria> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Subcategoria(1, "Papinha", LocalDate.now(), 1));
        this.tabela.add(new Subcategoria(2, "Sopinha", LocalDate.now(), 1));
        this.tabela.add(new Subcategoria(3, "Proteína", LocalDate.now(), 2));
        this.tabela.add(new Subcategoria(4, "Carboidratos", LocalDate.now(), 2));
        this.tabela.add(new Subcategoria(5, "Vitaminas", LocalDate.now(), 2));
        this.tabela.add(new Subcategoria(6, "Hipercalóricos", LocalDate.now(), 2));
        this.tabela.add(new Subcategoria(7, "Óxido Nítrico", LocalDate.now(), 2));
        this.tabela.add(new Subcategoria(8, "Aminoácidos", LocalDate.now(), 2));
        this.tabela.add(new Subcategoria(9, "Propriedade Funcional", LocalDate.now(), 2));
        this.tabela.add(new Subcategoria(10, "Achocolatados", LocalDate.now(), 3));
        this.tabela.add(new Subcategoria(11, "Bebidas a Base de Soja", LocalDate.now(), 3));
        this.tabela.add(new Subcategoria(12, "Bebidas Alcoólicas", LocalDate.now(), 3));
        this.tabela.add(new Subcategoria(13, "Café e Cia", LocalDate.now(), 3));
        this.tabela.add(new Subcategoria(14, "Chás", LocalDate.now(), 3));
        this.tabela.add(new Subcategoria(15, "Isotônicos e Energéticos", LocalDate.now(), 3));
        this.tabela.add(new Subcategoria(16, "Refrescos em Pó", LocalDate.now(), 3));
        this.tabela.add(new Subcategoria(17, "Refrigerantes", LocalDate.now(), 3));
        this.tabela.add(new Subcategoria(18, "Sucos Concentrados", LocalDate.now(), 3));
        this.tabela.add(new Subcategoria(19, "Sucos de Frutas Prontos", LocalDate.now(), 3));
        this.tabela.add(new Subcategoria(20, "Sucos Naturais", LocalDate.now(), 3));
        this.tabela.add(new Subcategoria(21, "Sucos Orgânicos", LocalDate.now(), 3));
        this.tabela.add(new Subcategoria(22, "Biscoitos e Bolachas", LocalDate.now(), 4));
        this.tabela.add(new Subcategoria(23, "Bolos Caseiros", LocalDate.now(), 4));
        this.tabela.add(new Subcategoria(24, "Bolos Prontos", LocalDate.now(), 4));
        this.tabela.add(new Subcategoria(25, "Misturas para Bolos", LocalDate.now(), 4));
        this.tabela.add(new Subcategoria(26, "Aves (Frango, Peru, etc)", LocalDate.now(), 5));
        this.tabela.add(new Subcategoria(27, "Boi", LocalDate.now(), 5));
        this.tabela.add(new Subcategoria(28, "Frutos do Mar", LocalDate.now(), 5));
        this.tabela.add(new Subcategoria(29, "Hamburguers", LocalDate.now(), 5));
        this.tabela.add(new Subcategoria(30, "Outras Carnes", LocalDate.now(), 5));
        this.tabela.add(new Subcategoria(31, "Peixes", LocalDate.now(), 5));
        this.tabela.add(new Subcategoria(32, "Porco", LocalDate.now(), 5));
        this.tabela.add(new Subcategoria(33, "Vitela", LocalDate.now(), 5));
        this.tabela.add(new Subcategoria(34, "Empanados", LocalDate.now(), 6));
        this.tabela.add(new Subcategoria(35, "Hamburguers", LocalDate.now(), 6));
        this.tabela.add(new Subcategoria(36, "Legumes & Cia Congelados", LocalDate.now(), 6));
        this.tabela.add(new Subcategoria(37, "Pizzas Congeladas", LocalDate.now(), 6));
        this.tabela.add(new Subcategoria(38, "Polpas de Frutas Congeladas", LocalDate.now(), 6));
        this.tabela.add(new Subcategoria(39, "Pratos Prontos Congelados", LocalDate.now(), 6));
        this.tabela.add(new Subcategoria(40, "Salgados Congelados", LocalDate.now(), 6));
        this.tabela.add(new Subcategoria(41, "Conservas em Geral", LocalDate.now(), 7));
        this.tabela.add(new Subcategoria(42, "Adoçantes", LocalDate.now(), 8));
        this.tabela.add(new Subcategoria(43, "Balas", LocalDate.now(), 8));
        this.tabela.add(new Subcategoria(44, "Chicletes", LocalDate.now(), 8));
        this.tabela.add(new Subcategoria(45, "Chocolates", LocalDate.now(), 8));
        this.tabela.add(new Subcategoria(46, "Doces de Frutas", LocalDate.now(), 8));
        this.tabela.add(new Subcategoria(47, "Doces Diversos", LocalDate.now(), 8));
        this.tabela.add(new Subcategoria(48, "Gelatinas", LocalDate.now(), 8));
        this.tabela.add(new Subcategoria(49, "Geléias", LocalDate.now(), 8));
        this.tabela.add(new Subcategoria(50, "Ingredientes Doces", LocalDate.now(), 8));
        this.tabela.add(new Subcategoria(51, "Mel e Xaropes", LocalDate.now(), 8));
        this.tabela.add(new Subcategoria(52, "Sobremesas em Pó", LocalDate.now(), 8));
        this.tabela.add(new Subcategoria(53, "Sobremesas Lácteas", LocalDate.now(), 8));
        this.tabela.add(new Subcategoria(54, "Sorvetes", LocalDate.now(), 8));
        this.tabela.add(new Subcategoria(55, "Tortas", LocalDate.now(), 8));
        this.tabela.add(new Subcategoria(56, "Cereal Matinal", LocalDate.now(), 9));
        this.tabela.add(new Subcategoria(57, "Farinhas e Cereais Diversos", LocalDate.now(), 9));
        this.tabela.add(new Subcategoria(58, "Mingau e Cia", LocalDate.now(), 9));
        this.tabela.add(new Subcategoria(59, "Amendoim e Etc", LocalDate.now(), 10));
        this.tabela.add(new Subcategoria(60, "Batata Frita", LocalDate.now(), 10));
        this.tabela.add(new Subcategoria(61, "Bobs", LocalDate.now(), 10));
        this.tabela.add(new Subcategoria(62, "Casa da Empada", LocalDate.now(), 10));
        this.tabela.add(new Subcategoria(63, "Habibs", LocalDate.now(), 10));
        this.tabela.add(new Subcategoria(64, "Mc Donalds", LocalDate.now(), 10));
        this.tabela.add(new Subcategoria(65, "Pastas & Patês", LocalDate.now(), 10));
        this.tabela.add(new Subcategoria(66, "Petiscos Diversos", LocalDate.now(), 10));
        this.tabela.add(new Subcategoria(67, "Pipoca", LocalDate.now(), 10));
        this.tabela.add(new Subcategoria(68, "Pizzas Congeladas", LocalDate.now(), 10));
        this.tabela.add(new Subcategoria(69, "Rei do Mate", LocalDate.now(), 10));
        this.tabela.add(new Subcategoria(70, "Salgadinhos & Snacks", LocalDate.now(), 10));
        this.tabela.add(new Subcategoria(71, "Frios e Embutidos em Geral", LocalDate.now(), 11));
        this.tabela.add(new Subcategoria(72, "Doces de Frutas", LocalDate.now(), 12));
        this.tabela.add(new Subcategoria(73, "Frutas Diversas", LocalDate.now(), 12));
        this.tabela.add(new Subcategoria(74, "Frutas Secas e em Calda", LocalDate.now(), 12));
        this.tabela.add(new Subcategoria(75, "Polpas de Frutas Congeladas", LocalDate.now(), 12));
        this.tabela.add(new Subcategoria(76, "Sucos Concentrados", LocalDate.now(), 12));
        this.tabela.add(new Subcategoria(77, "Sucos de Frutas Prontos", LocalDate.now(), 12));
        this.tabela.add(new Subcategoria(78, "Sucos Naturais", LocalDate.now(), 12));
        this.tabela.add(new Subcategoria(79, "Sucos Orgânicos", LocalDate.now(), 12));
        this.tabela.add(new Subcategoria(80, "Legumes & Cia Congelados", LocalDate.now(), 13));
        this.tabela.add(new Subcategoria(81, "Legumes e Cia Naturais", LocalDate.now(), 13));
        this.tabela.add(new Subcategoria(82, "Massas em Geral", LocalDate.now(), 14));
        this.tabela.add(new Subcategoria(83, "Caldos", LocalDate.now(), 15));
        this.tabela.add(new Subcategoria(84, "Catchup & Mostarda", LocalDate.now(), 15));
        this.tabela.add(new Subcategoria(85, "Maionese", LocalDate.now(), 15));
        this.tabela.add(new Subcategoria(86, "Molhos", LocalDate.now(), 15));
        this.tabela.add(new Subcategoria(87, "Outros Condimentos", LocalDate.now(), 15));
        this.tabela.add(new Subcategoria(88, "Iogurtes", LocalDate.now(), 16));
        this.tabela.add(new Subcategoria(89, "Leite", LocalDate.now(), 16));
        this.tabela.add(new Subcategoria(90, "Milkshakes", LocalDate.now(), 16));
        this.tabela.add(new Subcategoria(91, "Ovos", LocalDate.now(), 16));
        this.tabela.add(new Subcategoria(92, "Queijos", LocalDate.now(), 16));
        this.tabela.add(new Subcategoria(93, "Sobremesas Lácteas", LocalDate.now(), 16));
        this.tabela.add(new Subcategoria(94, "Pães em Geral", LocalDate.now(), 17));
        this.tabela.add(new Subcategoria(95, "Sopas em Geral", LocalDate.now(), 18));
        this.tabela.add(new Subcategoria(96, "Diversos sem Categoria", LocalDate.now(), 19));
    }
}